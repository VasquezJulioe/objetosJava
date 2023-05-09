/**
 * @author Julio Vasquez
 * represents objects of class Car
 */
public class Car {
    /**
     * represents the private number attribute
     */
    private int number;
    /**
     * represents the private series attribute
     */
    private int series;
    /**
     * represents the private mark attribute
     */
    public String mark;
    /**
     * represents the private plate attribute
     */
    public String plate;
    /**
     * represents the private owner attribute
     */
    protected String owner;
    /**
     * represents the private color attribute
     */

    public String color;

    /**
     * getter of number
     * @return number
     */

    public int getNumber() {
        return number;
    }

    /**
     * setter of number
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * getter of series
     * @return series
     */
    public int getSeries() {
        return series;
    }

    /**
     * setter of series
     * @param series
     */
    public void setSeries(int series) {
        this.series = series;
    }

    /**
     * getter of mark
     * @return mark
     */
    public String getMark() {
        return mark;
    }

    /**
     * setter of mark
     * @param mark
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * getter of plate
     * @return
     */
    public String getPlate() {
        return plate;
    }

    /**
     * setter of plate
     * @param plate
     */
    public void setPlate(String plate) {
        this.plate = plate;
    }

    /**
     * getter of owner
     * @return
     */
    public String getOwner() {
        return owner;
    }

    /**
     * setter of owner
     * @param owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * getter of color
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * setter of color
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }
}
