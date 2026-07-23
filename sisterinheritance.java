class myfather{
    void display(){
        System.out.println("My Father is a Rich man");
    }
}
class mysister extends myfather {
    void show(){
        System.out.println("My mysister in a business woman");
    }
}

class me extends mysister{
    void display1(){
       System.out.println("I M the world happiest person");
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
