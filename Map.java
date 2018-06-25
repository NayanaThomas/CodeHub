package codeing;
public class Map {
	public static void main(String[] args){
		int[][] Map = new int[][] {
			{0,0,0,1,1,2,2},
			{0,0,1,1,2,2,2}
		};
		int countryNum=0;
		int curr= Map[0][0];
		countryNum = countryNum+1;
		for(int k=1;k<7;k++)
		{
			if(Map[0][k]!=curr)
			{
				countryNum = countryNum+1;
				curr = Map[0][k];
			}			
		}
		for(int i=1;i<2;i++)
			for(int j=0;j<7;j++)
			{
				if( (Map[i][j]!=Map[i-1][j]) && (Map[i][j]!=Map[i][j-1])) {
					if(Map[i][j]!=Map[i][j+1] || Map[i][j+1]!=Map[i-1][j+1]) {
						countryNum = countryNum+1;
					}
					
					
				}
			}
		System.out.println(countryNum);
	}
}