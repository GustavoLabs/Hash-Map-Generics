import java.util.Map;

public class Data<K, V> implements Map.Entry<K,V> {

        private final K key;
        private V value;

        public Data(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public String toString(){
            return "Key:" + key + " - Value:" + value + "  || ";
        }

        public K getKey() {
            return key;
        }

    public V getValue() {
            return value;
        }

        public V setValue(V value) {
            this.value = value;
            return value;
        }
    }


