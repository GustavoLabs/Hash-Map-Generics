public class Main {

    public static void main(String[] args) {

        Map map = new Map();

        System.out.println(map.put(1, "gustavo"));
        map.put(true, "caique");
        map.put(false, 2);
        map.put(2, 5.3);
        map.put(3, 5.3);
        map.put(4, 5.3);
        map.put(5, 5.3);
        map.put(6, 5.3);
        map.put(7, 5.3);
        map.put(8, 5.3);
        map.put(9, 5.3);
        map.put(10, 5.3);

        System.out.println(map.entrySet());

        System.out.println(map.keySet());

        System.out.println(map.values());

        System.out.println(map);

        System.out.println(map.size());

        System.out.println(map.containsKey(4));

        System.out.println(map.containsValue(5.3));
    }
}
