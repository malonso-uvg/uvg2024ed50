public class Automovil {
    public String marca;
    public int modelo;

    public Automovil(String marca, int modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString(){
        return "Auto marca: " + marca + " modelo " + modelo;
    }
}
