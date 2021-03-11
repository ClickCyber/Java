// logical options (!, ==, ===, !=, <=, =<, >, <, ||, &&)
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //TODO Your code
        float count = 0;
        float value;
        int count_slice = 0;
        Scanner obj = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Your Number for exit type zero (0) ");
            value = obj.nextFloat();
            if(value == 0)
            {
                System.out.println(count / count_slice);
                break;
            }
            else
            {
                count += value;
                count_slice += 1;
            }
        }
    }
}

