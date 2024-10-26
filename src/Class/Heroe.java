package Class;

public class Heroe extends Inventory {

    private  String name;

    private int health;

    private Inventory[] inventory;

    public  Heroe() {}

    public  Heroe(String name, int health, Inventory[] inventory) {
        this.name = name;
        this.health = health;
        this.inventory = inventory;
    }

    public  String Dañorecibido(int dañoRecibido) 
    {
        setHealth(dañoRecibido);
        return "El héroe " + name + " ha recibido " + dañoRecibido  + " de daño.";

    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return this.health;
    }

    private void setHealth(int health) {
        this.health = this.health-health;
    }

    public Inventory[] getInventory() {
        return this.inventory;
    }

    public void setInventory(Inventory[] inventory) {
        this.inventory = inventory;
    }


}
