package creational.singleton;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        System.out.println(configManager.getConfig());

        configManager.setConfig("Updated Configuration");
        System.out.println(configManager.getConfig());
    }
}
