import java.util.*;
public class QueueExample {
    public static void main(String[] args) {
        String data[] = {"Java", "PHP", "Python", "C", "C++"};

        Queue<String> q = new LinkedList<>();

        //Stack -> push,pop
        //Queue -> add,remove,size,isEmpty
        for (String words: data){
            q.add(words);
        }
        System.out.println("Queue: " + q);
        System.out.println("Peek : " + q.peek());
        System.out.println("Size : " + q.size());
    }
}
