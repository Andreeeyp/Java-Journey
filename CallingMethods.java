public class CallingMethods {
    public static void main(String []args){
        sayHello();
    }
    static void sayHello(){
        System.out.println("Hello");
    }
    /* ADD NUMBERS USING METHODS WITH ARGUMENTS
    public static void main (String[] args){
     add(5,10);
    }
    static void add(int num1, int num2){
     System.out.println(num1 + num2);
     OUTPUT: 15
     */

    /*
    public staic void main (String[] args){
     greet("Mark", 19);
    }
    static void greet(String name, int age){

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");
     */

    /* SHORT VERSION
    public static void main (String[] args){
        greet("Mark", 19);
        }
        static void greet(String name, int age){
          print("Hello " + name);               CALLING PRINT METHOD INSIDE THIS METHOD
        print("You are " + age + " years old.");
        }
        static void print(String word) {
        System.out.println(word);
        }
     */

    /* METHODS WITH RETURN
    public static void main(String []args){
       int sum = add(5,10);
       System.out.println(sum);
    }
    static void add(int num1, int num2){
    return num1+num2;
    }
     */

    /* RETURNING BOOLEAN EXAMPLE
    public static void main (String[] args) {
        System.out.println(isLegalAge(18));
   }
   static boolean isLegalAge(int age){
    if(age >= 18) return true;
    else return false;
    }
     */

    /* OVERLOADING METHODS
    public static void main(String[] args){
    System.out.println(add(5,2));
    System.out.println(add(5,2,3));
    System.out.println(add(5.5,2.5));
    }
        static double add(double num1, double num2){
        return num1 + num2;
        }

        static int add(int num1, int num2){
        return num1 + num2;
        }

        static int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
        }
     */


}

