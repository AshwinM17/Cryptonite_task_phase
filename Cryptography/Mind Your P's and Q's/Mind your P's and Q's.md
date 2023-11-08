# Mind your Ps and Qs
## Description
In RSA, a small e value can be problematic, but what about N? Can you decrypt this? values
## Hint
Bits are expensive, I used only a little bit over 100 to save money
# Solution
Data we dot in the [values](https://mercury.picoctf.net/static/51d68e61bb41207a55f24e753f07c5a3/values)<br>
file is Decrypt my super sick RSA:<br>
c:62324783949134119159408816513334912534343517300880137691662780895409992760262021<br>
n:1280678415822214057864524798453297819181910621573945477544758171055968245116423923<br>
e: 65537<br>
as n = product of 2 prime numbers p and q we can extract pa and q by using sites like [factordb](http://factordb.com/index.php?id=1100000002524293699) on entering the n in factor db we get <br>p:1899107986527483535344517113948531328331<br>
q:674357869540600933870145899564746495319033<br>
now these parameters can be entered into an rsa decipher like  [dCode](https://www.dcode.fr/rsa-cipher) to get the flag(as n,e,c,p,q are sufficient to get the decrypted data)
**flag:picoCTF{sma11_N_n0_g0od_05012767}**