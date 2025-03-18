
package snakegames;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  the width of the board: ");
        int width = scanner.nextInt();
        System.out.print("Enter the height of the board: ");
        int height = scanner.nextInt();

        SnakeGame game= new SnakeGame(width, height);
        game.startGame();
    }
    
}