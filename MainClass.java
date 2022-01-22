import java.util.Locale;
import java.util.Scanner;

public class MainClass {

    public static void main (String args[])
    {
        // scanner - for inputing data from user
        Scanner sc = new Scanner(System.in);

        // vecItog - for fixating resulting object
        VectorMy vecItog = new VectorMy((float)0.0);

        // nEls - information from user to find out which constructor to use for building an object
        int nEls = 0;
        System.out.println("Hello! Type number of elements in vector");

        nEls = sc.nextInt();
        System.out.println("Number of elements in Vector is "+ nEls);

        if (nEls==1)
        {
            System.out.println("Building vector that consists of one element...");
            VectorMy vecN = new VectorMy((float)0.0);
            System.out.println("Now enter amount of element in float");
            vecN.FillVec();
            vecN.PrintVectorMy();
            vecItog = vecN;
        }

        else if (nEls==2)
        {
            System.out.println("Building vector that consists of two elements...");
            VectorMy vecN = new VectorMy((float)0.0,(float)0.0);
            System.out.println("Now enter amount of elements in float");
            vecN.FillVec();
            vecN.PrintVectorMy();
            vecItog = vecN;
        }

        else if (nEls==3)
        {
            System.out.println("Building vector that consists of three elements...");
            VectorMy vecN = new VectorMy((float)0.0,(float)0.0, (float)0.0);
            System.out.println("Now enter amount of elements in float");
            vecN.FillVec();
            vecN.PrintVectorMy();
            vecItog = vecN;
        }

        else if (nEls>3)
        {
            System.out.println("Building vector that consists of "+nEls+" elements");
            VectorMy vecN = new VectorMy(nEls);
            vecN.PrintVectorMy();
            vecItog = vecN;
        }

        System.out.println("\n Show how method of printing on screen works (task 1):");
        vecItog.PrintVectorMy();
        System.out.println("\n Show how method vectors size work(task 2):");
        System.out.println("In vector there are "+vecItog.VecSize()+" el.");
        System.out.println("Show how getter for vector data works (task 3):");
        System.out.println("Vectors first element is "+vecItog.getData()[0]);

        System.out.println("Enter k that we will use for getting production k*vec");
        int k=0;
        k = sc.nextInt();
        System.out.println("We can calculate k*vec");
        for (int i=0; i<vecItog.VecSize(); i++)
        {
            // using printf here (ansi C function)
            System.out.printf("\n element [%d] is %3.1f", i,  vecItog.getData()[i]*k);
        }

        VectorMy vcmp1 = new VectorMy((float)1.1);
        VectorMy vcmp2 = new VectorMy((float)1.56);

        System.out.println("Vectors vcmp1 and vcmp2 are "+comPtwoVec(vcmp1,vcmp2));

    }

    public static String comPtwoVec(VectorMy x,VectorMy y)
    {
        String result = "different";
        if (x.VecSize()!=y.VecSize())
            System.out.println("Sizes of two vectors are different!");
        else
        {
            for (int i=0; i<x.VecSize(); i++)
            {
                if (x.getData()[i]==y.getData()[i])
                    result="equal";
                else
                {
                    result="different";
                    break;
                }
            }
        }
        return result;
    }

}
