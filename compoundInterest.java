//import java.util.Math;
public class CompoundInterest{

    public static void main(String...args){

        double amount = 1000;
        double rate5 = 0.05;
        double rate6 = 0.06;
        double rate7 = 0.07;
        double rate8 = 0.08;
        double rate9 = 0.09;
        double rate10 = 0.1;
        double year = 10;
        System.out.println("rate \t amount");
        for(int count = 1; count <= 10; count++){
           double total5  = amount*Math.pow(1 + rate5, year);
           double total6  = amount*Math.pow(1 + rate6, year);
           double total7  = amount*Math.pow(1 + rate7, year);
           double total8  = amount*Math.pow(1 + rate8, year);
           double total9  = amount*Math.pow(1 + rate9, year);
           double total10  = amount*Math.pow(1 + rate10, year);

        System.out.printf(count + "\t" + total5 + "\t" + total6 + "\t" + total7 + "\t" + total8 + "\t" + total9 + "\t" + total10);

        }
    }
}
