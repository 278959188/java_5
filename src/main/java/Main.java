public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected = 150;
        long actual = service.calculate(5_000, true);
        System.out.println("1. " + expected + " == + == " + actual);

        expected = 50;
        long bonus = service.calculate(5_000, false);
        System.out.println("2. " + expected + " == + == " + actual);

        BonusService_un service_un = new BonusService_un();

        int expected_un = 150;
        long actual_un = service.calculate(5_000, true);
        System.out.println("3. " + expected + " == + == " + actual);

        expected_un = 50;
        long bonus_un = service.calculate(5_000, false);
        System.out.println("4. " + expected + " == + == " + actual);
    }
}
