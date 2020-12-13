package Advent;

import java.util.ArrayList;
import java.util.Scanner;

public class Day2 {
    private static ArrayList<String> input;
    private static int validPasswords;

    public static void main(String[] args) {
        input = Reader.readFile("C:/Users/Shaun/IdeaProjects/AdventofCode2020/src/Advent/day2input.txt");
        part1();
        validPasswords = 0;
        part2();


    }
    public static void part1(){
        for (String password : input){
            //break up password into individual components.
            Scanner scan = new Scanner(password);
            scan.useDelimiter("[^0-9]+");
            int min = scan.nextInt();
            int max = scan.nextInt();
            int colon = password.indexOf(":");
            String key = String.valueOf(password.charAt(colon-1));
            String pwd = password.substring(colon+2);

            int count = 0;

            for (int i=0; i<pwd.length();i++){
                String x = String.valueOf(pwd.charAt(i));
                if (x.equals(key)){
                    count++;
                }

            }
            //check count >= min and <= max.
            if (count >=min && count <= max){
                validPasswords++;
            }
        }
        System.out.println("Valid Passwords part 1: " + validPasswords);


    }
    public static void part2() {

        for (String password: input){
            Scanner scan = new Scanner(password);
            scan.useDelimiter("[^0-9]+");
            int one = scan.nextInt();
            int two = scan.nextInt();
            int colon = password.indexOf(":");
            String key = String.valueOf(password.charAt(colon-1));
            String pwd = password.substring(colon+2);

            String x = String.valueOf(pwd.charAt(one-1));
            String y = String.valueOf(pwd.charAt(two-1));
           //XOR comparison
            if (x.equals(key) && !y.equals(key) || y.equals(key) && !x.equals(key)){
                validPasswords++;
            }

        }
        System.out.println("valid Passwords part 2: " + validPasswords);

    }
}
