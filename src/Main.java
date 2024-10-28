import java.util.Random;
import java.util.Scanner;

import Class.EmptyRoom;
import Class.EnemyRoom;
import Class.Heroe;
import Class.TreasureRoom;
import interfaz.GameObject;
import interfaz.Room;

public class Main {   
    public static void main(String[] args) {
          Random rand = new Random();
        Heroe player = new Heroe("Lance", 100);
        Room[] dungeon = {
            new EmptyRoom(),
            new EnemyRoom(rand.nextInt(100)),
            new TreasureRoom(new GameObject() {
                public void interact(Heroe player) {
                    System.out.println("has recogido una moneda!");
                }
            }),
            new TreasureRoom(new GameObject() {
                public void interact(Heroe player) {
                    System.out.println("has recogido una espada!");
                }
            }),
            new EnemyRoom(rand.nextInt(100))
        };

        Scanner scanner = new Scanner(System.in);
        for (Room room : dungeon) {
            room.enter(player);
            System.out.println("Player health: " + player.getHealth());
            if (player.getHealth() <= 0) {
                System.out.println("Game over.");
                break;
            }
        }

        System.out.println("Juego Finalizado. inventario: " + player.getInventory().size() + " items.");
    }
}
