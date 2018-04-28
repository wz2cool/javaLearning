package com.frwan.desgin.create.abstractfactory;

public class AccessFactory extends Factory {
    public Department createDepartment() {
        return new AccessDepartment();
    }

    public User createUser() {
        return new AccessUser();
    }
}
