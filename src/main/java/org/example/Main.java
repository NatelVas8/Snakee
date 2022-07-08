package org.example;

import javax.swing.*;

public class Main extends JFrame {
    public Main(){ //дефолтный конструктор
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //прога завершается при закрытии окна
        setSize(320,345); //размеры экрана
        setLocation(400,400); //локация экрана в центре
        add(new GameField());
        setVisible(true);//делает экран видимым
    }
    public static void main (String[]args){
        Main main = new Main();
    }
}