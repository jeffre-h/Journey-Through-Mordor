package com.group21.app.Entity;

import java.awt.*;
/**
 * This abstract parent class has attributes
 * for the subclasses enemy, rewards, and character
 * 
 */
public abstract class Entity {
    public Point position;
    public String direction;
    public boolean collisionOn = false;
}
