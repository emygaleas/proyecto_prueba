public class Vehiculo {
    public String marca, modelo, color;
    public int año;

    public Vehiculo(String marca, String modelo, String color, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.año = año;
    }

    public void info_vehiculo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Año: " + año);
        System.out.println("\n-------------------------------");
    }

    public void frenar() {
        System.out.println("EL AUTO " + marca + " HA FRENADO");
        System.out.println("----------------------------------");
    }
}
