import java.util.*;
public class namelength {
    public static void main(String[] args){
    String[]name={"anbu","abi","vishnu","guna"};
    int[][]marks={{60,80,68,93,96},{69,85,85,95,86},{98,68,97,92,99},{85,58,68,49,97},{85,79,89,57,85}};
    for(int i=0;i<name.length;i++)
    {
        System.out.println("name="+name[i]);
        double total=0;
        for(int j=0;j<marks[i].length;j++)
        {
            System.out.print(marks[i][j]+" ");
            total+=marks[i][j];
        }
        System.out.println();
        System.out.println("Average:"+(total/5)+"%");
        System.out.println();

    }
    }
    
}
