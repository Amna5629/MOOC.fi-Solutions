public class HealthStation {

    private int totalWeighings = 0;

    public int weigh(Person person) {
        this.totalWeighings++;
        return person.getWeight();
    }

    public void feed(Person person) {
        int currentWeight = person.getWeight();
        person.setWeight(currentWeight + 1);
    }

    public int weighings() {
        return this.totalWeighings;
    }
}
