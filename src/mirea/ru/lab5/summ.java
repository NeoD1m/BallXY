package mirea.ru.lab5;

public class summ {

    summ(int num){
        System.out.println(summator(num,0));
    }
    public int summator(int num,int c){
        c += num % 10;
        num = num/10;
        if (num != 0) {
            return summator(num, c);
        } else return c;
    }
}