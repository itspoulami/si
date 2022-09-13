

import java .util.Scanner;
class factorial{


        public static void main(String args[]){
          int i ,f=1,a;
          Scanner sc =new Scanner(System.in);
          System.out.println("enter the number ");
          a=sc.nextInt();
          for(i=1;i<=a;i++)
          {
              f=f*i;
          }
          System.out.println("the factorial of a number is "+f);

    }
}

