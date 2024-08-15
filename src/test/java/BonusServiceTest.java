import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndMaximumLimit() {
        BonusService service = new BonusService();
        long amount = 16_667;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndMaximumMinusOneLimit() {
        BonusService service = new BonusService();
        long amount = 16_666;
        boolean registered = true;
        long expected = 499;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndMaximumPlusOneLimit() {
        BonusService service = new BonusService();
        long amount = 16_701;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndMinimumLimit() {
        BonusService service = new BonusService();
        long amount = 34;
        boolean registered = true;
        long expected = 1;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndZeroLimit() {
        BonusService service = new BonusService();
        long amount = 33;
        boolean registered = true;
        long expected = 0;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForOnRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000;
        boolean registered = false;
        long expected = 10;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForOnRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1_000_000;
        boolean registered = false;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForOnRegisteredAndMaximumLimit() {
        BonusService service = new BonusService();
        long amount = 50_000;
        boolean registered = false;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForOnRegisteredAndMinimumLimit() {
        BonusService service = new BonusService();
        long amount = 100;
        boolean registered = false;
        long expected = 1;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForOnRegisteredAndMaximumMinusOneLimit() {
        BonusService service = new BonusService();
        long amount = 49_999;
        boolean registered = false;
        long expected = 499;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForOnRegisteredAndMaximumPlusOneLimit() {
        BonusService service = new BonusService();
        long amount = 50_001;
        boolean registered = false;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForOnRegisteredAndZeroLimit() {
        BonusService service = new BonusService();
        long amount = 99;
        boolean registered = false;
        long expected = 0;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }
}