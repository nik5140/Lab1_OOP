import java.util.Scanner;


public class MainClass {

    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        String VectorName;
        System.out.println("Hello! Type name of the vector");
        VectorName = sc.nextLine();
        System.out.println("The name of the vector is "+VectorName);

        System.out.println("Создаем вектор включающий один элемент...");
        VectorMy v1 = new VectorMy((float)2.2);

        v1.name = VectorName; // дадим имя этому вектору

        VectorMy v2 = new VectorMy((float)2.4,(float)5.5555);
        VectorMy v3 = new VectorMy((float)2.4,(float)5.5555, (float)54.11);

        System.out.println("Размерность вектора v1 - "+v1.getN());
        System.out.println("Размерность вектора v2 - "+v2.getN());
        System.out.println("Печать вектора v1 ");
        v1.PrintVectorMy();
        v2.PrintVectorMy();
        v3.PrintVectorMy();
        System.out.println("Сам вектор "+v3.getData()[0]);
        VectorMy v4 = new VectorMy(7);
        v4.PrintVectorMy();

    }

}
