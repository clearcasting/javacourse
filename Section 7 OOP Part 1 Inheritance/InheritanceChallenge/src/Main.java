public class Main {
    public static void main(String[] args) {
        SalariedEmployee rick = new SalariedEmployee("Rick", "01/01/2000", "01/01/2020", 100000);

        System.out.println(rick);
        System.out.println(rick.getAge());
        System.out.println(rick.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990", "03/03/2020", 35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());
    }
}
