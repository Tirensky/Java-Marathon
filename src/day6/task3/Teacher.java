package day6.task3;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        int score = (int) (Math.random() * 4 + 2);
        String result = switch (score) {
            case 3 -> "удовлетворительно";
            case 4 -> "хорошо";
            case 5 -> "отлично";
            default -> "неудовлетворительно";
        };
        System.out.println(
                "Преподователь " + name +
                " оценил студента с именем " + student.getName() +
                " по предмету " + subject +
                " на оценку " + result + "."
        );
    }
}
