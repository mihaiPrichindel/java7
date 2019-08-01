public class Test {
   final static int Y = 0;
   static int x = 2;

   private static void  myMethod(int x){
        x = 10;
    }

    public static void main(String [] args){
        // passed by value
        myMethod(x);
        System.out.println("Resultat " + x);
    }
}
