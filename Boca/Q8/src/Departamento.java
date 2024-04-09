public class Departamento {
    private String name;
    private Funcionario employee[];

    public void setEmployee(Funcionario[] employee) {
        this.employee = employee;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Funcionario[] getEmployee() {
        return employee;
    }

    public String getName() {
        return name;
    }
}
