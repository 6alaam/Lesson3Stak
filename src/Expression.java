public class Expression {
    private String exp;
    public Expression(String exp){
        this.exp =exp;
    }

    public boolean checkBracked(){
        MyStack<Character> stack = new MyStack<>(exp.length());
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(' || ch == '{' ||ch == '[' ) {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' ||ch == ']' ){
                if (stack.isEmpty()){
                    System.out.println("Error in " + i + "position");
                    return false;
                }
                char top = stack.pop();
                if (ch == ')' && top != '(' || ch == '}' && top != '{' ||ch == ']' && top != '[' ){
                    System.out.println("Error in " + i + "position: braket doesn't math");
                    return false;
                }

                }
            }

        if(!stack.isEmpty()){
            System.out.println("Error: bracket doesn't math");
            return false;
        }
        return true;



        }
    }

