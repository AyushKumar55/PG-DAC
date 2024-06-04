#!/bin/bash
<<Q1	Write a shell script which will generate the O/P as follows

*
**
***
****
Q1

echo "Enter any Number"
read n
#Using for nested loop for creating pattern
for((i=0; i<n; i++))
do
	for((j=0; j<=i; j++))
	do
		#Printing * as per the pattern
		echo -n "*"
	done
	#newline
	echo
done
	
