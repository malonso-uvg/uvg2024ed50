public class Automovil {
    String marca;
    int modelo;
    String linea;
    String placa;
    double precio;

    public Automovil(String marca, int modelo, String linea, String placa, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.linea = linea;
        this.placa = placa;
        this.precio = precio;
    }

    @Override
    public String toString(){
        return "Auto placa: " + placa + "marca: " + marca + " Modelo: " + modelo + " Linea " + linea + " Precio: " + precio;
    }
}
