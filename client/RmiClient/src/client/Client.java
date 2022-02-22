package client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import metier.Compte;
import rmi.IBanqueRemote;

public class Client {

	public static void main (String[] args) {
		
		try {
			
			IBanqueRemote stu = (IBanqueRemote) Naming.lookup("rmi://localhost:1099/bank");
			System.out.println(stu.conversion(10000));
			System.out.println("Consultation d'un compte");
			Compte cp = stu.consulteCompte(1);
			System.out.println("Code : " + cp.getCode());
			System.out.println("Solde . " + cp.getSolde());
			System.out.println("Date de création : " + cp.getDateCreation());
			System.out.println("Liste des comptes");
			List<Compte> cptes = stu.listeComptes();
			
			for(Compte compte : cptes) {
				System.out.println("==============================");
				System.out.println("Code : " + compte.getCode());
				System.out.println("Solde : " + compte.getSolde());
				System.out.println("Date de création : " + compte.getDateCreation());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
