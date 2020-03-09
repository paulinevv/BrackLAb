//import java.util.Stack;
package Bracket;

public class BracketParser implements BracketParserIntf {

    public boolean checkBrackets(String text)
    {
        if (text.charAt(0) == '{')
            return false;

        Stack<Character> stack = new Stack<Character>();

        char c;
        for(int i=0; i < text.length(); i++) {
            c = text.charAt(i);

            if(c == '(')
                stack.push(c);
            else if(c == '{')
                stack.push(c);
            else if(c == '[')
                stack.push(c);
            else if(c == ')')
                if(stack.isEmpty())
                    return false;
                else if(stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            else if(c == '}')
                if(stack.isEmpty())
                    return false;
                else if(stack.peek() == '{')
                    stack.pop();
                else
                    return false;
            else if(c == ']')
                if(stack.isEmpty())
                    return false;
                else if(stack.peek() == '[')
                    stack.pop();
                else
                    return false;
        }
        return stack.isEmpty();

    }

}
