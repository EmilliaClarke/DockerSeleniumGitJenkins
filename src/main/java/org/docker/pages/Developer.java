package org.docker.pages;

public class Developer {


    String name;

    public boolean isAvail() {
        return avail;
    }

    boolean flag;

    boolean avail;

    int puubDate;

    public Developer(boolean flag, String name, boolean avail, int puubDate, int price2) {
        this.name = name;
        this.flag = flag;
        this.avail = avail;
        this.puubDate = puubDate;
        this.price2 = price2;
    }

    public int getPrice2() {
        return price2;
    }

    int price2;

    public int getPuubDate() {
        return puubDate;
    }

    public String getName() {
        return name;
    }

    public boolean isFlag() {
        return flag;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", flag=" + flag +
                '}';
    }
}
