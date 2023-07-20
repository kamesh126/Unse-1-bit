import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Unset_i_thbit {
    public static int unset(int N,int i)
    {
        if(checkbit(N,i))
        {
            return N^(1<<i);
        }
        return N;
    }
    public static Boolean checkbit(int N,int i)
    {
        if((N & (1<<i))!=0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int A = n.nextInt();
        int B = n.nextInt();
        System.out.println(unset(A,B));
    }
}
