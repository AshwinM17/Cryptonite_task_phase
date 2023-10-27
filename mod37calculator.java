class mod37calculator{
    static int mod(int a)
    {
        return a%37;
    }
    static char decoded(int a)
    {
        if(a<26 && a>=0)
        {
            return (char)(a+'A');
        }
        if(a>25 && a<36)
        {
            return (char)(a-26+'0');
        }
        if(a==36)
        {
            return '_';
        }
        return ' ';
    }
    public static void main(String[] args) {
        int arr[]={165,248,94 ,346 ,299 ,73 ,198 ,221, 313 ,137,205,87,336,110,186,69,223,213,216,216,177,138 };
        for(int i:arr)
        {
            System.out.print(mod(i)+" ");
        }
        System.out.println("");
        for(int i:arr)
        {
            System.out.print(decoded(mod(i)));
        }
        
    }
}