import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForUnRegisteredAndUnderLimit() {
        BonusServiceUnRegistered service_un = new BonusServiceUnRegistered();

        long amount = 1000;
        boolean unRegistered = true;
        long expected_unRegistered = 30;

        long actual_unRegistered = service_un.calculate_un(amount, unRegistered);

        assertEquals(expected_unRegistered, actual_unRegistered);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForUnRegisteredAndOverLimit() {
        BonusServiceUnRegistered service_un = new BonusServiceUnRegistered();

        long amount = 1_000_000;
        boolean unRegistered = true;
        long expected_unRegistered = 200;

        long actual_unRegistered = service_un.calculate_un(amount, unRegistered);

        assertEquals(expected_unRegistered, actual_unRegistered);
    }
}