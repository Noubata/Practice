public class SumOfASeries{

    public static void main(String...args){
    long sum = 0;
    System.out.println("count \t sum");
   
    for(long count = 1; count <= 100; count++){
        sum+=count;
    
    System.out.println(count + "\t" + sum);
    }
    }
}
