import java.util.Comparator;

public class ComparadorCadenas<String> implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        
        // TODO Auto-generated method stub
        return (-1)*o1.toString().compareTo(o2.toString());
    }
    
}
