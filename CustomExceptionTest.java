class NegativeAgeException extends Exception{
   public NegativeAgeException(String message){
      super(message);
    /*try{
       throw new NegativeAgeException("Age Cannot be neagtive");
    }
    catch(NegativeAgeException e){
       System.out.println(e);
    }*/
   }
 }


public class CustomExceptionTest {

    public static void main(String[] args) throws Exception{

        System.out.println("Enter Age: ");
        int age = Integer.parseInt(System.console().readLine());

        if (age < 0){
            throw new NegativeAgeException("Age cannot be negative :" +age);
        }else{
            System.out.println("Age entered is " + age);
        }
    }
}
