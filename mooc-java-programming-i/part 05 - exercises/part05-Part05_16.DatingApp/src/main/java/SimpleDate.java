public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Advances the date by one day
    public void advance() {
        this.advance(1);  // Use the parameterized method
    }

    // Advances the date by a specific number of days
    public void advance(int howManyDays) {
        int totalDays = this.day + howManyDays;
        this.day = totalDays;

        while (this.day > 30) {
            this.day -= 30;
            this.month += 1;

            if (this.month > 12) {
                this.month = 1;
                this.year += 1;
            }
        }
    }

    // Returns a new date after a certain number of days
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
