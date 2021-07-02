public class Main {

    public static void main(String[] args) {

        Map map = new Map();

        map.put(0, "gustavo");
        map.put(1, "123154");
        map.put(2, 5.3);
        map.put(3, 'a');
        map.put(4, 5.3);
        map.put(5, 5.3);
        map.put(6, 5.3);
        map.put(7, 5.3);
        map.put(8, 5.3);
        map.put(9, 8.2);
        map.put(10, 5.3);
        map.put(10, "caique");
        map.put('g', 8.2);


        System.out.println("\t Map Size:" + map.size());
        System.out.println("\t Map keys: " + map.keySet());
        System.out.println("\t Map values: " + map.values());
        System.out.println("\t Map entrySet: " + map.entrySet());
        System.out.println("\t Map contains key 'g' ? " + map.containsKey('g') );
        System.out.println("\t Map contains value caique?" +  map.containsValue("caique"));
        System.out.println("\t Map: ");
        System.out.println(map);
    }
}
