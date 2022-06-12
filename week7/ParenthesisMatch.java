import java.util.*;
public class ParenthesisMatch {
    public static void main(String[] args) {
        // (a+(b*c)-d) --> dengeli
        // (a + (d-e) + b --> dengesiz
        Scanner input = new Scanner(System.in);
        System.out.println("Konrol etmek istediğiniz ifadeyi giriniz : ");
        String exp = input.next();
        if(isMatching(exp)){
            System.out.println("Dengelidir.");
        }
        else{
            System.out.println("Dengeli değildir.");
        }
    }
    public static boolean isMatching(String exp){
        Stack<Character> s = new Stack<>();

        for (int i = 0; i< exp.length(); i++){
            if (exp.charAt(i)=='('){
                s.push(exp.charAt(i));
            }
            else if(exp.charAt(i)==')'){
                if (!s.isEmpty()){
                    s.pop();
                }
                else
                    return false;
            }
        }
        return (s.isEmpty());
    }
}
