import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Node <K, V>{

    private final LinkedList<Data<K, V>> list = new LinkedList<>();

    public Node(K key, V value) {
        list.add(new Data(key, value));
    }

    public Node() {
    }

    public void add(K key, V value){
        list.add(new Data<>(key, value));
    }

    public V get(Object key){
        for(Data<K, V> data : list){
            if (data.getKey() == key){
                return data.getValue();
            }
        }
        return null;
    }

    public boolean containsKey(Object key){
        for(Data<K, V> data : list){
            if (data.getKey() == key){
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(Object value){
        for(Data<K, V> data : list){
             if (data.getValue() == value){
                 return true;
             }
            }
        return false;
        }



    public int size(){
        return list.size();
    }



    public ArrayList<K> getKey(){
        ArrayList<K> k = new ArrayList<>();
        for (Data<K, V> data : list){
           k.add(data.getKey());
        }
        return k;
    }

    public  void remove(Object key){
        list.removeIf(data -> data.getKey() == key);
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        for (Data<K,V> data : list){
            result.append(data).append(" ");
        }
        return result.toString();
    }


    public void clear() {
        list.clear();
    }

    public void setValue(K key, V value) {
        for(Data<K, V> data : list){
            if (data.getKey() == key){
                data.setValue(value);
            }
        }

    }

    public Collection<V> getValue() {
        Collection<V> v = new ArrayList<>();
        for ( Data<K, V> data : list){
            v.add(data.getValue());
        }
        return v;
    }
}
