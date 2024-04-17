public class User {
    private int RG;
    private String name;
    private int age;

    public User (int RG, String name, int age) {
        this.name = name;
        this.age = age;
        this.RG = RG;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public int getAge() {
        return this.age;
    }
    
    public String getName() {
        return this.name;
    }

    public int getRG() {
        return this.RG;
    }

}
