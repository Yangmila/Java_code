package homework;

import java.util.ArrayDeque;
import java.util.Deque;

public class Calculate {
    public int solve (String s) {
        s = s.trim();
        Deque<Integer> stack = new ArrayDeque<>();
        int num = 0;
        char sign = '+';
        char[] charArray = s.toCharArray();

        for(int i = 0;i < charArray.length;i++){
            char c = charArray[i];
            if(c == ' '){
                continue;
            }
            if(Character.isDigit(c)){
                num = num * 10 + c - '0';
            }
            if(c == '('){
                int j = i + 1;
                int count = 1;
                while(count > 0){
                    if(charArray[j] == ')'){
                        count--;
                    }
                    if(charArray[j] == '('){
                        count++;
                    }
                    j++;
                }
                num = solve(s.substring(i + 1,j - 1));
                i = j - 1;
            }
            if(!Character.isDigit(c) || i == charArray.length - 1){
                if(sign == '+'){
                    stack.push(num);
                }else if(sign == '-'){
                    stack.push(-1 * num);
                }else if(sign == '*'){
                    stack.push(stack.pop() * num);
                }else if(sign == '/'){
                    stack.push(stack.pop() / num);
                }
                num = 0;
                sign = c;
            }
        }
        int ans = 0;
        while(!stack.isEmpty()){
            ans += stack.pop();
        }
        return ans;
    }
}
