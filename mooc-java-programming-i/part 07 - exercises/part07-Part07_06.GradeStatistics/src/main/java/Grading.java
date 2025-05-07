import java.util.ArrayList;

public class Grading {

    private ArrayList<Integer> points;
    private int[] gradeDistribution; // index 0 = grade 0, ..., index 5 = grade 5

    public Grading() {
        this.points = new ArrayList<>();
        this.gradeDistribution = new int[6];
    }

    public void add(int value) {
        if (value >= 0 && value <= 100) {
            points.add(value);
            gradeDistribution[gradeFromPoints(value)]++;
        }
    }

    private int gradeFromPoints(int points) {
        if (points < 50) return 0;
        else if (points < 60) return 1;
        else if (points < 70) return 2;
        else if (points < 80) return 3;
        else if (points < 90) return 4;
        else return 5;
    }

    public double average() {
        if (points.isEmpty()) return 0.0;

        int total = 0;
        for (int point : points) {
            total += point;
        }
        return 1.0 * total / points.size();
    }

    public double averagePassing() {
        int total = 0;
        int count = 0;
        for (int point : points) {
            if (point >= 50) {
                total += point;
                count++;
            }
        }
        return count == 0 ? 0.0 : 1.0 * total / count;
    }

    public double passPercentage() {
        if (points.isEmpty()) return 0.0;

        int passed = 0;
        for (int point : points) {
            if (point >= 50) passed++;
        }
        return 100.0 * passed / points.size();
    }

    public void printGradeDistribution() {
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < gradeDistribution[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
