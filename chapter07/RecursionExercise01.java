public class RecursionExercise01 {
    public static void main(String[] args) {
        T t = new T();
        int n = 2;
        
        int res = t.fibonacci(n);
        if (res != -1) {
            System.out.println("n = " + n + "对应的斐波那契数 = " + res);
        }

        int peachSum = t.peach(10);
        System.out.println("桃子数 = " + peachSum);
    }
}

class T {
    /*
     * 请使用递归的方式求出斐波那契数1,1,2,3,5,8,13...给你一个整数n，求出它的值是多
     * 思路分析
     * 1. 当n = 1 斐波那契数 是1
     * 2. 当n = 2 斐波那契数 是1
     * 3. 当n >= 3 斐波那契数 是前两个数的和
     * 4. 这里就是一个递归的思路
     */
    public int fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        } else {
            System.out.println("要求输入的n>=1");
            return -1;
        }
    }

    /*
     * 猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！
     * 以后每天猴子都吃其中的一半，然后再多吃一个。当到第10天时，
     * 想再吃时（即还没吃），发现只有1个桃子了。问题：最初共多少个桃子？
     * 
     * 思路分析 逆推
     * 1. day = 10 时 有 1个桃子
     * 2. day = 9 时 有 (day10 + 1) * 2 = 4
     * 3. day = 8 时 有 (day9 + 1) * 2 = 10
     * 4. 规律就是 前一天的桃子 = (后一天的桃子 + 1) *2//就是我们的能力
     * 5. 递归
     */
    public int peach(int days) {
        int res = 1;// 桃子数
        if (days == 1) {
            return res;
        } else {
            res = 2 * (peach(days - 1) + 1);
        }
        return res;
    }
}