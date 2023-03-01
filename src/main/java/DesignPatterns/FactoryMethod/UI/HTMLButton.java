package DesignPatterns.FactoryMethod.UI;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("Web Button is created!");
    }
}
