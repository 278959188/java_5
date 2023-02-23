public class BonusService_un {
    public long calculate_un(long amount, boolean unRegistered) {
        int percent = unRegistered ? 3 : 1;
        long bonus = amount * percent / 100;
        long limit = 200;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}
