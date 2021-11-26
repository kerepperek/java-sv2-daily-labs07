package day04;

public class Ride {

    private int dayOfWeek;
    private int dayIndex;
    private int km;

    public Ride(int dayOfWeek, int dayIndex, int km) {
        this.dayOfWeek = dayOfWeek;
        this.dayIndex = dayIndex;
        this.km = km;
    }

    public boolean isBefore(Ride ride) {
        if (dayOfWeek > ride.getDayOfWeek()) {
            return false;
        }
        if (dayOfWeek == ride.getDayOfWeek() && dayIndex > ride.getDayIndex()) {
            return false;
        }

        return true;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public int getDayIndex() {
        return dayIndex;
    }

    public int getKm() {
        return km;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "dayOfWeek=" + dayOfWeek +
                ", dayIndex=" + dayIndex +
                ", km=" + km +
                "}\n";
    }
}
