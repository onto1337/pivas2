public class Main {
    public static void main(String[] args) {
        runSystem();
    }
    public static void runSystem(){
        SystemInitializer systemInitializer=new SystemInitializer();
        UIClassContainer uiClassContainer= systemInitializer.initialize();
        uiClassContainer.getUserInterface().setVisible(true);
    }
}
