package com.frwan.desgin.create.abstractfactory;

public class SqlServerFactory extends Factory {
    public Department createDepartment() {
        return new SqlServerDepartment();
    }

    public User createUser() {
        return new SqlServerUser();
    }
}
