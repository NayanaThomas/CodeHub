package codeing;
import java.util.HashSet;
import java.util.Set;

public class WordBoogle {
	 Set<String> set = new HashSet<String>();
	
	public void makeSet() {
		set.add("db");
		set.add("bcd");
		set.add("dfd");
		set.add("ded");
		set.add("fd");
		set.add("e");
		set.add("dec");
		set.add("df");
	}
	
	public boolean isValidWord(String str) {
		return set.contains(str);
	}

	public void DFSUtil(char[][] boggle, boolean[][] visited, int i, int j, String str) {
		visited[i][j] = true;
		str += boggle[i][j];
		
		if(isValidWord(str))
			System.out.println(str);

		for(int row=i-1;row<=i+1 && row<boggle.length;row++) {
			for(int col=j-1;col<=j+1 && col<boggle[0].length;col++) {
				if(row>=0 && col >= 0 && !visited[row][col])
					DFSUtil(boggle,visited,row,col,str);
			}
		}
		
		String temp = str.substring(0,str.length()-1);
		str = temp;
		visited[i][j] = false;
	}

	public void printWords(char[][] boggle) {
		int M = boggle.length;
		int N = boggle[0].length;
		
		boolean[][] visited = new boolean[M][N];
		String str = "";
		
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++)
				DFSUtil(boggle,visited,i,j,str);
		}
	}

	static void printMatrix(char[][] boggle) {
		for(int i=0;i<boggle.length;i++) {
			for(int j=0;j<boggle[0].length;j++)
				System.out.print(boggle[i][j] + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		WordBoogle wb = new WordBoogle();
		wb.makeSet();
		
		char[][] boggle = {{'f','f','d', 'e'},
		                 {'f','b','b', 'e'}};
		
		
		 /*char[][] boggle = {
	                {'Z','E','C'},
	                {'F','C','B'},
	                {'Z','B','A'}
	        };*/
		 System.out.println("Boggle:");
		printMatrix(boggle);
		
		System.out.println("\nWords:");
		wb.printWords(boggle);
	}
} 