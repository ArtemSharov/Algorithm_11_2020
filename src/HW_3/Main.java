package HW_3;

public class Main {
    public static void main(String[] args) {
        System.out.println("exercise 1");

        revers("Hello"); //exercise 1

        System.out.println();
        System.out.println("exercise 2");
        MyDeque<Integer> deque = new MyDeque<>(4);
        System.out.println(deque);
        deque.insertLeft(5);
        System.out.println(deque);


        deque.insertRight(7);
        System.out.println(deque);
        deque.insertLeft(3);
        System.out.println(deque);
        deque.insertRight(8);
        System.out.println(deque);


        //System.out.println(deque.removeRight());
        //System.out.println(deque);
        System.out.println(deque.removeLeft());
        System.out.println(deque);
        System.out.println(deque.removeLeft());
        System.out.println(deque);
        System.out.println(deque.removeLeft());
        System.out.println(deque);





    }

    public static void revers(String str){
        char[] temp = str.toCharArray();
        MyStack<Character> stack = new MyStack<>();
        for (int i = 0; i < temp.length ; i++) {
            stack.push(temp[i]);
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(stack.pop());
        }
    }
}
