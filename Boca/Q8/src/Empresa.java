public class Empresa {
    private String name;
    private String CNPJ;
    private Departamento departments[];

    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }
    public void setDepartments(Departamento[] departments) {
        this.departments = departments;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCNPJ() {
        return CNPJ;
    }

    public Departamento[] getDepartments() {
        return departments;
    }

    public String getName() {
        return name;
    }
    
}
