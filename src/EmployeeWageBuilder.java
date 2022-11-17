public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //CONSTANTS
        final int IS_FULL_TIME_PRESENT = 1;
        final int IS_PART_TIME_PRESENT = 2;
        int FULL_DAY_HOURS = 8;
        int PART_TIME_HOURS = 4;
        int WAGE_PER_HOUR = 20;
        int MAX_WORKING_DAYS = 20;
        int MAX_WORKING_HOURS = 100;

        int totalWorkingHours = 0;
        int totalWorkingDays = 0;
        int totalWage = 0;

        while (totalWorkingHours <= MAX_WORKING_HOURS || totalWorkingDays <= MAX_WORKING_DAYS) {
            int attendance = (int) Math.floor(Math.random() * 3);
            switch (attendance) {
                case IS_FULL_TIME_PRESENT:
                    totalWorkingHours = totalWorkingHours + FULL_DAY_HOURS;
                    break;
                case IS_PART_TIME_PRESENT:
                    totalWorkingHours = totalWorkingHours + PART_TIME_HOURS;
                    break;
                default:
                    break;
            }
            totalWage = totalWorkingHours * WAGE_PER_HOUR;
            if (totalWorkingDays == MAX_WORKING_DAYS)
                break;
            else
                totalWorkingDays++;
            if (totalWorkingHours == MAX_WORKING_HOURS)
                break;
        }

        System.out.println("Total wage  = " + totalWage);
    }
}