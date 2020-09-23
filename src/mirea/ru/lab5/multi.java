package mirea.ru.lab5;

public class multi {


    multi(int num){
        rec(num,1,0);
        //rec2(3,1,0,3);
    }

    public void rec(int num, int del, int c){
        if (num % del == 0) { c++; System.out.print(del);
        }
        rec2(del,1,0,del);


        del++;

        //System.out.println(num + " " + del + " " + c);
        if (del != num+1) {
            rec(num, del, c);
        }
    }
    public void rec2(int num, int del, int c,int origin){
        if (num % del == 0) { c++;  //System.out.println( " // "+ del);
        }
        //System.out.println(num + " " + del + " " + c);
        del++;


        if (del != num+1) {
            rec2(num, del, c,origin);
        } else {
            if (c == 2) System.out.println( " /// " + origin);
        }
    }
}
