package String;
import java.util.*;

public class Toggle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String :");
        StringBuffer str = new StringBuffer(sc.nextLine());
        System.out.println(str);
        boolean flag = true ; //capital
        for(int i = 0 ; i <str.length() ; i++)
        {
            char ch = str.charAt(i);
            int asci = (int)ch;// converting character int ascii numbers .
            if(asci>=97)flag = false;//small letters 
            if(ch == ' ')continue;

            //converting ascii to character 
            if(flag==false)
            {
                asci -= 32;
                char cha = (char)asci;
                str.setCharAt(i,cha);
            }
            else
            {
                asci += 32;
                char cha = (char)asci;
                str.setCharAt(i,cha);
            }
        }
        System.out.println(str);
    }
}