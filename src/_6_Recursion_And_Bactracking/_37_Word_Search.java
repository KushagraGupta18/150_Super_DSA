package _6_Recursion_And_Bactracking;

public class _37_Word_Search {

	static boolean flag=false;
	public static void main(String[] args) {
		char[][] maze= {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word="ABCCEE";
		for(int i=0;i<maze.length;i++) {
			for(int j=0;j<maze[0].length;j++) {
				if(word.charAt(0)==maze[i][j] && flag==false) {
					word(maze,word,i,j,0);
				}
			}
		}
		System.out.println(flag);
	}
	public static void word(char[][] maze, String word, int cr, int cc,int idx) {
		if(idx==word.length()) {
			flag=true;
			return;
		}
		if(cr<0 || cc<0 || cr>=maze.length || cc>=maze[0].length || maze[cr][cc]!=word.charAt(idx) || maze[cr][cc]=='X'|| idx>word.length()) {
			return;
		}
		int[] r= {0,0,-1,1};
		int[] c= {-1,1,0,0};
		for(int i=0;i<r.length;i++) {
			char ch=maze[cr][cc];
			maze[cr][cc]='X';
			word(maze,word,cr+r[i],cc+c[i],idx+1);
			maze[cr][cc]=ch;
		}
	}

}
