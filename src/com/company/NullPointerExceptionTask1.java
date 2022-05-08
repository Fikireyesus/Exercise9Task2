package com.company;
public class NullPointerExceptionTask1 {
    public static void main(String[] args) {
        try
        {
            String Bloom=Task1.generateException();
            Bloom.toString();
        }
        catch (NullPointerException fb)
        {
            System.out.println("Null values here, Boss");
            fb.printStackTrace();
        }
    }
}
 class Task1
{
    public static String generateException()
    {
        String Boss = null;
        return Boss;
    }
}