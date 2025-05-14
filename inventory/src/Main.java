    public static void main(String[] args) {

        Item laptop = new Item("Laptop", 10, 999.99);
        Item mouse = new Item("Mouse", 50, 19.99);

        System.out.println("Initial Inventory:");
        laptop.displayItem();
        mouse.displayItem();
        System.out.println();

        System.out.println("Performing operations on Laptop:");
        laptop.addStock(5);
        laptop.displayItem();

        laptop.removeStock(20);
        laptop.displayItem();


        System.out.println("\nPerforming operations on Mouse:");
        mouse.removeStock(15);
        mouse.displayItem();


        System.out.println("\nBulk stock addition to Mouse:");
        for (int i = 1; i <= 3; i++) {
            mouse.addStock(5);
            System.out.printf("Added 5 units (Batch %d):\n", i);
            mouse.displayItem();
        }
    }

    private static String[] args;
