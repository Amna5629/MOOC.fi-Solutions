import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int weightMax;

    public Hold(int weightMax) {
        this.weightMax = weightMax;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.weightMax) {
            suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Suitcase s : suitcases) {
            total += s.totalWeight();
        }
        return total;
    }

    public void printItems() {
        for (Suitcase s : suitcases) {
            s.printItems();
        }
    }

    public String toString() {
        int count = suitcases.size();
        return (count == 0 ? "no suitcases" : count + " suitcase" + (count > 1 ? "s" : ""))
                + " (" + totalWeight() + " kg)";
    }
}
