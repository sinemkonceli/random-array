package RandomArray;

import java.util.Random;

public class randomArray {
	
	public static double Ortalama(int a[])
    {
        int toplam = 0;
        for (int i = 0; i < a.length; i++) {
            toplam = toplam + a[i];
        }
        double diziBoyut = a.length;
        double ortalama = toplam / diziBoyut;
        System.out.println("Dizi Ortalaması:" + ortalama);
        return ortalama;
    }
	
	public static void main(String[] args) 
	{
		   int dizi[] = new int[10];
		   Random rnd = new Random();
			for (int i = 0; i < dizi.length; i++) 
			{
				int rastgele=rnd.nextInt(20);
				dizi[i]=rastgele;
				System.out.print(dizi[i]+"\t");
			}
			System.out.println(" ");
			System.out.println(" ");
			
			Ortalama(dizi);
}
		
}
 
