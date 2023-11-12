package RMIService;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IConversion extends Remote 
{
	public double ConvertirMontant(double mt)throws RemoteException;

}
