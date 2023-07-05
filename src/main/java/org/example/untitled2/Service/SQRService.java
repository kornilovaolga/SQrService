package org.example.untitled2.Service;

public class SQRService {

    public int calculate(int min, int max) {
        int count = 0; // считает количество раз, когда i * i попадает в диапазон
        for (int i = 10; i <= 99; i++) { //цикл от i = 10 до i = 99, после каждой итерации добавляет i + 1
            int sqr = i * i;
            if (min <= sqr && sqr <= max) {
                count++; // равнозначно count = count + 1
            }
        }
        return count;
    }
}