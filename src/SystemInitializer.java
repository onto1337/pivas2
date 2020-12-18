import controller.ChefAuthorizationController;
import controller.ChefController;
import controller.CookController;
import controller.UserController;
import view.ChefAuthorizationInterface;
import view.ChefInterface;
import view.CookInterface;
import view.UserInterface;

public class SystemInitializer {
    SystemInitializer() {
    }

    public UIClassContainer initialize() {
        UserInterface userInterface = new UserInterface(new UserController());
        CookInterface cookInterface = new CookInterface(new CookController());
        ChefInterface chefInterface = new ChefInterface(new ChefController());
        ChefAuthorizationInterface chefAuthorizationInterface = new ChefAuthorizationInterface(new ChefAuthorizationController());

        UIClassContainer uiClassContainer;
        uiClassContainer = new UIClassContainer(userInterface,cookInterface,chefInterface,chefAuthorizationInterface);
        return uiClassContainer;
    }
}
