package com.company;
class Exception1 extends java.lang.Exception
{
    Exception1(String message)
    {
        super(message);
    }
}
class Exception2 extends java.lang.Exception
{
    Exception2(String message)
    {
        super(message);
    }
}
class Exception3 extends java.lang.Exception
{
    Exception3(String message)
    {
        super(message);
    }
}
public class Task4
{
    public  static void b(int x)throws Exception1, Exception2, Exception3
    {
        if(x<0)throw new Exception1("x<0");
        if(x==0) throw new Exception2("x==0");
        if(x>0) throw new Exception3("x>0");
    }
    public static void  main(String[]args)
    {
        try
        {
            b(-1);
        }
        catch (Exception1|Exception2|Exception3 ex)
        {
            ex.printStackTrace(System.out);
        }
    }
}
