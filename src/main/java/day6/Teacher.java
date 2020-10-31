package day6;

import java.util.Random;

public class Teacher {
    String name;
    String lesson;

    public Teacher(String name, String lesson){
        this.name = name;
        this.lesson = lesson;

    }

    public void evaluate(Student student, int grade){
        String strGrade = "";

        switch (grade) {
            case 2:
                strGrade = "неудовлетворительно";
                break;
            case 3:
                strGrade = "удовлетворительно";
                break;
            case 4:
                strGrade = "хорошо";
                break;
            case 5:
                strGrade = "отлично";
                break;
            default:
                strGrade = "null. весь месяц пил пиво на последней парте"  ;
                break;
        }
        System.out.println("Преподаватель оценил студента с именем " + student.getName()
                + " по предмету " + lesson
                + " на оценку " + grade);
    }

    public void evaluate(Student student) {
        int grade;
        String strGrade = "";

        Random random = new Random();
        if (student.getSex().equals("man")) {
            grade = random.nextInt(3) + 2;
        } else {
            grade = random.nextInt(1) + 4;
        }

        switch (grade) {
            case 2:
                strGrade = "неудовлетворительно";
                break;
            case 3:
                strGrade = "удовлетворительно";
                break;
            case 4:
                strGrade = "хорошо";
                break;
            case 5:
                strGrade = "отлично";
                break;
        }
        System.out.println("Преподаватель оценил студента с именем " + student.getName()
                            + " по предмету " + lesson
                            + " на оценку " + grade);

    }
}
