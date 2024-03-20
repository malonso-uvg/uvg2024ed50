public class MostrarAutoEnConsolaWalk<V> implements IWalk<V>{

    @Override
    public void doWalk(V actualValue) {
        Automovil auto = (Automovil)actualValue;
        System.out.println(auto.toString());
    }
    
}
