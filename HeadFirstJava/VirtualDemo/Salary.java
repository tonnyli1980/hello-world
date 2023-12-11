package VirtualDemo;

public class Salary extends Employee {
    public double salary; //Annual VirtueDemo.Salary

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if(newSalary >= 0.0)
        {
            salary = newSalary;
        }
    }

    public double computePay()
    {
        System.out.println("computing salary pay for " + getName());
        return salary/52;
    }
}
