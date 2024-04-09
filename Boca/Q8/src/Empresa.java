public class Empresa {
    private String name;
    private String CNPJ;
    private Departamento departmentList[];

    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }
    public void setDepartmentList(Departamento[] departmentList) {
        this.departmentList = departmentList;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCNPJ() {
        return CNPJ;
    }

    public Departamento[] getDepartmentList() {
        return departmentList;
    }

    public Departamento getDepartment(int i) {
        return departmentList[i];
    }

    public String getName() {
        return name;
    }
    

    public void addDepartmentToCompany(Departamento department) {
        for (int i=0; i<departmentList.length; i++) {
            if (departmentList[i] == null) {
                departmentList[i] = department;
                break;
            }
        }
    }

    public void createDepartmentList(int size) {
        departmentList = new Departamento[size];
    }

    public void growDepartmentSalary(int department, double rate) {
        Departamento depart = getDepartment(department);
        depart.growSalary(rate);
    }

    public double departmentSalary(int department) {
        return getDepartment(department).departmentSalary();
    }

    
    public void changeEmployeeFromDepartment(int src, int dest, int employee_num) {
        Departamento dpt_src = departmentList[src];
        Departamento dpt_dest = departmentList[dest];

        Funcionario emp = dpt_src.removeEmployee(employee_num);
        dpt_dest.addEmployeeToDepartment(emp);  
    }


    public String departmentName(int i) {
        return departmentList[i].getName();
    }

}
