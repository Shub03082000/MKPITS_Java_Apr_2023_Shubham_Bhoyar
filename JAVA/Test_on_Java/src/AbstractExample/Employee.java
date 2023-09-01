package AbstractExample;

abstract class Employee {
    private String name;
    private double paymentPerHour;

    public Employee() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPaymentPerHour(double paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }


    abstract void calculateSalary(double paymentPerHour);
}
