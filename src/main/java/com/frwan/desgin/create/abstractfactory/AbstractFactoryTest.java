package com.frwan.desgin.create.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        Factory sqlServerFactory = new SqlServerFactory();
        Department sqlServerDepartment = sqlServerFactory.createDepartment();
        User sqlServerUser = sqlServerFactory.createUser();
        System.out.println(sqlServerDepartment.getDepartment());
        System.out.println(sqlServerUser.getUser());

        Factory accessFactory = new AccessFactory();
        Department accessDepartment = accessFactory.createDepartment();
        User accessUser = accessFactory.createUser();
        System.out.println(accessDepartment.getDepartment());
        System.out.println(accessUser.getUser());
    }
}
