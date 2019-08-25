package exam;
import java.util.Scanner;
public class Exo {
	
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		int pays[] = new int[24], pays_trie[] = new int[24]; 
		
		int porteParole,point,j=0,tmp ;
		boolean flag = true;
		
		
		for(int i = 0; i < 1;i++)
		{
			porteParole = i+1;
			
			
				
				
				while( j<12  )
				{
					
					do {
						System.out.println("Veuillez entrez l'id du pays pour le quelle vous voulez accordez un vote");
						point = reader.nextInt();
						if(porteParole == point)
							{
							flag = false;
							System.out.println("Vote non encodés  recommencez !");
							}
						
						else {
							flag =true;
						}
					}	
					while(flag == false);
					
					if(j < 8)
						j++;
					else
						j = j+2;
					pays[point-1] = j;
					
					
				}
				
			
			
		}
		
		// Copie du tableau 
		for(int z = 0; z<24;z++)
		{
			pays_trie[z] = pays[z];
		}
		// Trie à bulle (décroissant)sur le tableau pays_trie
		for(int l =0; l<24;l++)
		{
			for(int m = 1; m < (24-l);m++)
			{
				if(pays_trie[m-1] > pays[m] )
				{
					tmp = pays_trie[m-1];
					pays_trie[m-1] = pays_trie[m];
					pays_trie[m] = tmp ;
				}
			}
		}
		
		for(int h =0; h<24;h++)
		{
			System.out.println(pays_trie[h]);
		}
	}
}
