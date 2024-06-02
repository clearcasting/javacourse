public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker() {

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge() {
        // MM/DD/YYYY
        String[] split = birthDate.split("/");
        int birthYear = Integer.parseInt(split[2]);

        return 2024 - birthYear;
    }

    protected double collectPay() {
        if (endDate != null) {
            return 0.00;
        }
        return 1.00;
    }

    protected void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
