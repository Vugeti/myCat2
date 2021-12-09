import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestForCat {
    @Test
    void equalsCatForSpecies() {
        Cat cat = new Cat(Color.BLUE_POINT, 4000, "goland", "Yasha");
        Cat cat1 = new Cat(Color.CHOCOLATE_POINT, 40, "gold", "Jon");
        Assertions.assertEquals(cat, cat1);
    }

    @Test
    void equalsCatForAnother() {
        Cat cat = new Cat(Color.BLUE_POINT, 4000, "goland", "Yasha");
        Cat cat1 = new Cat(Color.BLUE_POINT, 3000, "gold", "Jon");
        Assertions.assertNotEquals(cat.hashCode(), cat1.hashCode());
    }
}
