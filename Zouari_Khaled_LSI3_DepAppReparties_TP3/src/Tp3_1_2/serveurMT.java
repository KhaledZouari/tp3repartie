package Tp3_1_2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class serveurMT extends Thread {
	private int nbclient;
	private static final int PORT = 200;

	public static void main(String[] args) {
		new serveurMT().start();
	}

	public void run() {
		try {
			ServerSocket ss = new ServerSocket(200);
			while (true) {
				Socket s = ss.accept();
				new ClientProcess(s, ++nbclient);
				System.out.println("le client num " + nbclient + "est connecté");

			}
		} catch (Exception e)

		{
			e.printStackTrace();

		}
	}
}


