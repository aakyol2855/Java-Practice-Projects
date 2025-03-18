
package datastructureproject;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static int tableRows;
    static int tableColumns;
    static Snake snake;

    public static void main(String[] args) {
        getUserInput();

        // Çift yönlü bağlı liste oluşturuluyor
        snake = new Snake();
        placeSnakeRandomly(5); // Başlangıç uzunluğu 5 olan yılanı rastgele yerleştir
        snake.print();

        String[][] tableData = new String[tableRows][tableColumns];
        fillTableWithSpaces(tableData);
        placeSnakeOnTable(tableData);
        printTable(tableData);
    }

    static void getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tablo satır sayısını girin: ");
        tableRows = scanner.nextInt();

        System.out.print("Tablo sütun sayısını girin: ");
        tableColumns = scanner.nextInt();
    }

    static void placeSnakeRandomly(int initialLength) {
        Random random = new Random();

        // Yılanın başlangıç pozisyonunu belirle
        int startX = random.nextInt(tableColumns - initialLength + 1) + 1; // Kenarlara yapışık olacak şekilde rastgele konum
        int startY = random.nextInt(tableRows - 2) + 1; // Tablonun üst ve alt kenarları arasında rastgele konum

        // Yılanı başlangıç pozisyonuna ekle
        for (int i = 0; i < initialLength; i++) {
            snake.addToTail(new Point(startX + i, startY));
        }
    }

    static void fillTableWithSpaces(String[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (i == 0 || i == table.length - 1 || j == 0 || j == table[i].length - 1) {
                    table[i][j] = "#";  // Kenarlara "#" karakteri ile doldur
                } else {
                    table[i][j] = " ";  // İç kısmı boşluk karakteri ile doldur
                }
            }
        }
    }

    static void placeSnakeOnTable(String[][] table) {
        Node current = snake.head;
        while (current != null) {
            table[current.data.y][current.data.x] = "O"; // Yılanın başını "O" karakteri ile temsil et
            current = current.next;
        }
    }

    static void printTable(String[][] table) {
        System.out.println("Tablo:");
        for (String[] row : table) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class Node {
        Point data;
        Node next;
        Node prev;

        Node(Point data) {
            this.data = data;
        }
    }

    static class Snake {
        Node head;
        Node tail;

        void addToTail(Point data) {
            Node newNode = new Node(data);
            if (tail == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        void print() {
            Node current = head;
            System.out.print("Yılanın Konumu: ");
            while (current != null) {
                System.out.print("(" + current.data.x + ", " + current.data.y + ") ");
                current = current.next;
            }
            System.out.println();
        }
    }
}