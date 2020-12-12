package experiment02;

public class picture {
	public static void printStar(int number){
		int i;
		for(i=1;i<=number;i++){
			if(i==1){
				for(int j=1;j<number;j++){
					System.out.print(" ");
				}
				System.out.println("*");
			}
			else{
				for(int j=1;j<2*number-1;j++){
					if(i==number){
						for(i=0;i<2*number-1;i++){
							System.out.print("*");
						}
					}
					else if(j==number-i+1 || j==number+i-1){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
				}
				System.out.println();
			}
		}
	}
	
}
