package AoC;

import java.util.List;

public class Trees {
<<<<<<< HEAD
    public static void main(String[] args) {
        System.out.println(dag3(1, 1) * dag3(1, 3) * dag3(1, 5) * dag3(1, 7) * dag3(2, 1));
    }

    public static int dag3(int down, int right) {
=======
	public static void main(String[] args) {
	
	}
	
	public static int dag3(int down, int right) {
>>>>>>> a72251a51edc92193a6d3a4462caff01a9d6323f
		int trees = 0;
		int H = 0;
		List<String> list = ReadPuzzle.readPuzzle("d3.txt");
		int len = (list.get(0)).length();
		for (int i = down; i < list.size(); i += down) {
			H = (H + right) % len;
			if (list.get(i).charAt(H) == '#') {
				trees++;
			}
		}
		return trees;
<<<<<<< HEAD
    }
=======
	}
>>>>>>> a72251a51edc92193a6d3a4462caff01a9d6323f
}
