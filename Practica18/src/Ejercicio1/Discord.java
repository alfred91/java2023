package Ejercicio1;

import java.io.*;
import java.util.*;

import Ejercicio1.Gamer.Nivel;


import Ejercicio1.Gamer.Nivel;

public class Discord {
    private List<Gamer> gamers;

    public Discord() {
        gamers = new ArrayList<>();
        loadGamers();
    }

    public List<Gamer> getGamers() {
        return gamers;
    }

    public void setGamers(List<Gamer> gamers) {
        this.gamers = gamers;
    }

    public void loadGamers() {
        try (BufferedReader reader = new BufferedReader(new FileReader("gamers.txt"))) {
            gamers = reader.lines()
                    .map(line -> line.split(";"))
                    .filter(data -> data.length == 4)
                    .map(data -> new Gamer(data[0].trim(), data[1].trim(), data[2].trim(),
                            Nivel.valueOf(data[3].trim())))
                    .toList();
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
        return gamers.stream()
                .filter(gamer -> gamer.getNick().equalsIgnoreCase(nick))
                .findFirst()
                .orElse(null);
    }

    public void listGamers() {
        if (gamers.isEmpty()) {
            System.out.println("No hay jugadores registrados.");
        } else {
            gamers.forEach(System.out::println);
        }
    }

    public void saveGamers() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("gamers.txt"))) {
            gamers.forEach(gamer -> writer.println(gamer.getNick() + ";" + gamer.getEmail() + ";" + gamer.getJuego() + ";" + gamer.getNivel()));
            System.out.println("Jugadores guardados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar los jugadores: " + e.getMessage());
        }
    }
}