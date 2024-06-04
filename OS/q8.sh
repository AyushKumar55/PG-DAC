#!/bin/bash

#Modify program 7 to accept the RollNo from the command line.
$roll=$1

#Search for the roll no in the data file
record=$(grep "^$roll:" file.txt)

#Check if the record exits
if [ -n "$record" ]; then
    echo "Record found: $record"

    #Prompt the user for new names and marks
    read -p "Enter new name (current: $name): " new_name
    read -p "Enter new marks1 for subject 1: " new_marks1
    read -p "Enter new marks2 for subject 2: " new_marks2
    read -p "Enter new marks3 for subject 3: " new_marks3

    #Update the record in the data file
    sed -i "s/^$roll:.*/$roll:$new_name:$new_mark1s:$new_marks2:$new_marks3/" file.txt
    echo "Record updated successfully"
else
    echo "Roll no not found"
fi