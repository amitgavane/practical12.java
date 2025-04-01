package companyhierarchyproject;

class CEO {
    private String name;
    private int experience;

    public CEO(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }
}

class Executives extends CEO {
    private String department;

    public Executives(String name, int experience, String department) {
        super(name, experience);
        this.department = department;
    }
}

class Managers extends Executives {
    private int teamSize;

    public Managers(String name, int experience, String department, int teamSize) {
        super(name, experience, department);
        this.teamSize = teamSize;
    }
}

class Employees extends Managers {
    private String role;

    public Employees(String name, int experience, String department, int teamSize, String role) {
        super(name, experience, department, teamSize);
        this.role = role;
    }
}

public class CompanyHierarchyProject {
    public static void main(String[] args) {
        CEO myCEO = new CEO("Amit Gavane", 25);
        System.out.println("CEO object created successfully.");

        Executives myExecutive = new Executives("Rohit More", 18, "Finance");
        System.out.println("Executive object created successfully.");

        Managers myManager = new Managers("Govindraj Wattamwar", 12, "Sales", 10);
        System.out.println("Manager object created successfully.");

        Employees myEmployee = new Employees("Raj", 5, "IT", 5, "Software Developer");
        System.out.println("Employee object created successfully.");
    }
}
