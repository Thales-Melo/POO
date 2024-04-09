public class Departamento {
    private String name;
    private Funcionario employee_list[];

    public void setEmployee_list(Funcionario[] employee_list) {
        this.employee_list = employee_list;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Funcionario[] getEmployee() {
        return employee_list;
    }

    public String getName() {
        return name;
    }


    public void addEmployeeToDepartment(Funcionario employee) {
        for (int i=0; i<employee_list.length; i++) {
            if (employee_list[i] == null) {
                employee_list[i] = employee;
                break;
            }
        }
    }


    public void createEmployeelist(int size) {
        employee_list = new Funcionario[size];
    }


    public void growSalary(double rate) {
        for (int i=0; i<employee_list.length; i++) {
            Funcionario emp = employee_list[i];
            if (emp != null) {
                emp.setSalary(emp.getSalary()+emp.getSalary()*(rate/100));
            }
        }
    }


    public double departmentSalary() {
        double departSalary = 0;
        for (int i=0; i<employee_list.length; i++) {
            Funcionario emp = employee_list[i];
            if (emp != null) {
                departSalary += emp.getSalary();
            }
        }

        return departSalary;
    }

    public Funcionario removeEmployee(int i) {
        Funcionario emp = employee_list[i];
        for (int k=i; k<employee_list.length; k++) {
            employee_list[k] = employee_list[k+1];
        }

        return emp;
    }

}
