public class basics {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(9);
        list.add(90);
        list.add(89);
        list.add(9435);
        list.add(229);
        list.add(119);
        list.add(339);
        list.add(559);
        list.add(987);
        list.add(339);
        list.add(679);
        list.add(989);
        list.add(569);
        list.add(9089);
        list.add(4099);
        list.add(2089);
        list.add(989);
        list.add(319);

        System.out.println(list.contains(765432));

        list.set(0,99);

        System.out.println("arraylist elements: ", list);


   
}
}
