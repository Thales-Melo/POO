public class Student {
    private String name;
    private double[] gradesList;

    public Student () {
        gradesList = new double[3];
    }

    public double[] getGradesList() {
        return gradesList;
    }

    public String getName() {
        return name;
    }

    public void setGradesList(double[] gradesList) {
        this.gradesList = gradesList;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double mean() {
        return (gradesList[0] + gradesList[1] + gradesList[2] ) / 3;
    }

    public void printResult() {
        if (mean() >= 7) {
            System.out.printf("Aprovado");
        }
        else {
            System.out.printf("Prova Final");
        }
    }

    public void setGrade(double grade, int i) {
        gradesList[i] = grade;
    }

    public void compareToClassMean(double classMean) {
        if (mean() > classMean) {
            System.out.println("Acima");
        }
        else if (mean() < classMean) {
            System.out.println("Abaixo");
        }
        else {
            System.out.println("Na media");
        }
    }
}
