class mod41calculator{
    static int mod(int a)
    {
        return a%41;
    }
    static char decoded(int a)
    {
        if(a<=26 && a>0)
        {
            return (char)(a+'a'-1);
        }
        if(a>26 && a<=36)
        {
            return (char)(a-26+'0'-1);
        }
        if(a==37)
        {
            return '_';
        }
        return '$';
    }
    public static void main(String[] args) {
        int arr[]={268, 413, 438, 313, 426, 337, 272, 188 ,392, 338, 77, 332, 139, 113, 92, 239, 247, 120, 419, 72, 295, 190, 131 };
        for(int i:arr)
        {
            System.out.print(mod(i)+" ");
        }
        System.out.println("");
        //array after applying inverse modulo 28 14 22 30 18 32  30 12 25 37 8  31 18 4  37 35 1 27 32 4  36 30  36
        int arr2[]={28 ,14 ,22 ,30 ,18 ,32  ,30 ,12 ,25 ,37 ,8  ,31 ,18, 4  ,37 ,35 ,1 ,27 ,32, 4  ,36 ,30,36};
        for(int i:arr2)
        {
            System.out.print(decoded(i));
        }
        
    }
}