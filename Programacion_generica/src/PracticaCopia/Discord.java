package PracticaCopia;


import java.io.*;
import java.util.*;

import PracticaCopia.Gamer.Nivel;


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
        if (gamers.isEmpty()) {
            System.out.println("No hay jugadores registrados.");
        } else {
            for (Gamer gamer : gamers) {
                System.out.println(gamer);
            }
        }
    }

    public void saveGamers() {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("gamers.txt"));

            for (Gamer gamer : gamers) {
                writer.println(gamer.getNick() + ";" + gamer.getEmail() + ";" + gamer.getJuego() + ";" + gamer.getNivel());
            }

            writer.close();
            System.out.println("Jugadores guardados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar los jugadores: " + e.getMessage());
        }
}
    }