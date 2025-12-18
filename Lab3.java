import java.util.Random;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random randomGenerator= new Random();
        int r= randomGenerator.nextInt();
// s;enario1
        int h = randomGenerator.nextInt(24);
        int m = randomGenerator.nextInt(60);
        System.out.println( h +":" + m);
//senario2

        System.out.println(" Enter Your Student ID: ");
        long ıd = sc.nextLong();

        if ( ıd%2 == 0 && ıd%3 != 0 ){
            System.out.println("Student is in ALPHA TEAM!");
        }
        else if ( ıd%5 == 0 || ıd%7 == 0) {
            System.out.println ("Student is in BETA TEAM!");}

            else if ( ıd%9 > 5 ) {
                System.out.println ("Student is in TETHA TEAM!");
        }
            else {
            System.out.println ("Student is in SİGMA TEAM!");
        }
            // senario 3
        int number1= randomGenerator.nextInt(1000);
            System.out.println(number1 );
            int number2 = randomGenerator.nextInt(1000);
            System.out.println(number2);

            System.out.println("Enter a number: ");
            int number3= sc.nextInt();

switch( number3 ) {
    case 1:
        System.out.println( number1 + number2 );
        break;
    case 2:
        System.out.println( number1 - number2 );
        break;
    case 3:
        System.out.println(number1*number2 );
        break;
    case 4 :
        if (number2 == 0){
            System.out.println("Division by zero is not allowed.");}
        else{
        System.out.println( (float) number1 / (float) number2 );}
        break;
    default:
        System.out.println("Invalid Number");
        break;

}

//senario4
        System.out.println("Enter the first edge of the triangle:");
          int a= sc.nextInt();
          System.out.println("Enter the second edge of the triangle:");
          int b= sc.nextInt();
        System.out.println("Enter the third edge of the triangle:");
          int c= sc.nextInt();

          if( a<= 0 || b<=0 || c<=0 || a>500 || b>500 || c>500) {
              System.out.println("Invalid Lenght");
          }
          else if (a+b <= c || b+c <= a || a+c <= b ){
              System.out.println("Not A Triangle");
          }


          else {
              if (a == b && b == c) {
                  System.out.println("EQUILATERAL");
              } else if (a != b && b != c && a != c) {
                  System.out.println("SCALENE");
              } else {
                  System.out.println("ISOCELES");
              }
              int perimeter = a + b + c;
              System.out.println("perimeter=" + perimeter);
          }

        }
}
