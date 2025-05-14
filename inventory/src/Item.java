
    public class Item {
        public String name;
        public int quantity;
        public double price;

        public Item(String name, int quantity, double price) {

            this.name = name;
            this.quantity = Math.max(quantity, 0);
            this.price = Math.max(price, 0.0);
        }

        public void addStock(int amount) {
            if (amount > 0) {
                quantity += amount;
                System.out.printf("Added %d units to %s\n", amount, name);
            } else {
                System.out.println("Error: Can only add positive amounts of stock");
            }
        }

        public void removeStock(int amount) {
            if (amount <= 0) {
                System.out.println("Error: Can only remove positive amounts of stock");
                return;
            }

            if (amount > quantity) {
                System.out.printf("Warning: Tried to remove %d units but only %d available. Removing all remaining stock.\n",
                        amount, quantity);
                quantity = 0;
            } else {
                quantity -= amount;
                System.out.printf("Removed %d units from %s\n", amount, name);
            }
        }


        public double getValue() {
            return quantity * price;
        }


        public void displayItem() {
            System.out.printf("Item: %s, Quantity: %d, Price: $%.2f, Value: $%.2f\n",
                    name, quantity, price, getValue());
        }
    }

