# Mini RSA
## Description
What happens if you have a small exponent? There is a twist though, we padded the plaintext so that (M ** e) is just barely larger than N. Let's decrypt this: [ciphertext](https://mercury.picoctf.net/static/387dc6431820338cc74324cc5cc9550f/ciphertext)
## Hints
*   RSA tutorial
* How could having too small of an e affect the security of this key?
* Make sure you don't lose precision, the numbers are pretty big (besides the e value)
* You shouldn't have to make too many guesses
* pico is in the flag, but not at the beginning

## SOLUTION
We are given large values for N(=p*q) and C(Cipher Text).but e is small<br>
as e is 3 .we can check by cubing and adding the cipher text and converting to ascii and check if 'pico' is there or not.

The script aims to find the padding value by iterating over a range of possible values of k from 0 to 9,999.
For each k, it performs a calculation to reverse the encryption operation, effectively computing m as the e-th(3rd) root of (k * N + c). This operation undoes the RSA encryption and extracts the padded message.
The result m is then converted to ASCII using the int_to_ascii function.
If the string "pico" is found in the ASCII representation of m, it means the correct padding has been found, and the value of k is recorded as the padding.
The loop breaks when the correct padding is found.

we had even set the precision to 700 so that no error is present
so we get the flag **picoCTF{e_sh0u1d_b3_lArg3r_6e2e6bda**
and the value of k came out to be 3533

## RSA Algorithm
RSA algorithm uses the following procedure to generate public and private keys:

Select two large prime numbers, p and q.
Multiply these numbers to find **n = p x q,** where n is called the modulus for encryption and decryption.
Choose a number e less than n, such that n is relatively prime to (p - 1) x (q -1). It means that e and (p - 1) x (q - 1) have no common factor except 1. Choose "e" such that 1<e < φ (n), e is prime to φ (n),
gcd (e,d(n)) =1
If n = p x q, then the public key is <e, n>. A plaintext message m is encrypted using public key <e, n>. To find ciphertext from the plain text following formula is used to get **ciphertext C**.<br>
**C = m<sup>e</sup> mod n**<br>
Here, m must be less than n. A larger message (>n) is treated as a concatenation of messages, each of which is encrypted separately.
To determine the private key, we use the following formula to calculate the d such that:<br>
**D<sub>e</sub> mod {(p - 1) x (q - 1)} = 1**
Or **D<sub>e</sub> mod φ (n) = 1**<br>
The private key is <d, n>. A ciphertext message c is decrypted using private key <d, n>. To calculate plain text m from the ciphertext c following formula is used to get plain text m.
m = c<sup>d</sup> mod n
