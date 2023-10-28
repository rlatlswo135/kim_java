package ch07;

public sealed interface InterfaceA permits InterfaceB { // Java17 
    void methodA();
}
