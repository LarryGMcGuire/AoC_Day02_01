import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Day02_01 {

    // Advent of Code 2022 Day 2   Part 2
    //  Read about the problem here  https://adventofcode.com/2022/day/2
    public static void main(String[] args) throws IOException, FileNotFoundException{
        Path current = Paths.get(".");
        String s = current.toAbsolutePath().toString();
        System.out.println("Path" + s);

        File inputTxt = new File("src/2022/day01/input.txt");
        System.out.println(" Full Path: "+ inputTxt);
        BufferedReader input = new BufferedReader(new FileReader(inputTxt));
        String string;
        String x, y;
        String[] split;

        ArrayList<String> xyzList = new ArrayList<>();

        while ((string = input.readLine()) != null){
            xyzList.add(string);
        }
        input.close();

        int points = 0;

        for (String i: xyzList){
            System.out.println("Read in " + i);
            split = i.split(" ");
            x = split[0];
            y = split[1];
            System.out.println("OPP: "+ x);
            System.out.println("You: "+ y);


            switch (y){
                case "X":
                    switch (x){
                        case "A": points += 3; System.out.println("OPP chose Rock  You chose Rock --- Draw 3 points");break;
                        case "B": points += 0; System.out.println("OPP chose Paper  You chose Rock --- Lose 0 points");break;
                        case "C": points += 6; System.out.println("OPP chose Scissors  You chose Rock --- Win 6 points");break;
                    }
                    System.out.println("You chose Rock !  1 points");
                    points += 1;

                    break;
                case "Y":

                    switch (x){
                        case "A": points += 6; System.out.println("OPP chose Rock  You chose Paper --- 6 points");break;
                        case "B": points += 3; System.out.println("OPP chose Paper  You chose Paper --- 3 points");break;
                        case "C": points += 0; System.out.println("OPP chose Scissors  You chose Paper --- 0 points");break;
                    }
                    System.out.println("You chose paper!  2 points");
                    points += 2;

                    break;
                case "Z":

                    switch (x){
                        case "A": points += 0; System.out.println("OPP chose Rock  You chose Scissors --- 0 points");break;
                        case "B": points += 6; System.out.println("OPP chose Paper  You chose Scissors --- 6 points");break;
                        case "C": points += 3; System.out.println("OPP chose Scissors  You chose Scissors --- 3 points");break;
                    }
                    System.out.println("You chose scissors!  3 points");
                    points += 3;
                    break;
            }
        }
        System.out.println(points);
    }

}
