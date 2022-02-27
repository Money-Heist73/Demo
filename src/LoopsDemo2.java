public class LoopsDemo2 {

    public static void main(String[] args) {

        //syntax while loop: while (condition) {Code}
        int i =0;
        while(i<5){
            System.out.println("Hello" +i);
            i++;
        }

        //syntax do while loop: do{Code} while(Condition)
        int j =0;
        do
        {
            System.out.println("Inside do block" +j);
            j++;
        }
        while(j<5);
    }
}
