package AoC;

import java.util.List;

import static java.lang.Integer.parseInt;

public class Repair {

    public static void main(String[] args) {
    }

    public static int repair1(List<String> list) {

        for (String i1 : list) {
            for (String i2 : list) {

                int j1 = parseInt(i1);
                int j2 = parseInt(i2);

                if (j1 + j2 == 2020) {
                    return j1 * j2;
                }
            }
        }
        return 0;
    }

    public static int repair2(List<String> list) {

        for (String i1 : list) {
            for (String i2 : list) {
                for (String i3 : list) {

                    int j1 = parseInt(i1);
                    int j2 = parseInt(i2);
                    int j3 = parseInt(i3);
                    if (j1 + j2 + j3 == 2020) {
                        return j1 * j2 * j3;
                    }
                }
            }
        }
        return 0;
    }

    public static void dag1() {

        List<String> list = ReadPuzzle.readPuzzle("d1.txt");
        int result1 = Repair.repair1(list);
        System.out.println(result1);
        int result2 = Repair.repair2(list);
        System.out.println(result2);
    }
}


// Kan je de tekst lezen?