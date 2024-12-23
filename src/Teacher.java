public class Teacher extends Person{
    private String subject;
    private int yearsOfExperience;
    private int salary;
    public Teacher(String name, String surname, int age, String gender,String subject,int yearsOfExperience,int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }
    @Override
    public void giveRaise(float percentage){
        salary = (int) (salary*percentage);
    }
    @Override
    public int getYearsOfExperience(){
        return yearsOfExperience;
    }

    @Override
    public String toString() {
        return super.toString()+"I teach "+subject+", and My salary is "+salary;
    }
}
