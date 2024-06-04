#!/bin/bash

<<Q14
Assignemnts on “sed” command

      EmpData(Sample Database)

1122|j.b. saxena           |g.m.        |account   |12/12/52|6000
2233|n.k. gupta            |d.g.m      |sales        |31/12/40|9000
4545|anil agarwal        |director   |account   |06/07/47|7500
5656|lalit choudhury   |executive|marketing|07/09/50|5000
1265|chanchal singhvi|g.m.         |admin      |12/09/63|6000
0110|shyam saksena   |chairman |marketing|12/12/43|8000
5566|jai sharma          |director    |account   |23/12/89|7000
7733|jayant                 |d.g.m       |sales        |29/02/70|6000


a) From the above database substitute the delimiter of first 3 lines with “ : “
b) From the above database substitute the delimiter with “ : ”
c) Insert the string “ TechM Employees” in the first line.
d) Store the lines pertaining to the directors, d.g.m and g.m into three separate files.
e) Using address store first 4 lines into a file Empupdate.
f) Find the pattern “account” in the database and replaces that with “accounts”.
g) Select those lines which do not have a pattern “g.m”.
h) Insert a blank line after every line in the database.
Q14

#Task a) From the above database substitute the delimiter of first 3 lines with " : "
sed -i '1, 3 s/|/:/g' empData.txt

#Task b) From the above database substitute the delimiter with " : "
sed -i 's/|/:/g' empData.txt

#Task c) Insert the string “ TechM Employees” in the first line.
sed -i '1 i\TechM Employees' empData.txt

#Task d) Store the lines pertaining to the directors, d.g.m and g.m into three separate files.
grep -E 'director|d\.g\.m|g\.m\.' empData.txt > directors.txt
grep -v -E 'director|d\.g\.m|g\.m\.' empData.txt > non_directors.txt

#Task e) Using address store first 4 lines into a file Empupdate.
sed -n '1,4 p' empData.txt >empupdate.txt

#Task f) Find the pattern “account” in the database and replaces that with “accounts”.
sed -i 's/account/account/g' empData.txt

#Task g) Select those lines which do not have a pattern “g.m”.
grep -v 'g\.m\.' empData.txt > non_gm.txt

#Task h) Insert a blank line after every line in the database.
sed -i G empData.txt



