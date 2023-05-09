/**
 * @author Julio Vasquez.
 * import library of ArrayList java.
 */

import java.util.ArrayList;

/**
 * represents objects of class Fruit
 */
public class Fruit {
    /**
     * represents the private name attribute
     */
    private String name;
    /**
     * represents the private average Weight attribute
     */
    private float averageWeight;
    /** Declaración de un ArrayList de "String". represta el atributo color*/
    public ArrayList<String> colors = new ArrayList<String>();

    /**
     * getter of color
     * @return colors
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * setter of colors
     * @param colors
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}
