import javax.xml.namespace.QName;

 public class Main {
     public static void main(String[] args) {
         System.out.println("Hello, World!");

         SomeFunctions functions = new SomeFunctions();
         String text = functions.getWelcomeText("Valera");
         System.out.println(text);
     }
 }



