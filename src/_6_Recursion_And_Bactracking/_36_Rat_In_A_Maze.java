package _6_Recursion_And_Bactracking;

import java.util.Scanner;

public class _36_Rat_In_A_Maze {

	static boolean f=false; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char [][] maazzee=new char[n][m];
		for (int i = 0; i < maazzee.length; i++) {
			String s=sc.next();
			for (int j = 0; j < s.length(); j++) {
				maazzee[i][j]=s.charAt(j);
			}
		}
		int[][] aaa=new int[n][m];
		PrriintPath(maazzee,0,0,aaa);
		if(f==false) {
			System.out.println("-1");
		}
	}
	public static void PrriintPath(char [][]maazzee,int zr,int zc,int[][] aaa) {
		if(zr==maazzee.length-1 && zc==maazzee[0].length-1 && maazzee[zr][zc]!='X') {
			aaa[zr][zc]=1;
			f=true;
			if(f==true)
				Show(aaa);
			aaa[zr][zc]=0;
			return;
		}
		
		if(zr<0 || zc<0 || zr>=maazzee.length || zc>=maazzee[0].length || maazzee[zr][zc]=='X') {
			return;
		}
		maazzee[zr][zc]='X';		// by this line it is not going backward....meaaa jo position mai vo phle aa gya hai usme dubara nhi jayega
		aaa[zr][zc]=1;
		//PrriintPath(maazzee,zr-1,zc,aaa);//up
		if(f==false) {
		PrriintPath(maazzee,zr,zc+1,aaa);//right
		PrriintPath(maazzee,zr+1,zc,aaa);//down
		}
		//PrriintPath(maazzee,zr,zc-1,aaa);//left
		maazzee[zr][zc]='0';
		aaa[zr][zc]=0;
	}
	public static void Show(int[][] aaa) {
		for (int i = 0; i < aaa.length; i++) {
			for (int j = 0; j < aaa[0].length; j++) {
				System.out.print(aaa[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
