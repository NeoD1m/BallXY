package mirea.ru.lab5;

public class zeroTwo {

    zeroTwo(int a,int b){
        System.out.print(fun(a,b));
    }

    int fun(int a,int b) {
        if (a> b+1) return 0;
        if (a==0 || b==0) return 1;
        return fun(a,b-1)+fun(a-1,b-1);
    }
}
