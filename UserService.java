
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.User;


public interface UserService extends Remote{
    User saveUser(User theUser) throws RemoteException;
    User updateUser(User theUser) throws RemoteException;
    User deleteUser(User theUser) throws RemoteException;
    User searchUser(User theUser) throws RemoteException;
    List<User> findAll() throws RemoteException;
    User login(User userInfo) throws RemoteException;
}
