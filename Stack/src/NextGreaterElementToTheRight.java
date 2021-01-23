


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class NextGreaterElementToTheRight {

    public static ArrayList<Integer> algo(ArrayList<Integer> list) {
        ArrayList<Integer> nge = new ArrayList<>(list.size());
        Stack<Integer> stack = new Stack<>();

        nge.add(list.size() - 1, -1);


        stack.push(list.get(list.size() - 1)); // adding last element to the stack

        for (int i = list.size() - 2; i >= 0; i--) {
            while (stack.size() > 0 && list.get(i) >= stack.peek()) {
                stack.pop();
            }

            if (stack.size() > 0) {
                nge.add(i, stack.peek());

            } else {

                nge.add(i, -1);

            }
            stack.push(list.get(i));

        }

        return nge;


    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            list.set(i, Integer.parseInt(br.readLine()));
        }
        ArrayList<Integer> returnVal = algo(list);
        StringBuilder sb = new StringBuilder();

        for (int val : returnVal) {
            sb.append(val + "\n");
        }
        System.out.println(sb);


    }
}
