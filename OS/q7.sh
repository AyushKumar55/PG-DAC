#!/bin/bash

<<Q7
A data file file has some student records including rollno, names and subject marks. The fields are separated by a “:”. 
Write a shell script that accepts roll number from the user, searches it in the file and if the roll number is present 
- allows the user to modify name and marks in 3 subjects.
If the roll number is not present, display a message “Roll No Not Found”. Allow the user to modify one record at a time.
Q7

#Prompt the user for the roll no.
read -p "Enter Roll No. : " $roll

#Search for the roll no in the data file
record=$(grep "^$roll:" file.txt)

#Check if the record exists
if [ -n "$record" ]; then
    echo "$record"
    name=$(echo "$record" | cut -d ":" -f 2)
    marks1=$(echo "$record" | cut -d ":" -f 3)
    marks2=$(echo "$record" | cut -d ":" -f 4)
    marks3=$(echo "$record" | cut -d ":" -f 5)

    #Prompt user for new name marks1 marks2 and marks3
    read -p "Enter new name (current: $name): " new_name
    read -p "Enter new marks1 for subject 1 (current: $marks1): " new_marks1
    read -p "Enter new marks2 for subject 2 (current: $marks2): " new_marks2
    read -p "Enter new marks3 for subject 3 (current: $marks3): " new_marks3

    #replace with new data
    sed -i "s/^$roll:$name:$marks1:$makrs2:$marks3\s/$roll:$new_name:$new_mark1s:$new_marks2:$new_marks3/" file.txt
    echo "Record updated successfully"
else
    echo "Record not found"
fi