package enumeration;

import java.sql.SQLOutput;

public class Enumeration {
    public enum  Month{
        //INITIALIZE VALUES TO THE CONSTANTS
        JANUARY(1), FEBRUARY(2),MARCH(3),APRIL(4),MAY(5),JUNE(6),JULY(7),AUGUST(8),SEPTEMBER(9),OCTOBER(10),NOVEMBER(11),DECEMBER(12);
        int value;
        //created the constructor which is by default private
       Month(int value)
    {
        this.value=value;
    }

    }

    public static void main(String[] args) {
        for(Month month:Month.values())
        {
            System.out.println(month);
            System.out.println(month.ordinal());
        }


    }

}

