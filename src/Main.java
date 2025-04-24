public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("Toyota", "Yaris Hatchback", "Negro", 2025);
        Vehiculo v2 = new Vehiculo("Ford", "Ranger", "Rojo", 2024);
        Vehiculo v3 = new Vehiculo("Kia", "Sportage", "Blanco", 2022);

        System.out.println("-------------INFORMACION DE VEHICULO-----------------\n");
        v1.info_vehiculo();
        v2.info_vehiculo();
        v3.info_vehiculo();

        System.out.println("\n---------ESTADO DEL VEHICULO------------\n");
        v1.frenar();
        v2.frenar();
        v3.frenar();
    }
}
