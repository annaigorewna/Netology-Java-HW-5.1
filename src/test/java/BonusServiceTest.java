import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {
    @Test
    public void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long expected = 30;
        long actual = service.calculate(1_000, true);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long expected = 500;
        long actual = service.calculate(1_000_000, true);
        assertEquals(expected, actual);
    }
    @Test
    public void shouldCalculateForUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long expected = 10;
        long actual = service.calculate(1_000, false);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForUnregisteredAndOverLimit() {
        BonusService service = new BonusService();

        long expected = 500;
        long actual = service.calculate(1_000_000, false);
        assertEquals(expected, actual);
    }
}

//import static org.junit.jupiter.api.Assertions.*;

//public class BonusServiceTest {
//
//    @org.junit.jupiter.api.Test
//    void shouldCalculateForRegisteredAndUnderLimit() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        long amount = 1000;
//        boolean registered = true;
//        long expected = 30;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//
//    @org.junit.jupiter.api.Test
//    void shouldCalculateForRegisteredAndOverLimit() {
//        BonusService service = new BonusService();
//
//        // подготавливаем данные:
//        long amount = 1_000_000;
//        boolean registered = true;
//        long expected = 500;
//
//        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
//}
