package com.tekwill.learning.basics.input_and_actions.package_modifiers.software;

public class Meeting extends Employee {
    private Employee employee;

    public void checkPublic() {
        employee.publicFirstName = "value";
        employee.public_doWork();
    }

    public void checkProtected() {
        employee.protectedFirstName = "value";
        employee.protected_doWork();
    }

    public void checkDefault() {
        employee.defaultFirstName = "value";
        employee.default_doWork();
    }

    public void checkPrivate() {
//     public void checkPrivate() {
        int test; // on local variables no access modifier
//        employee.privateFirstName = "value"; - no access
//        employee.private_doWork(); - no access
    }

}

