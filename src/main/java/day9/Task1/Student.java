package day9.Task1;

public class Student extends Human {
    private String groupName;

    public Student (String name, String group){
        super(name);
        this.groupName = group;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroup(String group) {
        this.groupName = group;


    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем "+ getName());
    }
}
