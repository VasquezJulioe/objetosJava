/**
 * @author Julio Vasquez
 * represents objects of class BankAccount
 */
public class BankAccount {

    /**
     * represents the private accountNumber attribute
     */
    private int accountNumber;

    /**
     * represents the private activated attribute
     */
    private boolean activated;

    /**
     * getter of accountNumber
     * @return accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * setter of accountNumber
     * @param accountNumber
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * getter of activated
     * @return activated
     */
    public boolean getActivated() {
        return activated;
    }

    /**
     * setter of activated
     * @param activated
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
