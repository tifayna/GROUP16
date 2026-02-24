
public class Lab2_PersonStudentStaff {
    public static void main(String[] args) {

        System.out.println("--- Section 1 ---");
//creating a person object
        Person p1 = new Person("Amina Hassan", "Stonetown, Zanzibar");
        System.out.println(p1);
//creating  two student objects
        Student s1 = new Student("Juma Ali", "Chwaka, Zanzibar", "BITA", 2, 1500000);
        Student s2 = new Student("Fatma Omar", "Mbweni, Zanzibar", "BCS", 1, 1800000);
        System.out.println(s1);
        System.out.println(s2);
//creating a staff object
        Staff staff1 = new Staff("Dr. Khalid Salum", "Vuga, Zanzibar", "SCCMS", 3500000);
        System.out.println(staff1);
//Inheritance in action

        System.out.println("\n--- Section 2 ---");
        System.out.println("Student name: " + s1.getName());
        System.out.println("Student address: " + s1.getAddress());
        System.out.println("Student program: " + s1.getProgram());

        System.out.println("\nStaff name: " + staff1.getName());
        System.out.println("Staff department: " + staff1.getDepartment());

        s1.setAddress("Fumba, Zanzibar");
        System.out.println("\nAfter change: " + s1);


        System.out.println("\n--- Section 3 ---");

        Person[] people = {
            new Person("Bakari Juma", "Mwanakwerekwe, Zanzibar"),
            new Student("Zainab Moh'd", "Kiembe Samaki, Zanzibar", "BITA", 3, 1500000),
            new Student("Hassan Said", "Amani, Zanzibar", "BCS", 1, 1800000),
            new Staff("Prof. Mwanaisha Ali", "Mazizini, Zanzibar", "SCCMS", 4500000)
        };
//polymorphic 
        for (Person p : people) {
            System.out.println(p);   
        }


        System.out.println("\n--- Section 4 ---");

        int studentCount = 0;
        int staffCount = 0;

        for (Person p : people) {
            if (p instanceof Student) {
                Student s = (Student) p;
                System.out.println(s.getName() + " is a Student in " + s.getProgram());
                studentCount++;
            }
            else if (p instanceof Staff) {
                Staff st = (Staff) p;
                System.out.println(st.getName() + " is Staff in " + st.getDepartment());
                staffCount++;
            }
            else {
                System.out.println(p.getName() + " is a Person");
            }
        }

        System.out.println("\nSummary: " + studentCount + " students, " + staffCount + " staff");
    }
}
