/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.security.SecureRandom;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class OTPUtil {
    private static final String CHARACTERS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int OTP_LENGTH = 6;
    private static final SecureRandom random = new SecureRandom();
    private static final Map<Integer, String> otpStore = new HashMap<>();
    private static final Map<Integer, Long> otpExpiry = new HashMap<>();

    public static String generateOTP() {
        StringBuilder otp = new StringBuilder(OTP_LENGTH);
        for (int i = 0; i < OTP_LENGTH; i++) {
            otp.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return otp.toString();
    }

    public static void storeOTP(int userId, String otp) {
        otpStore.put(userId, otp);
        otpExpiry.put(userId, System.currentTimeMillis() + 5 * 60 * 1000); // OTP valid for 5 minutes

        // Schedule task to remove OTP after expiry time
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                otpStore.remove(userId);
                otpExpiry.remove(userId);
            }
        }, 5 * 60 * 1000);
    }

    public static boolean validateOTP(int userId, String otp) {
        if (!otpStore.containsKey(userId)) {
            return false;
        }
        boolean isValid = otpStore.get(userId).equals(otp) && System.currentTimeMillis() < otpExpiry.get(userId);
        if (isValid) {
            otpStore.remove(userId); // Remove OTP after successful validation
            otpExpiry.remove(userId);
        }
        return isValid;
    }
}

