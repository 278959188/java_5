public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected = 150;
        long actual = service.calculate(5_000, true);
        System.out.println("1. " + expected + " == + == " + actual);

        expected = 50;
        actual = service.calculate(5_000, false);
        System.out.println("2. " + expected + " == + == " + actual);

        BonusService_un service_un = new BonusService_un();

        int expected_unRegistered = 75;
        long actual_unRegistered = service_un.calculate_un(2_500, true);
        System.out.println("3. " + expected_unRegistered + " == + == " + actual_unRegistered);

        expected_unRegistered = 25;
        actual_unRegistered = service_un.calculate_un(2_500, false);
        System.out.println("4. " + expected_unRegistered + " == + == " + actual_unRegistered);
    }
}
