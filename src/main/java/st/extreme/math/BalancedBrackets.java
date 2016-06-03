package st.extreme.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BalancedBrackets {
	private static List<Character> stack;
	public static void main(String[] args) {
    char []input={'{','{','(',')','(',')','}','}','(',')','[',']'};
    
    System.out.println(balancedBrackets(input));
    for(int i=0;i<stack.size();i++){
    	System.out.println(stack.get(i));
    }
	}

	private static boolean balancedBrackets(char[] input) {
		stack= new ArrayList<Character>();
		BalancedBrackets bb= new BalancedBrackets();
		for(int i=0;i<input.length;i++){
			
			if(input[i]=='{' && bb.peek()!='}' || input[i]=='(' && bb.peek()!=')'|| input[i]=='[' && bb.peek()==']'){
				bb.push(input[i]);
			}else if(input[i]=='}' && bb.peek()=='{' || input[i]==')' && bb.peek()=='(' || input[i]==']' && bb.peek()=='['){
				bb.pop();
			}
			else{
				bb.push(input[i]);
			}
		}
		if(stack.isEmpty()) return true;
		
		return false;
		
	}
	public void push(char i) 
    {

       stack.add(0,i);
     }

     public char pop() 
     { 
        if(!stack.isEmpty()){
           char i= stack.get(0);
           stack.remove(0);
           return i;
        } else{
           return 'N';// Or any invalid value
        }
     }
     public char peek()
     {
        if(!stack.isEmpty()){
           return stack.get(0);
        } else{
           return 'N';// Or any invalid value
        }
}
}
