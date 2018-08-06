# RomanNumerals
Project Euler Problem 89: Roman Numerals

## Instructions
To run the program:
```
java -jar RomanNumerals.jar
```

## Why I Chose This Problem

Roman Numerals was the 3rd problem Adobe recommended. When I looked, it seemed like a good puzzle-like problem compared to the other two. I thought it would make for an interesting challenge so I went with it.

## Process

I focused on the note they had at the end of problem, which said: 
> You can assume that all the Roman numerals in the file contain no more than four consecutive identical units. 

This seemed like a crucial hint and I realized that it meant that there were only a limited number of possible roman numeral replacements that could save characters. In addition, I realized we didn't need to worry about the minimal roman numeral itself since we only needed to keep track of the number of characters saved. 

As a result, I found all the roman numeral patterns that would need replacing and stored it as an array in my code. From there, I could iterate over those patterns and do String replacements. The replacement characters were just "00" since the resulting roman numeral didn't matter; I only cared about the length of the new roman numeral. Then I could compare the old roman numeral to the new one and find the number of characters saved. 

## References
* Looked up documention on `String.replace` to ensure I used the correct data types
* Looked up reading text files: http://www.avajava.com/tutorials/lessons/how-do-i-read-a-string-from-a-file-line-by-line.html

## Time Spent

Didn't check on the time too much since I took breaks from when I started thinking about this problem. Estimating a hour or two
