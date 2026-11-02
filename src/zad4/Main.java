package zad4;

public class Main {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[6];

        items[0] = new Book("Under the Yoke", 1894,true, "Ivan Vazov");
        items[1] = new Book("The Witcher", 1993,true, "Andrzej Sapkowski");
        items[2] = new Book("1984", 1949,true, "George Orwell");

        items[3] = new DVD("Inception", 2010,true, 148);
        items[4] = new DVD("The Matrix", 1999,true, 136);
        items[5] = new DVD("Interstellar", 2014,true, 169);

        for(LibraryItem item : items)
        {
            System.out.printf("Title: %-25s | Late Fee: $%8.2f%n", item.title, item.calculateLateFee(3));
        }

        Borrowable[] borrowableItems = new Borrowable[6];
        for(int i = 0; i < 6; i++)
        {
            borrowableItems[i] = (Borrowable) items[i];
        }

        borrowableItems[1].borrowItem();
        borrowableItems[2].borrowItem();
        borrowableItems[3].returnItem();

        for(Borrowable item : borrowableItems)
        {
            System.out.println(item.isAvailable());
        }


    }
}
