package Activite4_1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		DatagramSocket clientSocket = null;
		try {
			// Créez un socket UDP pour le client
			clientSocket = new DatagramSocket();

			String clientName;
			System.out.println("donner le nom du client");
			Scanner scanner = new Scanner(System.in);
			clientName = scanner.nextLine();

			// Convertir le nom du client en tableau d'octets
			byte[] sendData = clientName.getBytes();

			// Spécifiez l'adresse IP et le port du serveur
			InetAddress serverAddress = InetAddress.getByName("localhost"); 
			int serverPort = 200;
            
			// Créer un paquet pour envoyer les données au serveur
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);

			// Envoyer les données au serveur
			clientSocket.send(sendPacket);

			byte[] receiveData = new byte[1024];

			// Créer un paquet pour recevoir la réponse du serveur
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

			// Attendre la réponse du serveur
			clientSocket.receive(receivePacket);

			// Récupérer et afficher la réponse du serveur
			String Message = new String(receivePacket.getData(), 0, receivePacket.getLength());
			System.out.println("la reponse du serveur : " +Message);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (clientSocket != null && !clientSocket.isClosed()) {
				clientSocket.close();
			}
		}
	}

}
