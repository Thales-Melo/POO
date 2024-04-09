import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class J1_08 {
    public static void main(String[] args) throws Exception {
        Empresa company = new Empresa();
        Scanner input = new Scanner(System.in);

        String line[] = input.nextLine().split("\\s+");
        
        company.setName(line[0]);
        System.out.println(company.getName());
        company.setCNPJ(line[1]);
        System.out.println(company.getCNPJ());

        int n_deps = Integer.parseInt(line[2]);
        // company.createDepartmentList(n_deps);
        System.out.println("n_deps = " + n_deps);

        for (int i=0; i<n_deps; i++) {
            line = input.nextLine().split("\\s+");
            Departamento depart = new Departamento();

            
            depart.setName(line[0]);
            System.out.println("depart_name = " + depart.getName());
            int n_emps = Integer.parseInt(line[1]);
            System.out.println("N_funcionarios = " + n_emps);
            
            // depart.createEmployeelist(n_emps);
            for (int k=0; k<n_emps; k++) {
                line = input.nextLine().split("\\s+");

                Funcionario employee = new Funcionario();

                employee.setName(line[0]);
                System.out.println("employee_name = " + employee.getName());
                
                employee.setSalary(Double.parseDouble(line[1]));
                System.out.println("employee_salary = " + employee.getSalary());

                String date_str[] = line[2].split("/");
                Data date = new Data();
                date.setDay(Integer.parseInt(date_str[0]));
                date.setMonth(Integer.parseInt(date_str[1]));
                date.setYear(Integer.parseInt(date_str[2]));
                employee.setDate(date);
                
                depart.addEmployeeToDepartment(employee);
            }

            company.addDepartmentToCompany(depart);
        }
        
        System.out.println("\n\n\n\n");

        Locale loc = new Locale("pt", "BR");
        company.growDepartmentSalary(0, 10);
        company.changeEmployeeFromDepartment(0, 1, 0);
        System.out.printf(loc, "%s R$ %.2f\n", company.departmentName(0), company.departmentSalary(0));
        System.out.printf(loc, "%s R$ %.2f\n", company.departmentName(1), company.departmentSalary(1));
        

        input.close();
    }
}
