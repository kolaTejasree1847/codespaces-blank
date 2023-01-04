import java.util.Scanner;
  class primeNumber{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
         System.out.println("enter any number");
        int num=scan.nextInt();
         if( num%2!=0){
            System.out.println(" it is a prime numer"+num);

         }else{
            System.out.println(" it is no a prime number");
         }
    }
  }