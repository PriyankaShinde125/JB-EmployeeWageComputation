public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //CONSTANTS
        final int IS_FULL_TIME_PRESENT = 1;
        final int IS_PART_TIME_PRESENT = 2;
        int FULL_DAY_HOURS = 8;
        int PART_TIME_HOURS = 4;
        int WAGE_PER_HOUR = 20;
        int MONTHLY_WORKING_DAYS = 20;

        int workingHours = 0;
        int monthlyWage = 0;
        for (int i = 0; i < MONTHLY_WORKING_DAYS; i++) {
            int attendance = (int) Math.floor(Math.random() * 3);
            switch (attendance) {
                case IS_FULL_TIME_PRESENT:
                    workingHours = FULL_DAY_HOURS;
                    break;
                case IS_PART_TIME_PRESENT:
                    workingHours = PART_TIME_HOURS;
                    break;
                default:
                    workingHours = 0;
                    break;
            }
            int dailyWage = workingHours * WAGE_PER_HOUR;
            monthlyWage = monthlyWage + dailyWage;
        }
        System.out.println("Total wage for this month = " + monthlyWage);
    }
}