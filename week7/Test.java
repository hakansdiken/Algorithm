import java.util.*;

public class Test {
    public static void main(String[] args) {
        // 3,5,8,2,1,9,3
        // removeAll(queue, value)
        int data[] = {18,3,5,6,2,9};
        Queue<Integer> q = new LinkedList<>();
        for (int n: data){
            q.add(n);
        }
        System.out.println(q);
        removeAll(q,2);
        System.out.println("New Queue : " + q);
    }
    public static void removeAll(Queue<Integer> q, int value) {
        int size = q.size();
        for (int i=0; i<size; i++){
            int n = q.remove();
            System.out.println(n + " elemanı çıkartıldı");
            System.out.println("Current queue: " + q);
            if (n!=value){
                q.add(n);
                System.out.println(n + " elemanı eklendi");
            }
        }
    }
}
