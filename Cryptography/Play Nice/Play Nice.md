# Play Nice
## Description
Not all ancient ciphers were so bad... The flag is not in standard format. nc mercury.picoctf.net 30568 [playfair.py](https://mercury.picoctf.net/static/9e655bebf3ad245e74ce5ca3a8352af1/playfair.py)
## Hint
(None)
## Solution
On entering the nc mercury.picoctf.net 30568 in the webshell,We got<br>
Here is the alphabet: 0fkdwu6rp8zvsnlj3iytxmeh72ca9bg5o41q
Here is the encrypted message: herfayo7oqxrz7jwxx15ie20p40u1i
What is the plaintext message? 
<br> this is a playfair cipher of size 6x6(we get to know this by the program playfair.py)
so we can use a online playfair decoder like [dcode](https://www.dcode.fr/playfair-cipher)
where alphabet forms the grip and encrypted text message is the cipher text,which on decryption gives us this"EMF57MGC51TP693DHOEOQNT9K6GDWQLH" which is in Capitals so should be converted to lower cases,which can be done by the lower.py program which gives the output"emf57mgc51tp693dhoeoqnt9k6gdwqlh" which when entered int the websell gives us the flag

