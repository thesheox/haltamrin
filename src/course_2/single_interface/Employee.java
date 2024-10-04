package course_2.single_interface;

// Class implementing the interface
class Employee implements Payable {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void pay() {
        System.out.println(name + " has been paid.");
    }
}