import java.util.Scanner;

public class J1_09 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int num_students = input.nextInt();
        Student[] classroom = new Student[num_students];
        double classMean = 0;

        for (int i=0; i<num_students; i++) {
            String line[] = input.nextLine().split("\\s+");
            Student student = new Student();

            student.setName(line[0]);
            student.setGrade(0, Double.parseDouble(line[1]));
            student.setGrade(1, Double.parseDouble(line[2]));
            student.setGrade(2, Double.parseDouble(line[3]));

            classroom[i] = student;
            classMean += student.mean();
        }

        classMean /= num_students;

        System.out.println("Nome,Nota,Situacao,Media");
        for (int i=0; i<num_students; i++) {
            Student s = classroom[i];
            System.out.printf("%s,%.1f,", s.getName(), s.mean());
            s.printResult();
            System.out.printf(",");
            s.compareToClassMean(classMean);
            System.out.println();
        }

        input.close();
    }
}
