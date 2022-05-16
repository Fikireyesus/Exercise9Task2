package com.company;

public class Task2 {
    public static void generateException() {
        int number1[] = {4, 8, 16, 32, 64};
        int number2[] = {2, 0, 4, 0};
        for (int i = 0; i < number1.length; i++) {
            try {
                System.out.println(number1[i] + "/" + number2[1] + "is" + number1[i] / number2[i]);
            } catch (ArithmeticException ex) {
                System.out.println("Can't divide by zero");
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Index out of bound");
            } finally {
                System.out.println("Code is always available");

            }
        }
    }
}
class Exception
{
    public static void main(String[] args)
    {
        for(int i=0;i<3;i++)
        {
            Task2.generateException();
        }
    }
}
