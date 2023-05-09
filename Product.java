/**
 * @author Julio Vasquez
 * represents objects of class Product
 */
public class Product {
    /**
     * represents the private name attribute
     */
    private String name;
    /**
     * represents the public value attribute
     */
    public float value;
    /**
     * represents the protected amount attribute
     */
    protected int amount;
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
     * getter of value
     * @return value
     */
    public float getValue() {
        return value;
    }
    /**
     * setter of value
     * @param value
     */
    public void setValue(float value) {
        this.value = value;
    }
    /**
     * getter of amount
     * @return amount
     */
    public int getAmount() {
        return amount;
    }
    /**
     * setter of amount
     * @param amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
