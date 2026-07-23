import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String or Name");
        String Name=sc.nextLine();
        int vow=0;
        int con=0;
        for(int i=0;i<Name.length();i++)
        {
            char ch=Name.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vow=vow+1;
            }
            else{
                con=con+1;
            }
        }
        System.out.println("vowles="+vow);
        System.out.println("constant="+con);
        }
        
    }
