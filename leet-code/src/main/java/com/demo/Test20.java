package com.demo;

import java.util.Stack;

public class Test20 {
    public static void main(String[] args) {



    }

    public boolean isValid(String str) {
        boolean result = true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);
            if(curChar == '(' || curChar == '[' || curChar == '{' ){
                stack.add(curChar);
            }else if(!stack.isEmpty()){
                char temp = stack.pop();
                if(curChar==')' && temp != '('){
                    return false;
                }else if(curChar==']' && temp != '['){
                    return  false;
                }else if(curChar=='}' && temp != '{') {
                    return false;
                }
            }else{
                return false;
            }
        }
        if(!stack.isEmpty()){
            result = false;
        }
        return  result;
    }
}
