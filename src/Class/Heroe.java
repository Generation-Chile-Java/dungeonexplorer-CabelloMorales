package Class;

import java.util.ArrayList;
import java.util.List;

import interfaz.GameObject;

public class Heroe {

    private String name;
    private int health;
    private List<GameObject> inventory;

    public Heroe(String name, int health) {
        this.name = name;
        this.health = health;
        this.inventory = new ArrayList<>();
    }
    public Heroe() {
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void addToInventory(GameObject item) {
        inventory.add(item);
    }

    public List<GameObject> getInventory() {
        return inventory;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }
}
