import java.util.Stack;


// насколько я понимаю программа через стэк должна выглядить так 



public class Turner {
    

    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        String result = "";
        for (Character character : str.toCharArray()) {
            stack.add(character);
        }
        while (!stack.isEmpty()) {
            result = result + stack.pop();
        }
        return result;
    }
}
