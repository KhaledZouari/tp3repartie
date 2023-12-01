package Tp3_1_2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientProcess extends Thread {
	private int numclient;
	private Socket s;

	public ClientProcess(Socket s, int numclient) {
		this.s = s;
		this.numclient = numclient;
	}

	public void run() {
		try {
			new PrintWriter(s.getOutputStream(), true).println("Bienvenue,vous etes le client num" + numclient);
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
