package Activite4_1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Serveur {
	private static final int PORT = 200;
	private static byte[] buffer=new byte[1024];
	public static void main(String[] args) throws IOException 
	{
		DatagramSocket Socket=new DatagramSocket(PORT);
		System.out.println("Demarrage du serveur");
		while(true)
		{
			DatagramPacket userNamePacket=new DatagramPacket(buffer,buffer.length);
			Socket.receive(userNamePacket);
			String userName=new String(userNamePacket.getData(),0,userNamePacket.getLength());
			System.out.println("client"+userNamePacket.getAddress()+" userName="+userName);
			String msgTosend="Bienvenue :"+userName;
			DatagramPacket PacketTosend=new DatagramPacket(msgTosend.getBytes(),msgTosend.length(),userNamePacket.getAddress(),+userNamePacket.getPort());
			Socket.send(PacketTosend);
		}
	}

}
