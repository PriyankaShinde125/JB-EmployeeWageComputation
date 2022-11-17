public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //CONSTANTS
        final int IS_FULL_TIME_PRESENT = 1;
        final int IS_PART_TIME_PRESENT = 2;
        int FULL_DAY_HOURS = 8;
        int PART_TIME_HOURS = 4;
        int WAGE_PER_HOUR = 20;

        int workingHours = 0;
        int attendance = (int) Math.floor(Math.random() * 3);
        switch (attendance) {
            case IS_FULL_TIME_PRESENT:
                System.out.println("Employee is full-time present");
                workingHours = workingHours + FULL_DAY_HOURS;
                break;
            case IS_PART_TIME_PRESENT:
                System.out.println("Employee is part-time present");
                workingHours = workingHours + PART_TIME_HOURS;
                break;
            default:
                System.out.println("Employee is absent");
                break;
        }
        int dailyWage = workingHours * WAGE_PER_HOUR;
        System.out.println("Today's Wage = " + dailyWage);
    }
}