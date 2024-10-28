package Class;

import interfaz.Room;

public class EnemyRoom implements Room {
    private int damage;

    public EnemyRoom(int damage) {
        this.damage = damage;
    }
    public EnemyRoom() {
    }

    public void enter(Heroe heroe) {
        System.out.println("un enemigo te a atacado!");
        heroe.takeDamage(damage);
    }
}  
