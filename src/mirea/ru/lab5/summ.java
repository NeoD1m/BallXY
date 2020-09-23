package mirea.ru.lab5;

public class summ {

    summ(int num){
        String numS = num+"";
        int stop = numS.length();
        int c = 0;
        System.out.println(summator(numS,c,stop,0));

    }
    public int summator(String num,int c,int length,int res){

        char temp = num.charAt(c);
        int temp2 = Integer.parseInt(String.valueOf(temp));
        res += temp2;
        c++;
        if (c != length) {
            return summator(num, c, length,res);
        } else return res;
    }

}
