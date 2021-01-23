import java.util.*;
import java.io.*;




public class DuplicacyOfBrackets {

    public static void algorithmForDuplicacy(String str)
    {
Stack <Character> stack = new Stack<>(); // using stack data structure

for (int i = 0; i<str.length() ; i++)
{
char getChar = str.charAt(i);

if (getChar == ')')
{
if(stack.peek() == '(')
{
    System.out.println("true");
    return;
}else{

    while (stack.peek() != '(')
    {
        stack.pop();
    }
stack.pop();

}


}else
{
  stack.push(getChar);

}

}
        System.out.println("false");

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an expression");
        String string = scanner.nextLine();

        algorithmForDuplicacy(string);





    }


}
