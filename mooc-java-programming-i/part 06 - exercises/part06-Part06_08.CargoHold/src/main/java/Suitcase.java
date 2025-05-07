import java.util.ArrayList;

public class Suitcase {
    private int weightMax;
    private ArrayList<Item> items;

    public Suitcase(int weightMax) {
        this.weightMax = weightMax;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.weightMax) {
            items.add(item);
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Item item : items) {
            total += item.getWeight();
        }
        return total;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item heaviest = items.get(0);
        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }

        return heaviest;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int getWeightMax() {
        return this.weightMax;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        return items.size() + (items.size() == 1 ? " item" : " items") + " (" + totalWeight() + " kg)";
    }
}