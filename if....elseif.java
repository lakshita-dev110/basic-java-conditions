import java.util.Scanner;
public class if1 
{
    public static void main(String args[])
    {
        int maths,physics,chemistry;
        Scanner M = new Scanner(System.in);
        System.out.println("enter marks of maths");
        maths=M.nextInt();
        System.out.println("enter marks of physics");
        physics=M.nextInt();
        System.out.println("enter marks of chemistry");
        chemistry=M.nextInt();
        M.close();
        if(maths>=65 && physics>=55 && chemistry>=50)
        {
            if(maths+physics+chemistry>=190 || maths+physics>=140)
            {
                System.out.println("you are eligible for addmission");
            }
            else
            {
                System.out.println("you are not eligible for addmission");
            }
        }
        else
        {
            System.out.println("you are not eligible for addmission");
        }

        
        
    }
    
}
