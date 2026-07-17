import java.util.Scanner;

public class exception {
    try{
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int result=a/b;
        System.out.print(result);
    }
    catch (ArithmeticException ae){
        System.out.println("Cannot divide by zero");
    }catch(Exception e){
        System.out.println("Other exceptions");
    }
}

