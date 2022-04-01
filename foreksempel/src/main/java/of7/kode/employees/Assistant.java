package of7.kode.employees;

public class Assistant extends Employee {

    public Assistant(String name) {
        super(name, "Assistant");
    }

    public static void main(String[] args) {
        Employee assistant = new Assistant("Magnus");
        assistant.performTask("Arrange meeting");
        assistant.performTask("Order stock");
    }

}
