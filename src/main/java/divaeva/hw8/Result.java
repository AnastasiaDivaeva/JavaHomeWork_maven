package divaeva.hw8;

public class Result {
    public static void main(String[] args) {
        Aspirant aspirant1 = new Aspirant("Maria", "DaCosta", "7-A", 5, "Monitoring of animal migration.");
        Aspirant aspirant2 = new Aspirant("Alexandra", "Daddario", "1-B", 2, "The technology of cloning organisms");

        Student student1 = new Student("Cass", "Daley", "7-A", 4);
        Student student2 = new Student("Dorothy", "Dandridge", "1_B", 3);

        Student[] students = {student1, student2, aspirant1, aspirant2};
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " Scholarship: " + student.getScholarship());
        }

        System.out.println("Are Aspirants equals: " + aspirant1.equals(aspirant2));
        System.out.println("Are Students equals: " + student1.equals(student2));
    }

}


