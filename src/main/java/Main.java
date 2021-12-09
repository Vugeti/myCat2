public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(Color.BLUE_POINT, 4000, "goland", "Yasha");
        Cat cat1 = new Cat(Color.BLUE_POINT, 400, "goland", "Ya");
//        Cat cat1 = new Cat(Color.BLUE_POINT, 1, "gold","Jon");
        System.out.println("jon.hashCode " + cat1.hashCode());
        System.out.println("jon.hashCode " + cat.hashCode() + "\n");

        System.out.println(cat1.getName() + ": ");
        cat1.doThisDay(Day.ANYDAY);
        System.out.println("name: " + cat1.getName() + "\ncolor: " + cat1.getColor() + "\nweight: " + cat1.getWeight() + "g" + "\nspecies: " + cat1.getSpecies() + "\n");

        System.out.println("name: " + cat.getName() + "\ncolor: " + cat.getColor() + "\nweight: " + cat.getWeight() + "g" + "\nspecies: " + cat.getSpecies() + "\n");
        System.out.println(cat.getName() + ": ");
        cat.doThisDay(Day.THURSDAY);

        System.out.println(cat == cat1);
        System.out.println(cat.getSpecies().hashCode());
        System.out.println(cat1.getSpecies().hashCode());

    }

}
