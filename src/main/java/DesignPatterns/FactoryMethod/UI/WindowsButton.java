package DesignPatterns.FactoryMethod.UI;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows button is created!");
    }
}
