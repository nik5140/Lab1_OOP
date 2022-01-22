/* Vector class with some constructors
 */
    import java.util.Scanner;

    class VectorMy {
        public int n; // Vectors size
        float[] data;
        public String name; // Vectors name. Unnecessery
        public String VectorType;

        public float[] getData() // getter for vector data
        {
            return this.data;
        }

        public int getN() // getter for vector size
        {
            return this.n;
        }
        //Constructor for one dote vector
        public VectorMy(float x) {
            this.n = 1;
            this.data = new float[1];
            this.VectorType = "ZeroVector";
            data[0] = x;
            System.out.println(this.VectorType+" building...");
        }
        //constructor for 2d vector
        public VectorMy(float x, float y) {
            this.n = 2;
            this.data = new float[2];
            this.VectorType = "2dDote";
            data[0] = x;
            data[1] = y;
        }
        //constructor for 3d vector
        public VectorMy(float x, float y, float z) {
            this.n = 3;
            this.data = new float[3];
            this.VectorType = "3dDote";
            data[0] = x;
            data[1] = y;
            data[2] = z;
        }
        //constructor for Ndimentions vector
        public VectorMy(int N)
        {

            // In this constructor we are using builtin scanner, in other constructors -we are not

            Scanner inp1 = new Scanner(System.in);
            this.n = N;
            this.data = new float[N];
            this.VectorType = "MultiVector";
            for (int i=0; i<N; i++)
            {
                this.data[i] = inp1.nextFloat();
            }
        }

        // method for printing vector
        public void PrintVectorMy()
        {
            if (this.n==1)
                System.out.printf("(%3.1f)\n",data[0]);
            else if (this.n==2)
                System.out.printf("(%3.1f, %3.1f)\n",data[0], data[1]);
            else if (this.n>=3)

            {
                for (int i=0; i<this.n; i++)
                {
                    if (i==0)
                        System.out.printf("(%3.1f, ",data[i]);
                    else if ((i>0)&&(i<this.n-1))
                        System.out.printf("%3.1f, ",data[i]);
                    else if (i==this.n-1)
                        System.out.printf("%3.1f)",data[i]);
                }
            }
        }

        // method for filling vector with input users data from keyboard
        public void FillVec()
        {
            Scanner inp1 = new Scanner(System.in);
            for (int i=0; i<this.n; i++)
            {
                this.data[i] = inp1.nextFloat();
            }

        }

        // method for searching size of vector. this is not necessary method, because we have getter getN
        // and we should know vector's size to construct it, but there was such task in lab1
        public int VecSize()
        {
            return this.data.length;
        }

    }
