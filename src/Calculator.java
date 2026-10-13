import java.util.*;

public class Calculator {
    public static double addition(double num1,double num2){
        return num1+num2;
    }

    public static double subtraction(double num1,double num2){
        return num1-num2;
    }

    public static double multiplication(double num1, double num2){
        return num1*num2;
    }

    public static double division(double num1, double num2){
        if (num2 ==0){
            throw new ArithmeticException(
                    "Division by zero is not allowed."
            );
        }
        return num1/num2;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        boolean running = true;

        while(running){
            System.out.println("\n\n===============Basic Calculator================");
            System.out.println("\n\t[01]. Addition");
            System.out.println("\n\t[02]. Subtraction");
            System.out.println("\n\t[03]. Division");
            System.out.println("\n\t[04]. Multiplication");
            System.out.println("\n\t[05]. Exit");

            System.out.print("\nSelect an option to continue: ");

            try{
                int choice=input.nextInt();

                if (choice==5){
                    running =false;
                    System.out.println("Thank you for using Calculator!");
                    continue;
                }

                if (choice<1 || choice>5) {
                    System.out.println("Invalide menu option! Try again...");
                    continue;
                }

                System.out.print("Enter your first number : ");
                double num1=input.nextDouble();

                System.out.print("Enter your second number : ");
                double num2=input.nextDouble();

                double result;

                switch (choice){
                    case 1:
                        result = addition(num1,num2);
                        break;

                    case 2:
                        result = subtraction(num1,num2);
                        break;

                    case 3:
                        result = division(num1,num2);
                        break;

                    case 4:
                        result = multiplication(num1, num2);
                        break;

                    default:
                        continue;
                }
                System.out.println("Result : "+result);

            }catch (InputMismatchException e){
                System.out.println("Invalid input! Please enter numbers only...");
                input.nextLine();
            }catch (ArithmeticException e){
                System.out.println("Error : "+ e.getMessage());
            }
        }

        input.close();
    }
}