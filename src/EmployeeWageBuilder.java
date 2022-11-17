public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //CONSTANTS
        int IS_FULL_TIME_PRESENT = 1;
        double attendance = Math.floor(Math.random() * 10) % 2;
        if (attendance == IS_FULL_TIME_PRESENT)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
    }
}