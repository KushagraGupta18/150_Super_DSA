package _6_Recursion_And_Bactracking;

import java.util.Scanner;
import java.util.*;
public class _34_Rat_Chases_A_Cheeze {
	static boolean exist=false;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char[][] maze=new char[n][m];
		for(int i=0;i<n;i++) {
			String str=sc.next();
			for(int j=0;j<str.length();j++) {
				maze[i][j]=str.charAt(j);
			}
		}
		int[][] ans=new int[n][m];
		path(n,m,maze,ans,0,0);
		if(exist==false){
			System.out.println("NO PATH FOUND");
		}
	}

	public static void path(int n, int m, char[][] maze, int[][] ans, int cr, int cc) {
		if(cr>=n || cc>=m ||cr<0 || cc<0 ||  maze[cr][cc]=='X' || maze[cr][cc]=='*') {
			return;
		}
		if(cr==n-1 && cc==m-1 && maze[cr][cc]!='X') {
			ans[cr][cc]=1;
			maze[cr][cc]='*';
			exist=true;
			display(ans);
			ans[cr][cc]=0;
			maze[cr][cc]='0';
		}
		ans[cr][cc]=1;
		maze[cr][cc]='*';
		path(n, m, maze, ans, cr, cc-1);
		path(n, m, maze, ans, cr, cc+1);
		path(n, m, maze, ans, cr-1, cc);
		path(n, m, maze, ans, cr+1, cc);
		ans[cr][cc]=0;
		maze[cr][cc]='0';
	}

	public static void display(int[][] ans) {
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[0].length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}

}
