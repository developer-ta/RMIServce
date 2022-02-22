package metier;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ObjetCalculInterface {
	public int add(int a, int b) throws RemoteException;

}
