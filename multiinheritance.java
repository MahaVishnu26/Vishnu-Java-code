class mygrandpa{
    void display(){
        System.out.println("My grandpa is a Rich man");
    }
}
class myfather extends mygrandpa {
    void show(){
        System.out.println("My father in a business man");
    }
}

class me extends myfather{
    void display1(){
       System.out.println("I M billinor");
    }
}
    public class Main{
        public static void main(String[] args){
            me obj=new me();
            obj.display();
            obj.show();
            obj.display1();
        }
    }
