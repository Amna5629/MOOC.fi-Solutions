public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        if (cents > 99) {
            euros += cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros();
        int newCents = this.cents + addition.cents();

        return new Money(newEuros, newCents);  // constructor handles cent overflow
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros()) {
            return true;
        } else if (this.euros == compared.euros() && this.cents < compared.cents()) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
        int totalThis = this.euros * 100 + this.cents;
        int totalDecreaser = decreaser.euros() * 100 + decreaser.cents();

        int difference = totalThis - totalDecreaser;
        if (difference < 0) {
            return new Money(0, 0);
        }

        int newEuros = difference / 100;
        int newCents = difference % 100;

        return new Money(newEuros, newCents);
    }

    public String toString() {
        String zero = (cents < 10) ? "0" : "";
        return euros + "." + zero + cents + "e";
    }
}
