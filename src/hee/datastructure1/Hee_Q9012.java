package hee.datastructure1;

import java.util.Scanner;
import java.util.Stack;

public class Hee_Q9012 {
    static Scanner scanner = new Scanner(System.in);

    public static void run(){
        int N = scanner.nextInt();

        while (N > 0){
            String string = scanner.next();

            /* [방법1] '(' ')'의 개수가 동일하면 VPS(Valid PS, 올바른 괄호 문자열) */
            int cnt = 0;
            for (int i=0; i<string.length(); i++){
                if(string.charAt(i) == '('){
                    cnt++;
                } else {
                    cnt--;
                    if (cnt == -1)
                        break;
                }
            }
            System.out.println(cnt == 0 ? "YES" : "NO");

            /* [방법2] Stack을 이용하는 방법 */
//            Stack stack = new Stack();
//
//            int i=0;
//            for (i=0; i<string.length(); i++){
//                if(string.charAt(i) == '('){
//                    stack.push('(');
//                } else {
//                    if (stack.empty()){
//                        System.out.println("NO");
//                        break;
//                    } else {
//                        stack.pop();
//                    }
//                }
//            }
//
//            if (!stack.empty()){
//                System.out.println("NO");
//            } else if (stack.empty() && i == string.length()){
//                System.out.println("YES");
//            }

            N--;
        }
    }
}
