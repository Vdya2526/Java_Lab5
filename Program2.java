package lab5;
/*Write a program to display prime numbers between 
two numbers where you get the 2 inputs for the range, 
from the user*/

public class Program2 {

	public static void main(String[] args) {
		int range1 = 1, range2 = 5;

        while (range1 < range2) 
        {
            boolean flag = false;

            for(int i = 2; i <= range1/2; ++i) 
            {
                // condition for nonprime number
                if(range1% i == 0) 
                {
                    flag = true;
                    break;
                }
            }

            if (!flag && range1 != 0 && range1 != 1)
                System.out.print(range1+ " ");

            ++range1;
        }	

	

}}
