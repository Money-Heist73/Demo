public class LoopsDemo {

    public static void main(String[] args) {

        //Syntax for loop: for(variable declaration; condition; increment/decrement) {code}
        for(int i=0; i<10; i++){
            System.out.println("hello"+i);

        }

        //print table of two with the help of for loop
        for(int i=1; i<=10; i++){
            System.out.println("Printing Table of two " +i*2);
        }

        //printing table of five with the help of for loop
        for(int i=1; i<=10; i++){
            System.out.println("Printing Table of five " +i*5);
        }

        //decreasing order
        for(int i=10; i<0; i--){
            System.out.println("Hello " +i);
        }
    }
}
