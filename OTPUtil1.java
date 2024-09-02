/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author ELITEBOOK
 */
public class OTPUtil1 {
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

    public static void storeOTP(int adminId, String otp) {
        otpStore.put(adminId, otp);
        otpExpiry.put(adminId, System.currentTimeMillis() + 5 * 60 * 1000); // OTP valid for 5 minutes

        // Schedule task to remove OTP after expiry time
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                otpStore.remove(adminId);
                otpExpiry.remove(adminId);
            }
        }, 5 * 60 * 1000);
    }

    public static boolean validateOTP(int adminId, String otp) {
        if (!otpStore.containsKey(adminId)) {
            return false;
        }
        boolean isValid = otpStore.get(adminId).equals(otp) && System.currentTimeMillis() < otpExpiry.get(adminId);
        if (isValid) {
            otpStore.remove(adminId); // Remove OTP after successful validation
            otpExpiry.remove(adminId);
        }
        return isValid;
    }
}
