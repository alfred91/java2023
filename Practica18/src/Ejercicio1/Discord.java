package Ejercicio1;

import java.io.*;
import java.util.*;

import Ejercicio1.Gamer.Nivel;


public class Discord {
    private List<Gamer> gamers;

    /**
	 * @return the gamers
	 */
	public List<Gamer> getGamers() {
		return gamers;
	}

	/**
	 * @param gamers the gamers to set
	 */
	public void setGamers(List<Gamer> gamers) {
		this.gamers = gamers;
	}

	public Discord() {
        gamers = new ArrayList<>();
        loadGamers();
    }

    public void loadGamers() {
        try (BufferedReader reader = new BufferedReader(new FileReader("gamers.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    String nick = data[0].trim();
                    String email = data[1].trim();
                    String juego = data[2].trim();
                    Nivel nivel = Nivel.valueOf(data[3].trim());

                    Gamer gamer = new Gamer(nick, email, juego, nivel);
                    addGamer(gamer);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo gamers.txt: " + e.getMessage());
        }
    }

    public void addGamer(Gamer gamer) {
        if (!gamers.contains(gamer)) {
            gamers.add(gamer);
        }
    }

    public void removeGamer(Gamer gamer) {
        gamers.remove(gamer);
    }

    public Gamer findGamer(String nick) {
        for (Gamer gamer : gamers) {
            if (gamer.getNick().equalsIgnoreCase(nick)) {
                return gamer;
            }
        }
        return null;
    }

    public void listGamers() {
        for (Gamer gamer : gamers) {
            gamer.toString();
            System.out.println("-----------------------------");
        }
    }

    public void saveGamers() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("gamers.txt"))) {
            for (Gamer gamer : gamers) {
                String line = gamer.getNick() + ", " + gamer.getEmail() + ", " + gamer.getJuego() + ", " + gamer.getNivel();
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo gamers.txt: " + e.getMessage());
        }
    }


}