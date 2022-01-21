import java.util.Scanner;

public class VectorMy {
    public int n; // Размерность вектора
    float[] data;
    public String name; // Имя вектора. Совсем не обязательно, поэтому нет в конструкторе
    public String VectorType;

    public float[] getData() // геттер для данных
    {
        return this.data;
    }

    public int getN() // геттер для размерности
    {
        return this.n;
    }

    public VectorMy(float x) {
        this.n = 1;
        this.data = new float[1];
        this.VectorType = "ZeroVector";
        data[0] = x;
    }

    public VectorMy(float x, float y) {
        this.n = 2;
        this.data = new float[2];
        this.VectorType = "2dDote";
        data[0] = x;
        data[1] = y;
    }

    public VectorMy(float x, float y, float z) {
        this.n = 3;
        this.data = new float[3];
        this.VectorType = "3dDote";
        data[0] = x;
        data[1] = y;
        data[2] = z;
    }

    public VectorMy(int N)
    {
        System.out.println("Был получен integer, воспринимаем это как количество элементов и переходим" +
                "в режим ручного ввода элементов");
        Scanner inp1 = new Scanner(System.in);
        this.n = N;
        this.data = new float[N];
        this.VectorType = "MultiVector";
        for (int i=0; i<N; i++)
        {

            this.data[i] = inp1.nextFloat();
        }
    }
    public void PrintVectorMy()
    {
        if (this.n==1)
            System.out.printf("[%3.1f]\n",data[0]);
        else if (this.n==2)
            System.out.printf("[%3.1f], [%3.1f]\n",data[0], data[1]);
        else if (this.n>=3)

        {
            for (int i=0; i<this.n; i++)
                System.out.printf("[%3.1f], ",data[i]);
        }
    }

}
