package Class;

import interfaz.GameObject;
import interfaz.Room;

public class TreasureRoom implements Room {
    private GameObject treasure;

    public TreasureRoom(GameObject treasure) {
        this.treasure = treasure;
    }
    public TreasureRoom() {
    }

    public void enter(Heroe heroe) {
        System.out.println("encontraste un tesoro!");
        heroe.addToInventory(treasure);
    }
}