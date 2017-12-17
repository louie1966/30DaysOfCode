package exceptionpractice;

public class ExceptionPractice {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] intArray = new int[10];
        System.out.println("exceptionpractice.ExceptionPractice.main()");
       
        try {
            System.out.println(intArray[10]);
        } catch (Exception e) {
            System.out.println("Not existing index: " + e);
        }

    }

}
