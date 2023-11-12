package rmiClient;

import java.rmi.Naming;

import RMIService.IConversion;

public class ConversionClient {
	public static void main(String[] args) {
		try {

			IConversion remoteObj = (IConversion) Naming.lookup("rmi://localhost:1099/ObjetDistant");

			double result = remoteObj.ConvertirMontant(100);

			System.out.println("Result from server: " + result);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}