import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("input.txt");
        double a = 0;
        double b = 0;
        String[] strings = new String[3];

        try{
            Scanner sc = new Scanner(file);
            for (int i = 0; i < strings.length; i++){
                strings[i] = sc.nextLine();
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println("Error! File not found");
        }
        for (String s1: strings){
            String[] str = s1.split(" ");
            try {
                a = Double.parseDouble(str[0]);
            } catch (NumberFormatException e){
                System.out.println("Error! Not number");
                return;
            }
            try {
                b = Double.parseDouble(str[2]);
            } catch (NumberFormatException e){
                System.out.println("Error! Not number");
                return;
            }
            String s = str[1];
            if (s.equals("+")) System.out.println(a + b);
            else if (s.equals("-")) {
                System.out.println(a - b);
            } else if (s.equals("*")) {
                System.out.println(a * b);
            } else if (s.equals("/")) {
                if (b == 0) {
                    System.out.println("Error! Division by zero");
                } else System.out.println(a / b);
            } else {
                System.out.println("Operation Error!");
            }
        }

    }
}