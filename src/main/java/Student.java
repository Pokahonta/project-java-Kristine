import org.w3c.dom.ls.LSOutput;

public class Student {
    public String Name = "Kristine", surName = "Tene";{
        System.out.println(Name + surName + "!");
    }


    public static void main(String[] args) {
        System.out.println("Hello, Student!");

    SomeStudFun functions = new SomeStudFun();
    String text = functions.getWelcomeText ("Kristine Tene");

        System.out.println(text);
   }


}
