package metier;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ObjetCalcul extends UnicastRemoteObject implements ObjetCalculInterface {
	
	

	public ObjetCalcul() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int add(int a, int b) throws RemoteException {

		return a + b;
	}

}
