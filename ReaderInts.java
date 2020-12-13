package Advent;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReaderInts {
    public ReaderInts(){

    }

    public static ArrayList<Integer> readFromFile(String filename){
        ArrayList<Integer> input = new ArrayList<>();
        try {
            File file = new File(filename);
            Scanner myReader = new Scanner(file);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                input.add(Integer.parseInt(data));
            }
        }catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        return input;


    }

    }

