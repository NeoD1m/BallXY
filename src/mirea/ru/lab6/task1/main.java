package mirea.ru.lab6.task1;

public class main {
    public static void main(String[] args){
        student[] students = new student[5];
        students[0] = new student("Student number before is " + 3,3);
        students[1] = new student("Student number before is " + 1,1);
        students[2] = new student("Student number before is " + 7,7);
        students[3] = new student("Student number before is " + 4,4);
        students[4] = new student("Student number before is " + 5,5);
        for (int i=0;i<5;i++){
            System.out.println(students[i].name);
            System.out.println(students[i].id);

        }

        //int[] array = {10, 2, 10, 3, 1, 2, 5};
        //System.out.println(Arrays.toString(students));
        System.out.println("\nSorting\n");
        for (int left = 0; left < students.length; left++) {
            // Вытаскиваем значение элемента
            int value = students[left].id;
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < students[i].id) {
                    students[i + 1].id = students[i].id;
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            students[i + 1].id = value;
        }
        for (int i=0;i<5;i++){
            System.out.println(students[i].name);
            System.out.println(students[i].id);

        }
    }
}
/*for (int i=0;i<10;i++){
            students[i] = new student("Student number is " + i,i);

        }

        for (int i=0;i<10;i++){
            int j = 0;
            while(true){
                if (flag == 10) break; flag = 0;
                if (j==9) j = 0;
                j++;
                temp = rand.nextInt(9);
                if (students[j].id != temp){
                    students[j] = new student("Student number is " + temp,temp);
                } else flag++;

            }
            //students[i] = new student("Student number is " + i,i);

        }*/