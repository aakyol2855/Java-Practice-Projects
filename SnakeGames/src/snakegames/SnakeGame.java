package snakegames;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class SnakeGame {
    private int boardRow;
    private int boardColumn;
    private Node node;
    private LinkedList<Node> snake;
    private Node food;
    private Node bomb;
    private int score;
    private int nBomb;
    public SnakeGame(int width, int height) {
        boardRow = width;
        boardColumn = height;
        node = null;
        snake = new LinkedList<>();
        food = null;
        bomb = null;
        score = 0;
        nBomb = 0;
    }

    public void startGame() {
        initializeSnake();
        generateFood();
        generateBomb();

        while (true) {
            drawBoard();
            System.out.println("Hareket yonunu seciniz ( 2 ->Alt , 4 ->Sol , 6 ->Sag , 8 ->Ust) => ");
            Scanner scanner = new Scanner(System.in);
            int move = scanner.nextInt();

            if (!makeMove(move)) {
                System.out.println("Oyun Bitti ! Skorunuz => " );
                break;
            }
            // yem ve bomba uretme kosullari
            if (node.x == food.x && node.y == food.y) {
               
                generateFood();
            }
            if (node.x == bomb.x && node.y == bomb.y) {
                if (snake.size() >= 3) {
                    snake.pop();
                    generateBomb();
                } else {
                    System.out.println("Oyun Bitti ! Skorunuz =>" );
                    break;
                }
            }

            // Yılanın boyutunu kontrol et ve kuyruktan haraket idince  hucreyi bosaltması
                if(!makeMove(move)){
                    
                }
        }
    }
    

    private void initializeSnake() {
        // 4 bogumdan yilan atamasi
        Random random = new Random();
        
        int x = random.nextInt(boardRow);
        int y = random.nextInt(boardColumn);
        node = new Node(x, y);
        snake.add(node);
        
        //merkeze yakin değer uretsin
        if(x < boardColumn/2 && y < boardRow/2)
        {
            node = new Node(x, y++);snake.add(node);
            node = new Node(x, y++);snake.add(node);
            node = new Node(x, y++);snake.add(node);
            node = new Node(x, y++);snake.add(node);
        }else
        {
            node = new Node(x--, y);snake.add(node);
            node = new Node(x--, y);snake.add(node);
            node = new Node(x--, y);snake.add(node);
            node = new Node(x--, y);snake.add(node);
        }
        
        
        
    }
    

    private void generateFood() {
        Random random = new Random();
    
        while (true) {
            int x = random.nextInt(boardRow);
            int y = random.nextInt(boardColumn);

            // Yeni yem oluştur
            if (!snakeContains(x, y)) {
                food = new Node(x, y);
                break;
            }
        }
 
        //yilan icin bir node ekle
        snake.add(node);
        score++;
    }

    private void generateBomb() {
        Random random = new Random();
    
        while (true) {
            int x = random.nextInt(boardRow);
            int y = random.nextInt(boardColumn);

            // Yeni bomba oluştur
            if (!snakeContains(x, y)) {
                bomb = new Node(x, y);
                break;
            }
        }
        nBomb++;
    }
    //yilani haraket ettirme kismi
    private boolean makeMove(int move) {
        int newX = node.x;
        int newY = node.y;
        
        switch (move) {
        case 2:
            newY++;
            break;
        case 4:
            newX--;
            break;
        case 6:
            newX++;
            break;
        case 8:
            newY--;
            break;
        default:
            System.out.println("Wrong Move! ");
            return true;
        }
        

        if (newX < 0 || newX >= boardRow || newY < 0 || newY >= boardColumn ) {
            return false;
        }
        
        //bularda yeni node eklenir yeni ihucreye ve yokarida pop islemi yapilir
        Node newHead = new Node(newX, newY);
        snake.add(newHead);
        node = newHead;

        return true;
    }

    private void drawBoard() {
        for (int i = 0; i < boardColumn; i++) {
            for (int j = 0; j < boardRow; j++) {
                if (i == node.y && j == node.x) {// ilk node
                    System.out.print("@ ");
                } else if (snakeContains(j, i)) {
                    System.out.print("O ");
                } else if (i == food.y && j == food.x) {
                    System.out.print("F ");
                } else if (i == bomb.y && j == bomb.x) {
                    System.out.print("B ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
    // ilgili hucrede yilan parcasi iceriryot mu
    private boolean snakeContains(int x, int y) {
        for (Node node : snake) {
            if (node.x == x && node.y == y) {
                return true;
            }
        }
        return false;
    }
}

