package homework;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
        Queue<Integer> A;
        public RecentCounter() {
            A = new LinkedList<>();
        }

        public int ping(int t) {
            A.add(t);
            while (A.peek() < t - 3000)
                A.poll();
            return A.size();
    }
}
