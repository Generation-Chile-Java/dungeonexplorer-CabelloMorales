package Class;

public class Inventory {
    //datos
    private String name;
    private int cantidad;
    private boolean activo;
    //inicial
    //constructor vacio
    public Inventory(){}
    //constructor con parámetros
    public Inventory(String name, int cantidad){
        this.name = name;
        this.cantidad = cantidad;
        this.activo = true;
    }

    //Atributos
    public String SacarItem(String name) 
    {
        if (this.name.equals(name) && cantidad == 0) {
            this.activo = false;
            setcantidad(-1);
            if (this.cantidad == 0) {
                DescativarItem();
            }
            return "no queda del item " +  name;
        }else{
            
            return "item sacado";
           
        }
    }
    public void DescativarItem(){
        setActivo(false);
    }

    //Getter and Setter name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Getter and Setter cantidad
    public int getcantidad() {
        return cantidad;
    }
    public void setcantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean  isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}
