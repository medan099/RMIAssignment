import java.rmi.Remote;
import java.rmi.RemoteException;

import java.rmi.Remote;
import java.rmi.RemoteException;


    public interface MyInterface extends Remote {
        String  reverse(String ch)throws RemoteException;
        char  minAsc(String ch)throws RemoteException;
        String  UpperLower(String ch)throws RemoteException;
}
