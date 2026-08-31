package server.net.packet.incoming;


import server.model.players.Client;
import server.net.packet.PacketType;


public class IdleLogout implements PacketType {
	
	@Override
	public void processPacket(Client c, int packetType, int packetSize) {
		//if (!c.playerName.equalsIgnoreCase("Sanity"))
			//c.logout();
	}
}