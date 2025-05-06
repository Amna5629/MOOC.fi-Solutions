public class Fitbyte {
    
    private int restingHeartrate;
    private int age;

    public Fitbyte(int age, int restingHeartRate){
        this.age=age;
        this.restingHeartrate=restingHeartRate;
    }
    public double targetHeartRate(double percentageOfMaximum) {
        double maximumHeartRate = 206.3 - (0.711 * this.age);
        return (maximumHeartRate - this.restingHeartrate) * percentageOfMaximum + this.restingHeartrate;
    }
}
