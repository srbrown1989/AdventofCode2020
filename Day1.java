package Advent;

import java.util.ArrayList;

public class Day1 {
    private static ArrayList<Integer> input;

    public static void main(String[] args) {
        input = ReaderInts.readFromFile("C:/Users/Shaun/IdeaProjects/AdventofCode2020/src/Advent/input.txt");
        boolean searching = true;
        int one = 0;
        int two = 0;
            while (searching) {
                for (int i = 0; i < input.size(); i++) {
                    int x = input.get(i);
                    System.out.println("x is : " + x);
                    for (int j = 1; j < input.size()-1;j++){
                        int y = input.get(j);
                            if (x+y == 2020){
                                one = x;
                                two = y;
                                 searching = false;
                            }
                     }

                }
            }
        System.out.println("first number is: " + one);
        System.out.println("first number is: " + two);
        System.out.println("result is: " + (one*two));
        part2();

        }
        public static void part2(){
            System.out.println("PART 2: ");
        boolean searching = true;
        int one = 0;
        int two = 0;
        int three = 0;

        while (searching){
            for (int i = 0; i < input.size();i++){
                int x = input.get(i);
                for (int j = 1; j < input.size()-1;j++){
                    int y = input.get(j);
                    for (int k = 2; k < input.size()-2;k++){
                        int z = input.get(k);
                        if (x+y+z == 2020){
                            one = x;
                            two = y;
                            three = z;
                            searching = false;
                        }
                    }
                }
            }
        }
            System.out.println("Part 2 result : " + one*two*three);

        }

    }

