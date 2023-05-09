/**
 * @author Julio Vasquez
 * import library of Date java
 */
import java.util.Date;
/**
 * represents objects of class Person
 */
public class Person {
    /**
     * represents the private name attribute
     */
    private String name;
    /**
     * represents the private lastName1 attribute
     */
    private String lastName1;
    /**
     * represents the private lastName2 attribute
     */
    private String lastName2;
    /**
     * represents the private dateBirth attribute
     */
    private Date dateBirth;
    /**
     * represents the private height attribute
     */
    private float height;

    /**
     * constructor of class Person
     * @param name
     * @param lastName1
     * @param lastName2
     * @param dateBirth
     * @param height
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }
    /**
     * getter of name
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * setter of name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * getter of lastName1
     * @return lastName1
     */
    public String getLastName1() {
        return lastName1;
    }
    /**
     * setter of lastName1
     * @param lastName1
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }
    /**
     * getter of lastName2
     * @return number
     */
    public String getLastName2() {
        return lastName2;
    }
    /**
     * setter of lastName2
     * @param lastName2
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }
    /**
     * getter of dateBirth
     * @return dateBirth
     */
    public Date getDateBirth() {
        return dateBirth;
    }
    /**
     * setter of dateBirth
     * @param dateBirth
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }
    /**
     * getter of height
     * @return height
     */
    public float getHeight() {
        return height;
    }
    /**
     * setter of height
     * @param height
     */
    public void setHeight(float height) {
        this.height = height;
    }
}
