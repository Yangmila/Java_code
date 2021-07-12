package practice.listnode;

import java.util.Stack;

// 用栈实现队列
//请你仅使用两个栈实现先入先出队列。队列应当支持一般队列支持的所有操作（push、pop、peek、empty）：
//实现 MyQueue 类：
//void push(int x) 将元素 x 推到队列的末尾
//int pop() 从队列的开头移除并返回元素
//int peek() 返回队列开头的元素
//boolean empty() 如果队列为空，返回 true ；否则，返回 false
public class MyQueue {
    Stack<Integer> A = new Stack<>();
    Stack<Integer> B = new Stack<>();

    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        // 入队列的时候, 需要先把 B 中的元素都倒腾到 A 中, 再往 A 中插入新元素
        while (!B.isEmpty()) {
            int tmp = B.pop();
            A.push(tmp);
        }
        A.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (A.isEmpty() && B.isEmpty()) {
            return 0;
        }
        // 把 A 中的元素往 B 中倒腾. 剩下的最后一个元素就是要被出队列的元素
//        while (A.size() > 1) {
//            int tmp = A.pop();
//            B.push(tmp);
//        }
//        // 此时取到的就是 A 的最后一个元素, 也就是队首元素
//        int ret = A.pop();

        // 使用上面的代码, 在进行连续多次 pop / peek 的时候会存在问题.
        // 为了更优雅的解决这个问题, 换个角度,
        // 先把 A 的所有元素都倒腾到 B 中, 然后再通过 B 进行 pop
        while (!A.isEmpty()) {
            int tmp = A.pop();
            B.push(tmp);
        }
        // 删除 B 中的元素
        return B.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (A.isEmpty() && B.isEmpty()) {
            return 0;
        }
        while (!A.isEmpty()) {
            int tmp = A.pop();
            B.push(tmp);
        }
        // 删除 B 中的元素
        return B.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return A.isEmpty() && B.isEmpty();
    }

}
