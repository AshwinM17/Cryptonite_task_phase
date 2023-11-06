# basic-mod1:
## Description
We found this weird message being passed around on the servers, we think we have a working decryption scheme.
Download the message here.
Take each number mod 37 and map it to the following character set: 0-25 is the alphabet (uppercase), 26-35 are the decimal digits, and 36 is an underscore.
Wrap your decrypted message in the picoCTF flag format (i.e. picoCTF{decrypted_message})
## Hint
* Do you know what mod 37 means?
* mod 37 means modulo 37. It gives the remainder of a number after being divided by 37.

## Solution

we recive a list of integers frin the question whicch is:

decode these integers by mod 37 using the program writtem,named as mod37calculator(included int the repo) to get<br>
{17,26,20,13,3,36,13,36,17,26 ,20 ,13 ,3 ,36, 1, 32, 1, 28, 31, 31,29,27}
which can be decoded using the key provided character set: 0-25 is the alphabet (uppercase), 26-35 are the decimal digits, and 36 is an underscore.(done by modifing the code)
we get "R0UND_N_R0UND_B6B25531" ie the flag is <br>
picoCTF{R0UND_N_R0UND_B6B25531}
## Code Used
'''

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

'''
