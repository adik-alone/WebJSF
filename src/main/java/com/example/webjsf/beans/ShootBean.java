package com.example.webjsf.beans;

import jakarta.inject.Named;

@Named
public class ShootBean {
    private String X;
    private String Y;
    private String Z;
    private boolean shoot;

    public ShootBean(){}

    public boolean isShoot() {
        return shoot;
    }

    public void setShoot(boolean shoot) {
        this.shoot = shoot;
    }

    public String getX() {
        return X;
    }

    public void setX(String x) {
        X = x;
    }

    public String getY() {
        return Y;
    }
    public void setY(String y) {
        Y = y;
    }

    public String getZ() {
        return Z;
    }

    public void setZ(String z) {
        Z = z;
    }

    public void doShoot(){
        shoot = true;
    }
}
