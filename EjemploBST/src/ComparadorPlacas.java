import java.util.Comparator;

public class ComparadorPlacas<K> implements Comparator<K>{

    @Override
    public int compare(K o1, K o2) {
        String placa1 = o1.toString();
        String placa2 = o2.toString();
        return placa1.compareTo(placa2);
    }
    
}
