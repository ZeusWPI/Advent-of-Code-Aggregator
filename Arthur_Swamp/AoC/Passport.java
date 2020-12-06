package AoC;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Passport {

    public static void main(String[] args) {
    }
    public static String[] lines;
    public static String[] regexen_deel1 = {
        ".*\\bbyr:.*",
        ".*\\biyr:.*",
        ".*\\beyr:.*",
        ".*\\bhgt:.*",
        ".*\\bhcl:.*",
        ".*\\becl:.*",
        ".*\\bpid:.*"
    };
    public static String[] regexen_deel2 = {
        ".*\\bbyr:(\\d{4})\\b.*",
        ".*\\biyr:(\\d{4})\\b.*",
        ".*\\beyr:(\\d{4})\\b.*",
        ".*\\bhgt:(\\d+)(cm|in)\\b.*",
        ".*\\bhcl:#[0-9a-f]{6}\\b.*",
        ".*\\becl:(?:amb|blu|brn|gry|grn|hzl|oth)\\b.*",
        ".*\\bpid:\\d{9}\\b.*"
    };

    


    public static void join() {
        lines = String.join("\n", lines)
                .replaceAll("\\b\\n\\b", " ")
                .split("\\n\\n");

    }

    public static int deel1(String[] lines) {
    
        int count = 0;
        for (String line: lines) {
            boolean valid = true;
            for (String regex : regexen_deel1) {
                valid &= line.matches(regex);
            }
            if (valid) {
                ++count;
            }
        }
        return count;
    }

    public static int deel2(String[] lines) {
        

        int count = 0;
        for (String line: lines) {
            boolean valid = true;
            for (int i = 0; i < regexen_deel2.length; ++i) {
                Matcher m = Pattern.compile(regexen_deel2[i]).matcher(line);
                valid &= m.find();
                if (valid) {
                    switch (i) {
                        case 0:
                            int value = Integer.parseInt(m.group(1));
                            valid = value >= 1920 && value <= 2002;
                            break;
                        case 1:
                            value = Integer.parseInt(m.group(1));
                            valid = value >= 2010 && value <= 2020;
                            break;
                        case 2:
                            value = Integer.parseInt(m.group(1));
                            valid = value >= 2020 && value <= 2030;
                            break;
                        case 3:
                            value = Integer.parseInt(m.group(1));
                            switch (m.group(2)) {
                                case "cm":
                                    valid = value >= 150 && value <= 193;
                                    break;
                                case "in":
                                    valid = value >= 59 && value <= 76;
                                    break;
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
            if (valid) {
                ++count;
            }
        }
        return count;
    }

    public static void dag4(){
        try {
            lines = ReadPuzzle.getInput("./puzzels/dag4.txt");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        join();
        System.out.println(deel1(lines));
        System.out.println(deel2(lines));
        
    }


}


