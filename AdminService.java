
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Admin;


public interface AdminService extends Remote{
    //method signature
    // returnType methodName(args);
    Admin saveAdmin(Admin theAdmin) throws RemoteException;
    Admin updateAdmin(Admin theAdmin) throws RemoteException;
    Admin deleteAdmin(Admin theAdmin) throws RemoteException;
    Admin searchAdmin(Admin theAdmin) throws RemoteException;
    List<Admin> findAll() throws RemoteException;
    Admin login(Admin userInfo) throws RemoteException;
}
