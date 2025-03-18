package at;

public class ProgressiveOverflow {

    private int tableSize;
    public int[] table = new int[tableSize];

    // Başta bütün değerlere 0 atamak ve tablo boyutunu kullanıcıdan almak için
    public ProgressiveOverflow(int tableSize) {
        this.tableSize = tableSize;
        this.table = new int[tableSize];
        for (int i = 0; i < tableSize; i++) {
            table[i] = 0;
        }
    }

    // Belirtilecek indeks değeri için hash fonksiyonu
    private int hashing(int value) {
        int hashValue = value % tableSize;
        return hashValue;
    }

    // Indeks değerinin boş mu olduğunu kontrol etmek için
    public boolean isEmpty(int index) {
        if (table[index] == 0) {
            return true;
        }
        return false;
    }
    public boolean isFull() {
    for (int i = 0; i < table.length; i++) {
        if (isEmpty(i)==true) {
            return false;
        }
    }
    return true;
}
    // Tablomuza yeni eleman eklemek için
    public int insert(int value) {
        int index = hashing(value);
        if (isEmpty(index)) {
            table[index] = value;

        } else {
            int count = index + 1;

            while (true) {
                // Tablo boyutunu aşma kontrolü ve son indeksi kontrol etme
                if (count == tableSize) {
                    count = 0; // tablonun başına döndürmek için 
                }
                if (isEmpty(count)) {
                    table[count] = value;
                    return 0;
                } else {
                    count++;
                }
                
            }
        }
        return 0;
    }

    public void printscr(){
        if(isFull()==true){
                    System.out.println("table is full");
                }
    }
    public void remove(int value) {
        for (int i = 0; i < table.length; i++) {
            if (table[i] == value) {
                System.out.println("The value " + table[i] + " in index " + i + " has been removed");
                table[i] = 0;
            }
        }

    }

    public void search(int value) {
        for (int i = 0; i < table.length; i++) {
            if (table[i] == value) {
                System.out.println("The value " + value + " is at the " + i + ". index");
            }
        }
    }

    public void showTable() {
        System.out.println("Key    |    Value");
        for (int i = 0; i < table.length; i++) {
            System.out.println(i + "    |    " + table[i]);
        }
    }

}
