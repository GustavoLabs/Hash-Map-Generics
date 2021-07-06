import java.util.*;

public final class Map<K, V> implements java.util.Map<K, V> {

    private static final Map MAP = new Map();
    private final ArrayList<Node<K, V>> arrNode;

    private Map() {
        arrNode = new ArrayList<>();
        for (int i = 0; i<10; i++){
        arrNode.add(new Node<>());
        }
    }

    public static Map getInstance(){
        return MAP;
    }

    public int hashPosition(Object key){
        return (Objects.hash(key)) % 10;
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
            if (node.containsKey(key)){
            return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (Node<K, V> node : arrNode){
            if (node.containsValue(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        int position = hashPosition(key);
        return arrNode.get(position).get(key);
    }

    @Override
    public V put(K key, V value) {
        int position = hashPosition(key);
        if (arrNode.get(position).get(key) == null) {
            arrNode.get(position).add(key, value);
        } else {
            arrNode.get(position).setValue(key, value);
        }
        return arrNode.get(position).get(key);
    }

    @Override
    public V remove(Object key) {
        int position = hashPosition(key);
        arrNode.get(position).remove(key);
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
           keyList.addAll(node.getKey());
    }
        return keyList;
    }

    @Override
    public Collection<V> values() {
        Collection<V> arrValues = new ArrayList<>();
        for(Node<K, V> node : arrNode){
           arrValues.add(node.getValues());
        }
        return arrValues;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> listEntry = new LinkedHashSet<>();
        for (Node<K, V> node : arrNode){
            listEntry.add(node.returnEntryMap());
        }
        return listEntry;

    }

    public String toString(){
        StringBuilder resultString = new StringBuilder();
        for (Node<K, V> node : arrNode){
            resultString.append(node).append("\n");
        }

        return resultString.toString();
    }
}
