package creational.singleton;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String config;

    private ConfigurationManager() {
        // Load configuration from file or database
        config = "Default Configuration";
    }

    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
