import java.util.ArrayList;
import java.util.HashMap;


public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageFacility;

    public StorageFacility() {
        this.storageFacility = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storageFacility.putIfAbsent(unit, new ArrayList<>());
        this.storageFacility.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storageFacility.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> items = this.storageFacility.get(storageUnit);
        if (items != null) {
            items.remove(item);  // removes first occurrence only
            if (items.isEmpty()) {
                this.storageFacility.remove(storageUnit); // remove unit if empty
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> storage = new ArrayList<>();

        for (String unit : this.storageFacility.keySet()) {
            if (!this.storageFacility.get(unit).isEmpty()) {
                storage.add(unit);
            }
        }

        return storage;
    }
}
