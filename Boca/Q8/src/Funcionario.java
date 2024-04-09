public class Funcionario {
    private String name;
    private double salary;
    private Data date;

    public void setDate(Data date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }


    public Data getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    

}