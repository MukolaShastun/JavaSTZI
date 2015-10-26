package com.nikola.Stolovka;


/**
 * Created by Микола on 21.10.2015.
 */
public class Stolova {
    public static void main(String[] args) {
        Stolovka2[] stolovk = new Stolovka2[5];
        stolovk[0] = new Stolovka2(20, 7, "гірчиця");
        stolovk[1] = new Stolovka2(25, 10, "Картопля");
        stolovk[2] = new Stolovka2(5, 16, "Відбивна" );
        stolovk[3] = new Stolovka2(8, 28, "Coca Cola");
        stolovk[4] = new Stolovka2(2 , 0, "салат");

        for ( int i = 0; i < stolovk.length; i++){
            System.out.println(stolovk[i]);
        }
    }
}
