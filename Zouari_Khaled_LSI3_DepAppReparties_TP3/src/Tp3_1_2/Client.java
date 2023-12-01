package Tp3_1_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	private int nbclient;
	private static final int PORT = 200;

public static void main (String[] args)
{
	System.out.println("je suis un client");
	try 
	{
	Socket s=new Socket("localhost",PORT);
	System.out.println(new BufferedReader(new InputStreamReader(s.getInputStream())).readLine());
	
	System.out.println("donner un nombre : ");
	Scanner scanner = new Scanner(System.in);
    int op1 = scanner.nextInt();


	System.out.println("donner un 2éme  nombre : ");

	int op2 = scanner.nextInt();
	String oper;

	do {
		System.out.println("donner l'operateur (+,-,/,*)");
	     oper= scanner.nextLine();
		
	} while (!oper.equals("+") && (!oper.equals("-")) && (!oper.equals("*")) && (!oper.equals("/")));
	Operation operation = new Operation(op1,op2,oper.charAt(0));
	ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());
	oos.writeObject(operation);
	
    }
	catch (Exception e)

	{
		e.printStackTrace();

	}

}
}
