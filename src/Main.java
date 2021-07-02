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

//        System.out.println(map);
//        System.out.println(map.values());
//        System.out.println(map.keySet());
//        System.out.println(map.size());
//        System.out.println(map.entrySet());
//        System.out.println(map.keySet());
//        map.clear();
//        System.out.println(map);

        System.out.println(map.containsKey(0) + "--------------------------");
        System.out.println(map.containsValue("8.2"));
        System.out.println(map.entrySet());
//
//        System.out.println(map.keySet());
//
//        System.out.println(map.values());
//
//        System.out.println(map);
//
//        System.out.println(map.size());
//
//        System.out.println(map.containsKey(4));
//
//        System.out.println(map.containsValue(5.3));
    }
}
