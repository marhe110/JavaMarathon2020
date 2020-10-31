package day6;

public class Student {
    private String name;
    private String surname;
    private int year;
    private int course;
    private String sex;

    public String getName() {
        return name;
    }


    public int getYear() {
        return year;
    }

    public String getSex() {
        if (name.equals("Иван")){
            return "man";
        }
        if (name.equals("Ольга")){
            return "woman";
        }
        return "";
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Student(String name){
        this.name = name;
    }

}
