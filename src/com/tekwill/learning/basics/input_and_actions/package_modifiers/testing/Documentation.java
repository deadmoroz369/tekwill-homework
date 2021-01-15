package com.tekwill.learning.basics.input_and_actions.package_modifiers.testing;

import com.tekwill.learning.basics.input_and_actions.package_modifiers.software.Employee;

public class Documentation extends Employee {
    private Employee employee;

    public void checkPublic() {
        employee.publicFirstName = "value";
        employee.public_doWork();
    }

    public void checkProtected() {
//        employee.protectedFirstName = "value";
//        employee.protected_doWork(); [NO ACCESS]
    }

    public void checkDefault() {
//        employee.defaultFirstName = "value";
//        employee.default_doWork(); [NO ACCESS]
    }

    public void checkPrivate() {
//        employee.privateFirstName = "value";
//        employee.private_doWork();
    }

}
