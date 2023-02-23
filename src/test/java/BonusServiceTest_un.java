import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest_un {

    @org.junit.jupiter.api.Test
    void shouldCalculateForUnRegisteredAndUnderLimit() {
        BonusService_un service_un = new BonusService_un();

        long amount = 1000;
        boolean unRegistered = true;
        long expected_unRegistered = 30;

        long actual_unRegistered = service_un.calculate_un(amount, unRegistered);

        assertEquals(expected_unRegistered, actual_unRegistered);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForUnRegisteredAndOverLimit() {
        BonusService_un service_un = new BonusService_un();

        long amount = 1_000_000;
        boolean unRegistered = true;
        long expected_unRegistered = 500;

        long actual_unRegistered = service_un.calculate_un(amount, unRegistered);

        assertEquals(expected_unRegistered, actual_unRegistered);
    }
}