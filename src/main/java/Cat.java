import java.util.Objects;

public class Cat extends Predator {
    private String name;
    private String species;

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public Cat(Color color, int weight, String species, String name) {
        super(color, weight);
        this.species = species;
        this.name = name;
    }

//    @Override
//    public boolean equals(Object obj) {
//
//        if (obj.hashCode() != obj.hashCode()) return false;
//        if (!(obj instanceof Cat)) return false;
//        Cat cat = (Cat) obj;
//        if (cat.species.hashCode() == cat.species.hashCode()) return true;
//        return name != cat.name;
//       if (species != null ? !species.equals(cat.species) : cat.species != null) return false;
//        if (getWeight() != 0 ? getWeight()==cat.getWeight() : cat.getWeight() == 0) return false;
//        return getColor() != null ? getColor()==cat.getColor() : cat.getColor() == null;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = name.hashCode();
//        result = 31 * result + (species != null ? species.hashCode() : 0);
//        result = 31 * result + (getWeight() != 0 ? getWeight() : 0);
//        return result;
//    }


    public void sleeping() {
        System.out.println("ZZzzz-Zzzz");
    }

    public void hunting() {
        System.out.println("Christmas tree hunting");
    }

    public void tyGyDyking() {
        System.out.println("I want to jump on the master's face");
    }

    public void lickBalls() {
        System.out.println("my balls will sparkle like the master's bald head");
    }

    public void doThisDay(Day doThisDay) {
        switch (doThisDay) {
            case MONDAY, WEDNESDAY, FRIDAY -> sleeping();
            case TUESDAY, THURSDAY, SATURDAY -> hunting();
            case SUNDAY -> tyGyDyking();
            default -> lickBalls();
        }
    }
}

