import java.util.Scanner;

class ExitMaze
{
    int r , c;
    int i = 0;
    int j = 0;
    int dir=0;
    int [][] arr ;

    public void inputMatrix()
    {
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
         arr = new int [r][c];
        for(int i = 0 ; i<r; i++)
        {
            for (int j=0; j<c; j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }

    }

    public void direction()
    {
        while(true) {
            dir = (dir + arr[i][j]) % 4;
            if (dir == 0)         // East
            {
                j++;
            } else if (dir == 1)    // South
            {
                i++;

            } else if (dir == 2)    // West
            {
                j--;

            } else if (dir == 3)   // North
            {
                i--;

            }

            if (i < 0) {
                i++;
                break;
            } else if (j < 0) {
                j++;
                break;
            } else if (i == r) {
                i--;
                break;
            } else if (j == c) {
                j--;
                break;
            }
        }

            System.out.println(i);
            System.out.println(j);

    }
}

public class ExitPointOfAMatrix {
    public static void main(String[] args) {
        ExitMaze E = new ExitMaze();
        E.inputMatrix();
        E.direction();

    }
}
