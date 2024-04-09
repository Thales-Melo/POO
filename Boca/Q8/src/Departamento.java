import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String name;
    private List <Funcionario> employee_list;
    // List<Integer> impares = new ArrayList<Integer>();

    public Departamento() {
        employee_list = new ArrayList<Funcionario>();
    }

    public void setEmployee_list(List<Funcionario> employee_list) {
        this.employee_list = employee_list;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Funcionario> getEmployee_list() {
        return employee_list;
    }

    public String getName() {
        return name;
    }


    public void addEmployeeToDepartment(Funcionario employee) {
        // int added = 0;
        // for (int i=0; i<employee_list.length; i++) {
        //     if (employee_list[i] == null) {
        //         employee_list[i] = employee;
        //         break;
        //     }
        // }
            employee_list.add(employee);

    }


    // public void createEmployeelist(int size) {
    //     employee_list = new Funcionario[size];
    // }


    public void growSalary(double rate) {
        for (int i=0; i<employee_list.size(); i++) {
            Funcionario emp = employee_list.get(i);
            if (emp != null) {
                emp.setSalary(emp.getSalary()+emp.getSalary()*(rate/100));
            }
        }
    }


    public double departmentSalary() {
        double departSalary = 0;
        for (int i=0; i<employee_list.size(); i++) {
            Funcionario emp = employee_list.get(i);
            if (emp != null) {
                departSalary += emp.getSalary();
            }
        }

        return departSalary;
    }

    public Funcionario removeEmployee(int i) {

        return employee_list.remove(i);
    }

}
