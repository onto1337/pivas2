import view.*;

public class UIClassContainer {
    private UserInterface userInterface;
    private CookInterface cookInterface;
    private ChefInterface chefInterface;
    private ChefAuthorizationInterface chefAuthorizationInterface;

    public UIClassContainer(UserInterface userInterface, CookInterface cookInterface, ChefInterface chefInterface, ChefAuthorizationInterface chefAuthorizationInterface) {
        this.userInterface = userInterface;
        this.cookInterface = cookInterface;
        this.chefInterface = chefInterface;
        this.chefAuthorizationInterface = chefAuthorizationInterface;
    }

    public UserInterface getUserInterface() {
        return userInterface;
    }

    public void setUserInterface(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    public CookInterface getCookInterface() {
        return cookInterface;
    }

    public void setCookInterface(CookInterface cookInterface) {
        this.cookInterface = cookInterface;
    }

    public ChefInterface getChefInterface() {
        return chefInterface;
    }

    public void setChefInterface(ChefInterface chefInterface) {
        this.chefInterface = chefInterface;
    }

    public ChefAuthorizationInterface getChefAuthorizationInterface() {
        return chefAuthorizationInterface;
    }

    public void setChefAuthorizationInterface(ChefAuthorizationInterface chefAuthorizationInterface) {
        this.chefAuthorizationInterface = chefAuthorizationInterface;
    }


}
