
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.points.add(points);
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        double average = 0;
        int count = 0;

        if (grades.isEmpty()) {
            return -1;
        }

        for (int grade : grades) {
            count++;
            average += grade;
        }
        average /= count;

        return average;
    }

    public double averageOfPoints() {
        double average = 0;
        int count = this.points.size();

        if (points.isEmpty()) {
            return -1;
        }

        for (int point : points) {
            average += point;
        }
        
        average /= count;

        return average;
    }
}