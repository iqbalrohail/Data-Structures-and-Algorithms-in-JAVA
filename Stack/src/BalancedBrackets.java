import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static boolean closingConditions(Stack<Character> stack , char closingBracket)
    {

        if(stack.size() == 0)
            return false;
        else if(stack.peek() != closingBracket)
        {
           return false;
        }
        else{
            stack.pop();
            return true;
        }

    }


    public static void algorithmForBalancedBrackets(String str)
    {
        Stack <Character> stack = new Stack<>();

        for(int i = 0 ; i<str.length() ; i++)
        {
            char character = str.charAt(i);

            if (character == '(' || character == '{' || character == '[')
            {
                stack.push(character);

            }
            else if (character == ')'){

                boolean result = closingConditions(stack , '(');
                if(!result)
                {
                    System.out.println(false);
                    return;
                }




            }
            else if (character == '}'){
                boolean result = closingConditions(stack , '{');
                if(!result)
                {
                    System.out.println(false);
                    return;
                }

            }
            else if (character == ']'){
                boolean result = closingConditions(stack , '[');
                if(!result)
                {
                    System.out.println(false);
                    return;
                }

            }

        }
if (stack.size() == 0)
{
    System.out.println(true);
}else
{
    System.out.println(false);
}


    }


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an expression");
        String string = scanner.nextLine();

        algorithmForBalancedBrackets(string);
    }

}
