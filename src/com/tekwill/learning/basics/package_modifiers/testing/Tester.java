package com.tekwill.learning.basics.package_modifiers.testing;

import com.tekwill.learning.basics.package_modifiers.software.Employee;

public class Tester extends Employee {
    private Employee employee;

    public void checkPublic() {
        publicFirstName = "value";
        public_doWork();
        employee.publicFirstName = "value";
        employee.public_doWork();
    }

    public void checkProtected() {
//        protectedFirstName = "value";
//        protected_doWork();
//        employee.protectedFirstName = "value"; [NO ACCESS]
//        employee.protected_doWork();
    }

    public void checkDefault() {
//        defaultFirstName = "value";
//        default_doWork();
//        employee.defaultFirstName = "value"; [NO ACCESS]
//        employee.default_doWork();
    }

    public void checkPrivate() {
//        privateFirstName = "value";
//        private_doWork();                       [NO ACCESS!]
//        employee.privateFirstName = "value";
//        employee.private_doWork();
    }

}