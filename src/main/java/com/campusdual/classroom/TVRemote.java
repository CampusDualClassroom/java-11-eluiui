package com.campusdual.classroom;

public class TVRemote {
    private String color;
    public boolean on;
    public int channel;
    public int volume;

    public TVRemote(String color) {
        this.color = color;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public void channelUp() {
        this.channel++;
    }

    public void channelDown() {
        if (this.channel > 0) {
            this.channel--;
        }
    }

    public void volumeUp() {
        this.volume++;
    }

    public void volumeDown() {
        if (this.volume > 0) {
            this.volume--;
        }
    }

    public String getColor() {
        return this.color;
    }

}
