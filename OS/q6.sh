#!/bin/bash

<<Q6
Write a shell script that greets the user with an appropriate message depending on the system time.
Q6

t=$(date +%H)
if [ $t -ge 1 ] && [ $t -lt 12 ]
then
	echo "Good Morning !!! : "$(date)
elif [ $t -ge 12 ] && [ $t -lt 16 ]
then
	echo "Good Afternoon !!! " $(date)
elif [ $t -ge 16 ] && [ $t -lt 19 ]
then
	echo "Good Evening !!! " $(date)
else
	echo "Good Night !!! " $(date)
fi
