package BinaryTree;

import java.time.LocalDate;
import java.time.Period;

public class Player implements Comparable<Player> {
    private final String name;
    private final LocalDate birthDate;
    public Player(String name,LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return this.name;
    }
    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    @Override
    public int compareTo(Player player) {

        LocalDate currentDate = LocalDate.now();
        Period myPeriod = Period.between(this.birthDate, currentDate);
        Period otherPeriod = Period.between(player.getBirthDate(), currentDate);

        return Integer.compare(myPeriod.getYears(), otherPeriod.getYears());

    }

    @Override
    public String toString() {
        return "Name: " + this.name;
    }

}
