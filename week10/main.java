public class main {
    public static void main(String[] args) {
        LinkedIntList linklist = new LinkedIntList();
        linklist.add(5);
        linklist.add(7);
        linklist.add(9);
        System.out.println(linklist.toString());
        //linklist.remove(2);
        //System.out.println(linklist.toString());
        linklist.add(0,11);
        System.out.println(linklist.toString());
        linklist.add(2,15);
        System.out.println(linklist.toString());
        int count = linklist.size();
        System.out.println(count);
    }
}
