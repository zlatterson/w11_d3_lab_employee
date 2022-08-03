package staff;

public abstract class Employee {
    protected String name;
    protected String niNumber;
    protected double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName){
        if (newName != null){
            this.name = newName;
        }
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double amount){
        if(amount > 0){
            salary = salary + amount;
        }
    }
    public double payBonus(){
        return salary * 0.01;
    }

}
