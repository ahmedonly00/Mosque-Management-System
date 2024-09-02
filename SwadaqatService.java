
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Swadaqat;


public interface SwadaqatService extends Remote{
    Swadaqat saveSwadaqat(Swadaqat theSwadaqat) throws RemoteException;
    Swadaqat updateSwadaqat(Swadaqat theSwadaqat) throws RemoteException;
    Swadaqat deleteSwadaqat(Swadaqat theSwadaqat) throws RemoteException;
    Swadaqat searchSwadaqat(Swadaqat theSwadaqat) throws RemoteException;
    List<Swadaqat> findAll() throws RemoteException;
}
