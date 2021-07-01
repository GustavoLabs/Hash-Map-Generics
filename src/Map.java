import java.util.*;

public class Map<K, V> implements java.util.Map<K, V> {

    Node<K, V>[] arrNode;

    public Map() {
        arrNode = new Node[10];
    }

    public int hashPosition(Object key){
        return Objects.hash(key) % 10;
    }


    @Override
    public int size() {
        int sizeList = 0;
        for(Node<K, V> node : arrNode){
            sizeList += node.size();
        }
        return sizeList;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        for (Node<K, V> node : arrNode){
            return node.containsKey(key);
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (Node<K, V> node : arrNode){
            if (node.getValue() == value) {
                return node.containsValue(value);
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        int position = hashPosition(key);
        return arrNode[position].getValue();
    }

    @Override
    public V put(K key, V value) {
        int position = hashPosition(key);
        if (arrNode[position] == null){
            arrNode[position] = new Node<>();
        }
        if (arrNode[position].get(key) == null) {
            arrNode[position].add(key, value);
        } else {
            arrNode[position].setValue(value);
        }
        return arrNode[position].getValue();
    }

    @Override
    public V remove(Object key) {
        int position = hashPosition(key);
        arrNode[position].remove(key);
        return null;
    }

    @Override
    public void putAll(java.util.Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {
        for (Node<K, V> node : arrNode){
            node.clear();
        }

    }

    @Override
    public Set<K> keySet() {
        Set<K> keyList = new LinkedHashSet<>();
        for(Node<K, V> node : arrNode){
            keyList.add(node.key);
        }
        return keyList;
    }

    @Override
    public Collection<V> values() {
        Collection<V> arrValues = new ArrayList<>();
        for(Node<K, V> node : arrNode){
            arrValues.add(node.value);
        }
        return arrValues;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return new LinkedHashSet<>(Arrays.asList(arrNode));
    }

    public String toString(){
        StringBuilder resultString = new StringBuilder();
        for (Node<K, V> node : arrNode){
            resultString.append(node).append("\n");
        }

        return resultString.toString();
    }
}
