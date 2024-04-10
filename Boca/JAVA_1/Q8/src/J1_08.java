import java.util.Locale;
import java.util.Scanner;

public class J1_08 {
    public static void main(String[] args) throws Exception {
        Empresa company = new Empresa();
        Scanner input = new Scanner(System.in);

        String line[] = input.nextLine().split("\\s+");
        
        company.setName(line[0]);
        company.setCNPJ(line[1]);

        int n_deps = Integer.parseInt(line[2]);

        for (int i=0; i<n_deps; i++) {
            line = input.nextLine().split("\\s+");
            Departamento depart = new Departamento();

            depart.setName(line[0]);
            int n_emps = Integer.parseInt(line[1]);
            
            for (int k=0; k<n_emps; k++) {
                line = input.nextLine().split("\\s+");

                Funcionario employee = new Funcionario();

                employee.setName(line[0]);
                
                employee.setSalary(Double.parseDouble(line[1]));

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

        company.growDepartmentSalary(0, 10);
        company.changeEmployeeFromDepartment(0, 1, 0);
        
        company.printData();

        input.close();
    }
}
