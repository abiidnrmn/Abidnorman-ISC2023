package coba;
import java.util.Arrays;
public class Coba {
    public static void main(String[] args) {
        
        //Array d1 primitif
            int angka[]= {20,19,18};
                System.out.println(Arrays.toString(angka)); 
                
        //Array d1 non-primitif
            String nama []= {"AL","AD","AU"};
                System.out.println(Arrays.toString(nama));
            
        //Array d2 primitif
           char clas[][]= {{'A','B'},
               {'f','g','u'},
           };
           System.out.println(Arrays.deepToString(clas));
       }
    }
