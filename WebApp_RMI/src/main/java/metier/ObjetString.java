package metier;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ObjetString extends UnicastRemoteObject implements ObjetStringInterface {

	public ObjetString() throws RemoteException {
		super();

	}

	@Override
	public int NbOccurrences(String c, String mot) throws RemoteException {
		int longueur = mot.length();
		int nb = 0;
		for (int i = 0; i < longueur; i++) {
			if (mot.substring(i, i + 1).equals(c)) {

				nb++;

			}
		}
		return nb;
	}

}
