package finalhelpme;

public class Person {

    /*
1. Create a Person class in "exam" package containing 
    the following instance variables, which are all private:
    (1) code: int (cannot be changed after initialization).
    (2) firstname: String.
    (3) lastname: String.
    (4) type: int (cannot be changed after initialization).
... (a) This constructor will assign a unique code to each Person starting from 
    the last-three digits of your student id onward. (hint: use a static variable 
    to keep track of the code to be used for the next person).
     */
    private final int code;
    private String firstname;
    private String lastname;
    private final int type;

    private static double nextDigit = 051D;

    public Person(String firstname, String lastname, int type) {
        this.firstname = validStringCheck(firstname) ? firstname : "Pinngam";
        this.lastname = validStringCheck(lastname) ? lastname : "Sombutsri";
        this.type = type < 0 ? type : 1;
        this.code = (int) nextDigit++;
    }

    static boolean validStringCheck(String s) {
        return s != null && !s.isBlank();
    }

    /*
1.1) Create a contructor: Person(String firstname, String lastname, int type).
    (a) This constructor will assign a unique code to each Person starting from 
    the last-three digits of your student id onward. (hint: use a static variable 
    to keep track of the code to be used for the next person).
    (b) Neither firstname nor lastname can be null or blank. If any input argument 
    violates this rule, use your firstname and your lastname as the default values 
    respectively.
    (c) The type must be a non-negative number. 
    Use 1 as the default value if the input argument violates this rule.
     */
 /*
1.2) Create another constructor: Person(String firstname, String lastname). 
    Use the default value for type as stated in 1.1. Avoid duplicate coding. 
     */
    public Person(String firstname, String lastname) {
        this(firstname, lastname, 1);
    }

    /*
1.3) Create all four public getters and two public setters for firstname and lastname.
    Do not change the firstname or the lastname if the input argument is null or blank.
     */
    public int getCode() {
        return code;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getType() {
        return type;
    }

    public void setFirstname(String firstname) {
        if (validStringCheck(firstname)) {
            this.firstname = firstname;
        }
    }

    public void setLastname(String lastname) {
        if (validStringCheck(lastname)) {
            this.lastname = lastname;
        }
    }

    /*
1.4) Override toString() method to return a string representation in this format:
    [Person: CODE (FIRSTNAME LASTNAME) TYPE] where CODE, FIRSTNAME, 
    LASTNAME, and TYPE are code, firstname, lastname, and type of the person.
     */
    @Override
    public String toString() {
        return "[Person: " + code + "(" + firstname +" "+ lastname + ")" + type + ']';
    }

}
