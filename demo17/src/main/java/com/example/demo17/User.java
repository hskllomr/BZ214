package com.example.demo17;
import javafx.scene.paint.Color;
public class User {
    private Color color;
    private String name;

    public User(Color color,String name)
    {
        this.color=color;
        this.name=name;
    }

    public Color getColor()
    {
        return color;
    }

}
