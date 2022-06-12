import java.util.*;
public class StackExample {
    public static void main(String[] args) {
        //Stack
        String data[] = {"Java", "PHP", "Python", "C", "C++"};
        Stack<String> s = new Stack<>();
        //Set -> add
        //Map -> put
        //push, pop, peek
        for (String word: data){
            s.push(word);
        }

        System.out.println("Stack: " + s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println("Stack: " + s);
        System.out.println("------------------");

        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
