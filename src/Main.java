import Class.Heroe;
import Class.Inventory;

public class Main {   
    
    public static void main(String[] args) {    
            Inventory[] equipo = {
                new Inventory("manzana", 1),
                new Inventory("platano", 1),
                new Inventory("pan", 1)
            };
        Heroe Lance = new Heroe("Lance",100,equipo);
        System.out.println(Lance.getName());
        System.out.println(Lance.getHealth());
        Inventory[] equipoLance = Lance.getInventory();
        for (Inventory inventory : equipoLance) {
            System.out.println(inventory.getName());
        }
        System.out.println(Lance.Dañorecibido(60));
        System.out.println(Lance.getHealth());

    }
}