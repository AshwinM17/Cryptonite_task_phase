<b>Cryptography:<br>
Q1.mod 26:

![Q1](<Screenshot 2023-10-27 004917.png>)<br>
Text given: </b>cvpbPGS{arkg_gvzr_V'yy_gel_2_ebhaqf_bs_ebg13_MAZyqFQj}
![Solution](<Screenshot 2023-10-27 005011.png>)<br>

We get the key: picoCTF{next_time_I'll_try_2_rounds_of_rot13_ZNMldSDw}


<b>Q2.Numbers:<br></b>
Image given:
![Alt text](the_numbers.png)<br>
which is coded as A=1,B=2... and so on<br>
flag is:PICOCTF{THENUMBERSMASON}


<b>Q3.Caeser:<br></b>
on opening the downloaded file in notepad i recieved the text:<br>
picoCTF{ynkooejcpdanqxeykjrbdofgkq}<br>
in which the text wrapped in {} was encoded by caeser cipher,so checking on a online caeser cipher we could brute force this as there were only 25 possibilities,so we got the flag as picoCtf{crossingtherubiconvfhsjkou}


<b>Q4.basic-mod1:<br></b>
we recive a list of integers frin the question whicch is:

decode these integers by mod 37 using the program writtem,named as mod37calculator(included int the repo) to get<br>
{17,26,20,13,3,36,13,36,17,26 ,20 ,13 ,3 ,36, 1, 32, 1, 28, 31, 31,29,27}
which can be decoded using the key provided character set: 0-25 is the alphabet (uppercase), 26-35 are the decimal digits, and 36 is an underscore.(done by modifing the code)
we get "R0UND_N_R0UND_B6B25531" ie the flag is <br>
picoCTF{R0UND_N_R0UND_B6B25531}

<b>Q5.Morse-code<br></b>
The audio file provided can be opened in audio file editing software like audacity,where we can see the diffeent pulses of the morse code,and thus decode it to get
picoCTF{wh47_h47h_90d_w20u9h7}