
package basit.rastgele.örnekleme;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class BasitRastgeleÖrnekleme {

    
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Minimum degeri giriniz:");
        int min = scanner.nextInt();
        System.out.println("Maximum degeri giriniz:");
        int max = scanner.nextInt();
        if(min<max)
        {
                System.out.println("orneklem sayisini giriniz:");
                int n=scanner.nextInt();
                int x[]=new int[n];
                Random random=new Random();
            if((max-min)+1<= n)
            {
                for(int i=1; i<n; i++)
                {
                    x[i] = (int)(Math.random() * ((max-min)+1))+min;
                } 
                for(int i=0; i<n; i++)
                {
                    System.out.println(x[i]);
                }
            }
            
            if((max-min)+1 >=n)
            { //TEKRAR ETMEYEN SAYI ÜRETME
             
                int y[]=new int[(max-min)+1];
                int baslangic=0;
                for(int i=min; i<=max; i++)
                {
                   y[baslangic]=i;
                   baslangic++;
                }
                shuffleArray(y);
                for(int i=0; i<n; i++)
                {
                  System.out.println(y[i]);
                }
            }//if
        }//if(a<b) 
    }

    private static void shuffleArray(int[] ar)
    {
        Random r = ThreadLocalRandom.current();
        for(int i=ar.length - 1; i>0; i-- )
        {
            int index = r.nextInt(i+1);
            int a=ar[index];
            ar[index]=ar[i];
            ar[i]=a;
        }
    }
    }
    

