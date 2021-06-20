package practice;
//包含min函数的栈
//定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数，并且调用 min函数、push函数 及 pop函数 的时间复杂度都是 O(1)
//push(value):将value压入栈中
//pop():弹出栈顶元素
//top():获取栈顶元素
//min():获取栈中最小元素
import java.util.Stack;
//首先需要一个正常栈normal,用于栈的正常操作，然后需要一个辅助栈minval，专门用于获取最小值。
public class MinStack {
    Stack<Integer> normal = new Stack<>();
    Stack<Integer> minval = new Stack<>();

    public void push(int node) {
        normal.push(node);
        if (minval.isEmpty()){
            minval.push(node);
        }else {
            if (node <= minval.peek()){
                minval.push(node);
            }else {
                minval.push(minval.peek());
            }
        }
    }

    public void pop() {
        normal.pop();
        minval.pop();
    }

    public int top() {
        return normal.peek();
    }

    public int min() {
        return minval.peek();
    }
}
