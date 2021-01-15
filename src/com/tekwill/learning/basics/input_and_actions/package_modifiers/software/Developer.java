package com.tekwill.learning.basics.input_and_actions.package_modifiers.software;

public class Developer extends Employee {
    private Employee employee;

    public void checkPublic() {
        publicFirstName = "value";
        public_doWork();
        employee.publicFirstName = "value";
        employee.public_doWork();
    }

    public void checkProtected() {
        protectedFirstName = "value";
        protected_doWork();
        employee.protectedFirstName = "value";
        employee.protected_doWork();
    }

    public void checkDefault() {
        defaultFirstName = "value";
        default_doWork();
        employee.defaultFirstName = "value";
        employee.default_doWork();
    }

    public void checkPrivate() {
//        privateFirstName = "value";
//        private_doWork();                       [NO ACCESS!]
//        employee.privateFirstName = "value";
//        employee.private_doWork();
    }

}
