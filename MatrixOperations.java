class MatrixOperations
{
    int a[][] = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    int b[][] = {
        {1,1,1},
        {1,1,1},
        {1,1,1}
    };

    void transpose()
    {
        System.out.println("Transpose of Matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }

    void sumMatrix()
    {
        int sum=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                sum=sum+a[i][j];
            }
        }
        System.out.println("Sum of matrix elements = "+sum);
    }

    void multiply()
    {
        int c[][]=new int[3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }

        System.out.println("Multiplication of matrices:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }

    void rowSum()
    {
        System.out.println("Sum of rows:");
        for(int i=0;i<3;i++)
        {
            int sum=0;
            for(int j=0;j<3;j++)
            {
                sum=sum+a[i][j];
            }
            System.out.println("Row "+(i+1)+" = "+sum);
        }
    }

    void columnSum()
    {
        System.out.println("Sum of columns:");
        for(int j=0;j<3;j++)
        {
            int sum=0;
            for(int i=0;i<3;i++)
            {
                sum=sum+a[i][j];
            }
            System.out.println("Column "+(j+1)+" = "+sum);
        }
    }

    void diagonalSum()
    {
        int main=0, secondary=0;

        for(int i=0;i<3;i++)
        {
            main+=a[i][i];
            secondary+=a[i][2-i];
        }

        System.out.println("Main Diagonal Sum = "+main);
        System.out.println("Secondary Diagonal Sum = "+secondary);
    }

    public static void main(String args[])
    {
        MatrixOperations m=new MatrixOperations();

        m.transpose();
        m.sumMatrix();
        m.multiply();
        m.rowSum();
        m.columnSum();
        m.diagonalSum();
    }
}