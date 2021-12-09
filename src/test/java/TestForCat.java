import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestForCat {
    @Test
    void equalsCatForColors() {
        Cat cat = new Cat(Color.BLUE_POINT, 4000, "goland", "Yasha");
        Cat cat1 = new Cat(Color.BLUE_POINT, 4000, "gold", "Jon");
        Assertions.assertEquals(cat.hashCode(), cat1.hashCode());
    }

    @Test
    void equalsCatForAnother() {
        Cat cat = new Cat(Color.BLUE_POINT, 4000, "goland", "Yasha");
        Cat cat1 = new Cat(Color.BLUE_POINT, 4000, "goland", "Yasha");
        Assertions.assertNotEquals(cat, cat1);
    }
}
