class parent
{
    void display(){
        System.out.println("This is thge parent class");
    }
}
class child extends parent
{
    void show()
    {
        System.out.println("This is the child");
    }
}
    public class inheritance
    {
        public static void main(String[] args)
        {
            child obj=new child();
            parent ob= new parent();
            obj.display();
            obj.show();
        }
    }
