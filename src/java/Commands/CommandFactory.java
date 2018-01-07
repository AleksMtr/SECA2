package Commands;

public class CommandFactory {
    
    public Command createCommand(String action)
    {
        switch (action) {
        case "viewBurger":
        return new ViewAllBurgers();
        case "create":
        return new CreateBurgerCommand();
        case "buyBurger":
        return new BuyBurgerCommand();
        case "clearCart":
        return new ClearCartCommand();
        default:
        break;
        }
        return null;
    }
}
