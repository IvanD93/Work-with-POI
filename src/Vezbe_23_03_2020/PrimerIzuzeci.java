package Vezbe_23_03_2020;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimerIzuzeci {

	
	public static int ucitajInt() throws InterruptedException {
		
		try {
			Scanner sc = new Scanner (System.in);
			int x = sc.nextInt();
			
			int niz[] = new int [3];
			niz[0] = 20;
			niz[1] = 5;
			niz[2] = 10;
			niz[3] = 12;
			
			Thread.sleep(1000);
			return x;
		} catch (InputMismatchException e) {
			System.out.println("Pogresan tip podataka...");
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Prevazilazi granice niza....");
		} catch(Exception e) {
			System.out.println("...");
		}
		finally {
			System.out.println("Text....");
		}
		
		return -1;
	}
	public static void main(String[] args) throws InterruptedException {
		
		ucitajInt();
		System.out.println("Nakon catch...");
	}

}
