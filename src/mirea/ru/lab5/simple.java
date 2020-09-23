package mirea.ru.lab5;

public class simple {


    simple(int num){
        rec(num,num,0);
    }

    public void rec(int num, int del, int c){
        if (num % del == 0) { c++; System.out.println(del); }
        del--;
        //System.out.println(num + " " + del + " " + c);
        if (del != 0) {

            rec(num, del, c);
        } else {
            if (c == 2) System.out.print("Number is simple"); else System.out.print("Number is not simple");
        }
    }
}
