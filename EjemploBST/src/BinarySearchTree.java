import java.util.Comparator;

public class BinarySearchTree<K, V> implements ITree<K, V> {

    private int count;
    private TreeNode<K, V> root;
    private Comparator<K> keyComparator;

    public BinarySearchTree(Comparator<K> keyComparator){
        this.root = null;
        this.count = 0;
        this.keyComparator = keyComparator;
    }

    @Override
    public void insert(K key, V value) {
        TreeNode<K, V> newNode = new TreeNode<K,V>(key, value);
        if (isEmpty()){ //Insert in the root
            this.root = newNode;
            this.count++;
        } else { //Insert in a leaf
            privateInsert(this.root, newNode);
        }
    }

    private void privateInsert(TreeNode<K,V> parent, TreeNode<K,V> node){
        if (parent != null){
            //0 si K del parent y K del node son iguales
            //-1 si K del node es menor a K del parent
            //1 si K del node es mayor a K del parent
            int result = this.keyComparator.compare(node.getKey(), parent.getKey());
            if (result > 0){  //1 si K del node es mayor a K del parent se va para la derecha
                if (parent.getRight() == null){ //PUedo insertarlo a la derecha
                    parent.setRight(node);
                    this.count++;
                } else {
                    privateInsert(parent.getRight(), node);
                }
            } else if (result < 0){ //-1 si K del node es menor a K del parent por lo tanto se va a la izquierda
                if (parent.getLeft() == null){ //PUedo insertarlo a la derecha
                    parent.setLeft(node);
                    this.count++;
                } else {
                    privateInsert(parent.getLeft(), node);
                }
            }
        }
    }

    @Override
    public V find(K key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'find'");
    }

    @Override
    public int count() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public V remove(K key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void Infix(IWalk walk) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Infix'");
    }

    @Override
    public void Prefix(IWalk walk) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Prefix'");
    }

    @Override
    public void Posfix(IWalk walk) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Posfix'");
    }
    
}
