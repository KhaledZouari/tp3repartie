package RMIService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversionImpl extends UnicastRemoteObject  implements IConversion {
	public ConversionImpl() throws RemoteException 
	{
		super();
		
	}

	public double ConvertirMontant (double mt) throws RemoteException
	{
		return mt*3.3;
	}

}
