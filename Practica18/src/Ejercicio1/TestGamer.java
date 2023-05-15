package Ejercicio1;

import Ejercicio1.Gamer.Nivel;

public class TestGamer {

	public static void main(String[] args) {

	        Discord discord = new Discord();
	        discord.listGamers();

	        Gamer newGamer = new Gamer("Player2", "player2@example.com", "Apex Legends", Nivel.BUENO);
	        discord.addGamer(newGamer);

	        Gamer foundGamer = discord.findGamer("Player1");
	        if (foundGamer != null) {
	            discord.removeGamer(foundGamer);
	        }

	        discord.listGamers();
	        discord.saveGamers();
	    }
}