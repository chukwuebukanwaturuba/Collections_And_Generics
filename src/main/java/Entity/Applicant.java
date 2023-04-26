package Entity;

public class Applicant extends Person{
    //private String name;
    private int age;
    private boolean isEmployed;

    public Applicant(String name, int age) {
        super(name);
        this.age = age;
        this.isEmployed = false;
    }



    public int getAge() {
        return age;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }
}
