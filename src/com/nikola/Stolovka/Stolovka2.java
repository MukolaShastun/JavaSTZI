package com.nikola.Stolovka;

/**
 * Created by Микола on 21.10.2015.
 */
public class Stolovka2 {
    int price;
    int howmany;
    String name;
    String mark;

    public Stolovka2(int price, int howmany, String name) {
        this.price = price;
        this.howmany = howmany;
        this.name = name;

        this.mark = "Торчин";

    }

    public void changeMark(String mark) {
        this.mark = mark;

    }


    public String toString() {
        return String.format(
                "%3d гривень,назва родукту: %10s, штук залишилось %d. Марка товару: %s",
                this.price, this.name, this.howmany, this.mark
        );
    }
}
