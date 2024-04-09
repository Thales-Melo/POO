import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String name;
    private String CNPJ;
    private List <Departamento> departmentList;

    public Empresa () {
        departmentList = new ArrayList<Departamento>();
    }

    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }
    
    public void setDepartmentList(List<Departamento> departmentList) {
        this.departmentList = departmentList;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCNPJ() {
        return CNPJ;
    }

    public List<Departamento> getDepartmentList() {
        return departmentList;
    }

    public Departamento getDepartment(int i) {
        return departmentList.get(i);
    }

    public String getName() {
        return name;
    }
    

    public void addDepartmentToCompany(Departamento department) {
        departmentList.add(department);
    }

    public void growDepartmentSalary(int department, double rate) {
        Departamento depart = getDepartment(department);
        depart.growSalary(rate);
    }

    public double departmentSalary(int department) {
        return getDepartment(department).departmentSalary();
    }

    
    public void changeEmployeeFromDepartment(int src, int dest, int employee_num) {
        Departamento dpt_src = departmentList.get(src);
        Departamento dpt_dest = departmentList.get(dest);

        Funcionario emp = dpt_src.removeEmployee(employee_num);
        dpt_dest.addEmployeeToDepartment(emp);  
    }


    public String departmentName(int i) {
        return departmentList.get(i).getName();
    }

}
