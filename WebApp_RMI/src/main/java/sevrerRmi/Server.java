package sevrerRmi;

import java.rmi.Naming;

import metier.*;

public class Server {

	public static void main(String[] args) {

		try {
			System.out.println("sevrveur : construction de implimentation !");
			ObjetString rev = new ObjetString();

			System.out.println("ObjetString est dans rmi !!!!*******");

			Naming.rebind("://localhost/test", rev);

			ObjetCalcul calcul = new ObjetCalcul();

			System.out.println("ObjetCalcul est dans rmi !!!!*******");

			Naming.rebind("://localhost/test", calcul);
			System.out.println("*** en attend invocation **** ");
		} catch (Exception e) {
			System.out.println("*** erro de liaison ObjetCalcul ou ObjetString **** ");

			System.out.println(e.toString());

		}

	}

}
