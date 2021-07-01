import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Node <K, V> implements Map.Entry<K,V> {

     protected K key;
     protected V value;

    private final List<Node<K, V>> list = new LinkedList<>();

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public Node() {
    }

    public void add(K key, V value){
        list.add(new Node<>(key, value));
    }

    public V get(K key){
        for(Node<K, V> node : list){
            if (node.key == key){
                return node.value;
            }
        }
        return null;
    }

    public boolean containsKey(Object key){
        for(Node<K, V> node : list){
            if (node.getKey() == key){
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(Object value){
        for(Node<K, V> node : list){
             if (node.getValue() == value){
                 return true;
             }
            }
        return false;
        }



    public int size(){
        return list.size();
    }

    public void setKey(K key) {
        this.key = key;
    }

    public  void remove(Object key){
        list.removeIf(node -> node.key == key);
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        for (Node<K,V> node : list){
            result.append(node.nodeToString()).append(" ");
        }
        return result.toString();
    }

    @Override
    public final K getKey(){
        return key;
    }

    @Override
    public final V getValue(){
        return value;
    }

    public final String nodeToString(){
        return key + "=" + value;
    }

    @Override
    public final V setValue(V newValue) {
        V oldValue = value;
        value = newValue;
        return oldValue;
    }

    public void clear() {
        list.clear();
    }
}
