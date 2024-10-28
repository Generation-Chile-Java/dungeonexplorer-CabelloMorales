package Class;

import interfaz.Room;


public class EmptyRoom implements Room {
    public void enter(Heroe heroe) {
        System.out.println("has entrado a una sala vacia");
    }
}
     
