package textgame;
import java.util.Scanner;


public class TextGame {
    private static Scanner scanner = new Scanner(System.in);
    private static Player player;
    private static int currentRoom = 1;
    
    
    public static void main(String[] args) {
        initGame();
        while (true) {
            showRoom();
            String command = getCommand();
            processCommand(command);
        }
    }
    
    static class Player {
        String name;
        int health = 100;
        int gold = 0;
        
        Player(String name) {
            this.name = name;
        }
    }
    
    private static void initGame() {
        System.out.println("Macera oyununa hoş geldiniz!");
        System.out.print("Karakterinizin adını girin: ");
        String playerName = scanner.nextLine();
        player = new Player(playerName);
        
        System.out.println("\nMerhaba " + player.name + "! Maceraya başlayalım!");
        System.out.println("Komutlar: kuzey, güney, doğu, batı, envanter, çıkış");
    }
    
    private static void showRoom() {
        System.out.println("\n----------------------------------------");
        switch (currentRoom) {
            case 1:
                System.out.println("Karanlık bir odadasın. Doğuda bir kapı var.");
                break;
            case 2:
                System.out.println("Hazine odadasındasın! Altın parıldıyor.");
                break;
            case 3:
                System.out.println("Tehlikeli bir oda. Bir canavar var!");
                break;
        }
        System.out.println("Can: " + player.health + " | Altın: " + player.gold);
    }
    
    private static String getCommand() {
        System.out.print("\nNe yapmak istersin? > ");
        return scanner.nextLine().toLowerCase();
    }
    
    private static void processCommand(String command) {
        switch (command) {
            case "kuzey":
            case "guney":
            case "dogu":
            case "bati":
                move(command);
                break;
            case "envanter":
                showInventory();
                break;
            case "çıkış":
                System.out.println("Oyun bitti! Görüşmek üzere " + player.name);
                System.exit(0);
                break;
            default:
                System.out.println("Bu komutu anlamadım.");
        }
    }
    
    private static void move(String direction) {
        int newRoom = currentRoom;
        
        switch (currentRoom) {
            case 1:
                if (direction.equals("doğu")) newRoom = 2;
                break;
            case 2:
                if (direction.equals("batı")) newRoom = 1;
                if (direction.equals("kuzey")) newRoom = 3;
                break;
            case 3:
                if (direction.equals("güney")) newRoom = 2;
                break;
        }
        
        if (newRoom == currentRoom) {
            System.out.println("O yöne gidemezsin!");
        } else {
            currentRoom = newRoom;
            if (currentRoom == 2 && player.gold == 0) {
                System.out.println("10 altın buldun!");
                player.gold += 10;
            }
            if (currentRoom == 3) {
                System.out.println("Canavar sana saldırdı! 20 hasar aldın!");
                player.health -= 20;
                if (player.health <= 0) {
                    System.out.println("\nÖLDÜN! Oyun bitti.");
                    System.exit(0);
                }
            }
        }
    }
    
    private static void showInventory() {
        System.out.println("\nENVANTER:");
        System.out.println("Can: " + player.health);
        System.out.println("Altın: " + player.gold);
    }
}