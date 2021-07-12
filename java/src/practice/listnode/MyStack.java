package practice.listnode;

import java.util.LinkedList;
import java.util.Queue;

//用队列实现栈
//请你仅使用两个队列实现一个后入先出（LIFO）的栈，并支持普通栈的全部四种操作（push、top、pop 和 empty）。
//实现 MyStack 类：
//void push(int x) 将元素 x 压入栈顶。
//int pop() 移除并返回栈顶元素。
//int top() 返回栈顶元素。
//boolean empty() 如果栈是空的，返回 true ；否则，返回 false
public class MyStack {
    private Queue<Integer> A = new LinkedList<>();
    private Queue<Integer> B = new LinkedList<>();

    public MyStack() { }
    /** Push element x onto stack. */
    public void push(int x) {
        // 入栈的时候, 就直接往 A 中插入
        A.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        // 出栈的时候, 把 A 中的元素往 B 中倒腾. 当 A 中只剩一个元素的时候,
        // 最后这个元素就是被删除的元素
        if (A.isEmpty() && B.isEmpty()) {
            // 针对空栈的判定. 但是人家给的方法不是 Integer, 没法返回 null, 只能随便返回个值了
            // 在线 OJ 的代码咱们不要抛出异常!!!
            return 0;
        }
        while (A.size() > 1) {
            int tmp = A.poll();
            B.offer(tmp);
        }
        // 当上面的循环结束, 此时 A 中就只剩一个元素了.
        // 把这个最后的元素就作为出栈的结果即可.
        int ret = A.poll();
        // 最终完成操作之后, 要交换 A 和 B 的身份. 保证下次入栈的时候, 还是往 A 中插入.
        swapAB();
        return ret;
    }

    private void swapAB() {
        Queue<Integer> tmp = A;
        A = B;
        B = tmp;
    }

    /** Get the top element. */
    public int top() {
        // 取栈顶元素和出栈类似. 唯一的区别就是, 出栈操作是把 A 的最后一个元素给删了.
        // 取栈顶元素操作是把 A 的最后一个元素还要再塞回到 B 中.
        // 出栈的时候, 把 A 中的元素往 B 中倒腾. 当 A 中只剩一个元素的时候,
        // 最后这个元素就是被删除的元素
        if (A.isEmpty() && B.isEmpty()) {
            // 针对空栈的判定. 但是人家给的方法不是 Integer, 没法返回 null, 只能随便返回个值了
            // 在线 OJ 的代码咱们不要抛出异常!!!
            return 0;
        }
        while (A.size() > 1) {
            int tmp = A.poll();
            B.offer(tmp);
        }
        // 当上面的循环结束, 此时 A 中就只剩一个元素了.
        // 把这个最后的元素就作为出栈的结果即可.
        int ret = A.poll();

        // 这个操作是唯一的区别.
        B.offer(ret);

        // 最终完成操作之后, 要交换 A 和 B 的身份. 保证下次入栈的时候, 还是往 A 中插入.
        swapAB();
        return ret;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return A.isEmpty() && B.isEmpty();
    }
}
