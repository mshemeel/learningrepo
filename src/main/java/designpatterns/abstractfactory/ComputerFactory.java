package main.java.designpatterns.abstractfactory;

import main.java.designpatterns.factory.Computer;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
