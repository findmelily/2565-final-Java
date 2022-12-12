
package alltest;

import finalhelpme.Person;
import finalhelpme.Department;
import application.Application;

public class Review {

    public static void main(String[] args) {
        testPerson();
        testDepartment();
        testApplication();
    }

    public static void testPerson() {
        System.out.println("test all blank: " + new Person("", "", -2));
    }

    public static void testDepartment() {

        System.out.println("test all blank: " + new Department(""));
    }

    private static void testApplication() {
        
    }
}
