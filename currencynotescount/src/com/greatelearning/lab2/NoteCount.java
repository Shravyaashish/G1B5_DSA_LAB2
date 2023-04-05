package com.greatelearning.lab2;

public class NoteCount {

	public void counting(int[] currency, int amount) {
		int notecount[]=new int [currency.length];
		int i;
		int sumofnotes=0;
		for(i=0;i<currency.length;i++)
		{
			notecount[i]=amount/currency[i];
			amount=amount%currency[i];
			sumofnotes+=notecount[i];
		}
		 for(i=0;i<currency.length;i++)
		 {
			 if(notecount[i]!=0);
			 {
				 System.out.println("currency[i]" + "X" + notecount[i]);
				 System.out.println("Totalnotes" +sumofnotes);
			 }
		 }
	}

}
