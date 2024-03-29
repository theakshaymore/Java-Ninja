package day07.day07;

public class TalentSprint {

	private double basePay;
    private int hoursWorked;

    public TalentSprint(double basePay, int hoursWorked) {
        this.basePay = basePay;
        this.hoursWorked = hoursWorked;
    }

    public TalentSprint() {
        this.basePay = 0;
        this.hoursWorked = 0;
    }

    public void computeSalary() {
        if (basePay < 8.00) {
            System.out.println("Base pay cannot be less than $8.00");
        } else if (hoursWorked > 60) {
            System.out.println("Employee cannot work more than 60 hours in a week");
        } else {
            double totalPay;
            if (hoursWorked <= 40) {
                totalPay = basePay * hoursWorked;
            } else {
                totalPay = (40 * basePay) + ((hoursWorked - 40) * basePay * 1.5);
            }
            System.out.println("Total pay: $" + totalPay);
        }
    }
    
    	
   
        public static void main(String[] args) {
            TalentSprint employee1 = new TalentSprint(7.50, 35);
            System.out.print("Employee 1: ");
            employee1.computeSalary();

            TalentSprint employee2 = new TalentSprint(8.20, 47);
            System.out.print("Employee 2: ");
            employee2.computeSalary();

        }

}
