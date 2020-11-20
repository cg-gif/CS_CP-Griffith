package cpWeek6Ex2;

import java.util.Scanner;

public class week6Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] tictactoe = new String[3][3];
		int column, row, turn = 0, player = 1;
		Boolean gameOver = false;
		Boolean placeCheck = false;

		while (turn < 9) {
			System.out.println("  1 2 3");
			for (int i = 0; i < tictactoe.length; i++) {
				System.out.print((i + 1) + " ");
				for (int j = 0; j < tictactoe[i].length; j++) {
					if (tictactoe[i][j] != "X" && tictactoe[i][j] != "O") {
						tictactoe[i][j] = "-";
					}
					System.out.print(tictactoe[i][j] + " ");
				}
				System.out.println("\n");
			}
			if ((tictactoe[0][0] == "X" || tictactoe[0][0] == "O") && tictactoe[0][0] == tictactoe[0][1]
					&& tictactoe[0][0] == tictactoe[0][2]) {
				gameOver = true;
			} else if ((tictactoe[1][0] == "X" || tictactoe[1][0] == "O") && tictactoe[1][0] == tictactoe[1][1]
					&& tictactoe[1][0] == tictactoe[1][2]) {
				gameOver = true;
			} else if ((tictactoe[2][0] == "X" || tictactoe[2][0] == "O") && tictactoe[2][0] == tictactoe[2][1]
					&& tictactoe[2][0] == tictactoe[2][2]) {
				gameOver = true;
			} else if ((tictactoe[0][0] == "X" || tictactoe[0][0] == "O") && tictactoe[0][0] == tictactoe[1][0]
					&& tictactoe[0][0] == tictactoe[2][0]) {
				gameOver = true;
			} else if ((tictactoe[0][1] == "X" || tictactoe[0][1] == "O") && tictactoe[0][1] == tictactoe[1][1]
					&& tictactoe[0][1] == tictactoe[2][1]) {
				gameOver = true;
			} else if ((tictactoe[0][2] == "X" || tictactoe[0][2] == "O") && tictactoe[0][2] == tictactoe[1][2]
					&& tictactoe[0][2] == tictactoe[2][2]) {
				gameOver = true;
			} else if ((tictactoe[0][0] == "X" || tictactoe[0][0] == "O") && tictactoe[0][0] == tictactoe[1][1]
					&& tictactoe[0][0] == tictactoe[2][2]) {
				gameOver = true;
			} else if ((tictactoe[0][2] == "X" || tictactoe[0][2] == "O") && tictactoe[0][2] == tictactoe[1][1]
					&& tictactoe[0][2] == tictactoe[2][0]) {
				gameOver = true;
			}

			if (gameOver == true) {
				break;
			}

			System.out.println("player " + player + " go:");

			while (placeCheck == false) {
				System.out.println("select row:");
				row = sc.nextInt()-1;
				System.out.println("Select coloum:");
				column = sc.nextInt()-1;
				if (tictactoe[row][column] != "X" && tictactoe[row][column] != "O") {
					if (player == 1) {
						tictactoe[row][column] = "X";
						placeCheck = true;
						if (player == 1) {
							player = 2;
						} else {
							player = 1;
						}
					} else {
						tictactoe[row][column] = "O";
						placeCheck = true;
						if (player == 1) {
							player = 2;
						} else {
							player = 1;
						}
					}
				} else {
					if (player == 1) {
						player = 2;
					} else {
						player = 1;
					}
				}
			}
			// System.out.println("Turn: "+turn);
			placeCheck = false;
			turn++;

		}
		if (gameOver == true) {
			System.out.println("player " + player + " won!");
		} else {
			System.out.println("Draw!");
		}
	}
}
