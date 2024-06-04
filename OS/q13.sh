<<Q13
Create a library of shell functions to do the followings:
1. Function to concatenate 2 strings. Pass 2 strings as parameters to function.
2. Function to find out the length of a given string, Pass string as a parameter to function.
3. Function to compare the two strings. Pass 2 strings as parameters to function.
4. Function to check if string is palindrome or not. Pass string as a parameter to function.
5. Function to print given string in reverse order. Pass string as a parameter to function.
Q13

#!/bin/bash

concatenation () {
s1=$1
s2=$2
echo "Concenated String $s1$s2"
}

length () {
len=${#1}
echo "Length of the string : $len"
}

compare () {
lower1=${1,,}
lower2=${2,,}
if [ "$lower1" == "$lower2" ]; then
	echo "The strings are same"
else
	echo "The strings are not same"
fi
}

palindrome () { 
if [ "$(rev <<< "$1")" == "$1" ]; then
	echo "It is a Palindrome"
else 
	echo "It is not a Palindrome"
fi
}

reverse () { 
rev1=$(rev <<< "$1")
echo "Reverse of 1st String : $rev1"
}

read -p "Enter a string: " string1
read -p "Enter another string: " string2

concatenation $string1 $string2
length $string1
compare $string1 $string2
palindrome $string1
reverse $string1