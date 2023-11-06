# basic-mod2 
## Description
A new modular challenge!
Download the message [here](https://artifacts.picoctf.net/c/180/message.txt).
Take each number mod 41 and find the modular inverse for the result. Then map to the following character set: 1-26 are the alphabet, 27-36 are the decimal digits, and 37 is an underscore.
Wrap your decrypted message in the picoCTF flag format (i.e. picoCTF{decrypted_message})
## Hint

## Solution 
We had recieved a list of numbers {22 3  28 26 16 9   26 24 23 10 36 4  16 31 10 34 1 38 9  31 8  26  8} which when we apply mod 41 and then their inverse modulo gave the list {28 ,14 ,22 ,30 ,18 ,32  ,30 ,12 ,25 ,37 ,8  ,31 ,18, 4  ,37 ,35 ,1 ,27 ,32, 4  ,36 ,30,36} which when decoded by thekey given in the question we get the flag ,thus the final flag is <br><b>
picoCTF{1nv3r53ly_h4rd_8a05d939}<b>

## Code Used
```
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
        //array after applying inverse modulo 
        //28 14 22 30 18 32  30 12 25 37 8  31 18 4  37 35 1 27 32 4  36 30  36
        int arr2[]={28 ,14 ,22 ,30 ,18 ,32  ,30 ,12 ,25 ,37 ,8  ,31 ,18, 4  ,37 ,35 ,1 ,27 ,32, 4  ,36 ,30,36};
        for(int i:arr2)
        {
            System.out.print(decoded(i));
        }
        
    }
}
```
