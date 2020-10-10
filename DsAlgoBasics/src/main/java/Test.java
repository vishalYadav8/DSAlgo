class Blueberry
{
    static long arrayManipulation(int n, int[][] queries) {
        System.out.println("n is:"+n);
        int[] array =new int[n];
        int maxValue=0;

        System.out.println("queries.length="+queries.length);
        for(int i=0;i<queries.length;i++)
        {
            for(int j=queries[i][0]-1;j<queries[i][1];j++)
            {
                array[j]=array[j]+queries[i][2];
                if(maxValue<array[j])
                {
                    maxValue=array[j];
                }
            }
        }
        return maxValue;
    }
    public static void main(String[] args)
    {
        int[][] queries=new int[2][3];
        queries[0][0]=1;queries[0][1]=2;queries[0][2]=100;queries[1][0]=2;queries[1][1]=5;queries[1][2]=100;
       Long a= arrayManipulation(5,queries);
       System.out.println(a);
    }

}