package pkg02_CAPGPackage;
import java.util.Scanner;
public class TicTacToe 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char [][] arr=new char[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			arr[i][j]='-';
			}
		}

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		// - - -
		// - - - 
		// - - - 
		
		// - - -
		// - x - 
		// - - -
		int loop=9,flag=0;
		char win='-';
		while(loop>0)
		{
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(arr[i][j]=='-');
					{
						flag=1;
						break;
					}
				}
			}
			if(flag==1)
			{

				System.out.println("choose position");     //5
				int ch=sc.nextInt();
				int posI=0,posJ=0;
				flag=0;
				
				while(true)
				{
					switch(ch)
					{
						case 1: posI=0;posJ=0;flag=1;break;
						case 2: posI=0;posJ=1;flag=1;break;
						case 3: posI=0;posJ=2;flag=1;break;
						case 4: posI=1;posJ=0;flag=1;break;
						case 5: posI=1;posJ=1;flag=1;break;
						case 6: posI=1;posJ=2;flag=1;break;
						case 7: posI=2;posJ=0;flag=1;break;
						case 8: posI=2;posJ=1;flag=1;break;
						case 9: posI=2;posJ=2;flag=1;break;
						default:flag=0;System.out.println("wrong position");break;
					}
					if(flag==1&&(arr[posI][posJ]=='-'))
					{
						break;
					}
					else if(flag==0)
					{
						System.out.println("choose another position");
						ch=sc.nextInt();
					}
					else
					{
						System.out.println("position already filled");
						System.out.println("choose another position");     //5
						ch=sc.nextInt();
					}
				}
				if(loop%2==0)
				{
					arr[posI][posJ]='X';
				}
				else if(loop%2!=0)
				{
					arr[posI][posJ]='O';
				}
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						System.out.print(arr[i][j]);
					}
					System.out.println();
				}
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						if((arr[i][j]=='X'))
						{
							if(((arr[0][0]=='X')&&(arr[0][1]=='X')&&(arr[0][2]=='X'))||
							   ((arr[1][0]=='X')&&(arr[1][1]=='X')&&(arr[1][2]=='X'))||
							   ((arr[2][0]=='X')&&(arr[2][1]=='X')&&(arr[2][2]=='X'))||
							   ((arr[0][0]=='X')&&(arr[1][0]=='X')&&(arr[2][0]=='X'))||
							   ((arr[0][1]=='X')&&(arr[1][1]=='X')&&(arr[2][1]=='X'))||
							   ((arr[0][2]=='X')&&(arr[1][2]=='X')&&(arr[2][2]=='X'))||
							   ((arr[0][0]=='X')&&(arr[1][1]=='X')&&(arr[2][2]=='X'))||
							   ((arr[0][2]=='X')&&(arr[1][1]=='X')&&(arr[2][0]=='X')))
							{
								win='X';
								break;
							}
						}
						else if((arr[i][j]=='O'))
						{
							if(((arr[0][0]=='O')&&(arr[0][1]=='O')&&(arr[0][2]=='O'))||
							   ((arr[1][0]=='O')&&(arr[1][1]=='O')&&(arr[1][2]=='O'))||
							   ((arr[2][0]=='O')&&(arr[2][1]=='O')&&(arr[2][2]=='O'))||
							   ((arr[0][0]=='O')&&(arr[1][0]=='O')&&(arr[2][0]=='O'))||
							   ((arr[0][1]=='O')&&(arr[1][1]=='O')&&(arr[2][1]=='O'))||
							   ((arr[0][2]=='O')&&(arr[1][2]=='O')&&(arr[2][2]=='O'))||
							   ((arr[0][0]=='O')&&(arr[1][1]=='O')&&(arr[2][2]=='O'))||
							   ((arr[0][2]=='O')&&(arr[1][1]=='O')&&(arr[2][0]=='O')))
							{
								win='O';
								break;
							}
						}
					}
					if(win=='X'||win=='O')
					{
						break;
					}
				}
				if(win=='X'||win=='O')
				{
					System.out.println("-----\""+win+"\" wins-----");
					break;
				}
				loop--;	
			}
			else 
			{
				break;
			}
		}
		if(win=='-')
		{
			System.out.println("Match Draw");
		}

	}

}
