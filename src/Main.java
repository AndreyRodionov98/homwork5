public class Main {
    public static void main(String[] args) {


//  задание 1.1
        System.out.println(" Задание 1.1");


        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


//  задание 1.2
        System.out.println(" Задание 1.2");


        for (int a = 10; a > 0; a--) {
            System.out.println(a);
        }


//  задание 1.3
        System.out.println(" Задание 1.3");


        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }





//  задание 1.4
        System.out.println(" Задание 1.4");



       for (int i = 10; i >= -10; i --){
           System.out.println(i);}






//  задание 2.1
        System.out.println(" Задание 2.1");




       for( int i = 1904; i <=2096; i +=4){
           System.out.println( i + " год является високосным");}





//  задание 2.2
        System.out.println(" Задание 2.1");



       for (int i = 7; i<= 98; i+=7){
           System.out.println(i);}



//  задание 2.3
        System.out.println(" Задание 2.3");


       for (int i=1; i<=512; i*=2){
           System.out.println(i);}



//  задание 3.1
        System.out.println(" Задание 3.1");




       int savings = 29000;
       int total = 0;
       for (int i=1;i<=12;i++) {

           total = total + savings;
           System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");}


//  задание 3.2
           System.out.println(" Задание 3.2");


           int Savings = 29000;
           int Total = 0;
           for (int a = 0; a <= 12; a++) {

               Total = Total/100 + Total;
               Total = Total + Savings;
               System.out.println("Месяц " + a + " сумма накоплений равна " + Total + " рублей");}





    }
}