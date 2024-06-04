#!/bin/bash

<<Q5 
Write a script that accepts a member into MBT health club, if the weight of the person is withing the range of 30-250 Kgs.
Q5

read -p "Enter your weight: " weight

if [ $weight -ge 30 ] && [ $weight -le 250 ]
then
	echo "Congratulations! You are a member of MBT Health Club"
else
	echo "Sorry! We won't be able to consider you for the membership"
fi
