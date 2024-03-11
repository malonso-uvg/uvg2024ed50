public interface ITree<K, V>{

    void insert(K key, V value);

    V find(K key);

    int count();

    boolean isEmpty();

    V remove(K key);

    void Infix(IWalk walk);

    void Prefix(IWalk walk);

    void Posfix(IWalk walk);
}