public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        WeatherObserver phoneDisplay = new PhoneDisplay();
        WeatherObserver lcdPanel = new LCDPanel();

        station.addObserver(phoneDisplay);
        station.addObserver(lcdPanel);

        station.setTemperature(25);
        station.setTemperature(30);
    }
}
