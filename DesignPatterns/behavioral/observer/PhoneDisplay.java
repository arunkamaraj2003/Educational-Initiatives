public class PhoneDisplay implements WeatherObserver {
    private int temperature;

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
        display();
    }

    private void display() {
        System.out.println("Phone Display: Temperature is " + temperature + " degrees.");
    }
}
