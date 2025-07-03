package stack;
import java.util.Stack;
public class CollectionFramework {
    

    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        //push
        st.push(01);
        st.push(23);
        st.push(5);
        st.push(7);
        //peek
        System.out.println(st.peek());//7
        System.out.println(st.pop());//it will print and remove 7 
        System.out.println(st);//print values of stack 
        //size
        System.out.println("size is -> " + st.size());//print  size 
        // to print last first element 
        while(st.size()>1)
        {
            st.pop();
        }
        System.out.println(st.peek());//01-->first element wlll be printed as remaining element will be removed from the stack 


        //isEmpty in stack is a boolean operation
        System.out.println(st.isEmpty());//false as stack contain one 


        /*benifits of stack 
            \it contain unlimuted size 
            array to get 0(1)T.C  0(1)S.C
            Linked list 0(n)T.C   0(1)S.c
            Stack 0(n)T.C  0(n)S.C
            
            But stack gives us discipline as we can access only top

            if stack is filled it gives us error stack overflow 
            */
    }
}
