import com.sun.org.apache.xpath.internal.SourceTree;

public class FirstClass {
    public static void main(String[] args) {
                                                                                //1 минута = 6 градусов (Проходит минутная стрелка)
                                                                                //1 минута = 0.5 градусов (Проходит часовая стрелка)
                                                                                //1 час = 30 градусов (Проходит часовая стрелка)
        int Hours=3;                                                            //Вводим время - Часы
        int Minutes = 15;                                                       //Вводим время - Минуты
            float Hoursf = (float) (Hours);                                     //Перевод часов в дробное число для вычислений
            float Minutesf = (float) (Minutes);                                 //Перевод минут в дробное число для вычислений
        double MinutePerH = 0.5;
            float MinutePerHf = (float) (MinutePerH);                           //Перевод 0.5 в float для вычислений
        float Degree = Math.abs((Hoursf*30+MinutePerHf*Minutesf)- Minutesf*6);  // Вычисление угла между минутной и часовой стрелкой.
        float DegreeAbs = Math.abs(Degree);                                     // Берется модуль, т.к. значение может быть отрицательным
        if (DegreeAbs>180) {                                                    // Ставистя условие и выводится наименший угол
            System.out.println(360-DegreeAbs);
            }
        else {
            System.out.println(DegreeAbs);
            }
    }
}


