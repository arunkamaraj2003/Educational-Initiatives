public class LCDPanel implements WeatherObserver {
    private int temperature;

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
        display();
    }

    private void display() {
        System.out.println("LCD Panel: Temperature is " + temperature + " degrees.");
    }
}
