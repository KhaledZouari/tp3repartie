package rmiServer;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import RMIService.ConversionImpl;

public class ConversionServer 
{
	public static void main(String[] args)
	{
		try {
			
			LocateRegistry.createRegistry(1099);
	
			ConversionImpl od = new ConversionImpl();
			
			
			Naming.rebind("rmi://localhost:1099/ObjetDistant", od);
		
		
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
