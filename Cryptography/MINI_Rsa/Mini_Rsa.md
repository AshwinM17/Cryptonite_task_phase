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
