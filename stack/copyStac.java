package stack;

import java.util.Stack;
import java.util.Scanner;

public class copyStac{
    public static void main(String[] args) {
        //copy from one stack to another 
        Stack<Integer> st = new Stack<>();
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many element to push in stack : ");
        n = sc.nextInt();
        for(int i = 0 ; i<n ; i++)
        {
        System.out.println("enter the number : ");
        int a = sc.nextInt();
        st.push(a);
        }
        System.out.println("last Elment you entered is : ");
        //last element of stack 
        System.out.println(st.peek());
        //to print stack 
        System.out.println(st);


        // To reverse the stack
        System.out.println("reverse : "); 
        int sizee = st.size();
        Stack<Integer> rt = new Stack<>();
        while(!st.empty())
        {
            rt.push(st.pop());
        }
        System.out.println(rt);

        // to move to same order 
        System.out.println("same order : ");
        while(rt.size()>0)
        {
            st.push(rt.pop());
        }
        System.out.println(st);
        //but now rt is empty


        // to insert at the bottom
        //use another stack pop al element to another stack then whem empty push in it 
        //and then push again all elements in it from another stack 
        System.out.println("insert at bottom : ");
        while(!st.isEmpty())
        {
            rt.push(st.pop());
        } 
        st.push(5);//some number that we have to insert at bottom 
        while (!rt.isEmpty())
        {
            st.push(rt.pop());
        }
        System.out.println(st);// 5 will be at bottom

    }
}
