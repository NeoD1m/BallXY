package mirea.ru.lab5;

public class palindrom {

    palindrom(String word){
        int length = word.length();
        if (length % 2 == 1) nechet((length-1)/2,length/2,word,0,0); else chet(length/2,length/2,word,0,0);

    }

    void chet(int length,int pos,String word,int offset,int error){
        length--;
        //System.out.println(length + " " + offset + " " + word.charAt(pos-offset-1) + " " + word.charAt(pos+offset)); //DEBUG
        if (word.charAt(pos-offset-1) != word.charAt(pos+offset)) error++;
        if (length != 0) {
            offset++;
            chet(length, pos, word, offset,error);
        } else {
            if (error == 0) System.out.print("Yes"); else System.out.print("No");
        }
    }

    void nechet(int length,int pos,String word,int offset,int error){
        //System.out.println(length + " " + offset + " " + word.charAt(pos-offset-1) + " " + word.charAt(pos+offset+1)); //DEBUG
        length--;

        if (word.charAt(pos-offset-1) != word.charAt(pos+offset+1)) error++;
        if (length != 0) {
            offset++;
            nechet(length, pos, word, offset,error);
        } else {
            if (error == 0) System.out.print("Yes"); else System.out.print("No");
        }
    }
}
