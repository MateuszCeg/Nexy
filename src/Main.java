public class Main {
    public static void main(String[] args) {
        String one = "1";
        String two = "2";
        String three = "3";
        CustomList<String> list= new CustomList<>();
        list.addFirst(one);
        list.addLast(three);
        list.addFirst(two);
        System.out.println(list);
    }
}