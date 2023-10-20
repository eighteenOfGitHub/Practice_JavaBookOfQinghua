package bar13_6;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteSubject extends Remote {
    public double getArea() throws RemoteException;
}
