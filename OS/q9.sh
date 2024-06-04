#!/bin/bash

#Modify program 8 to accept the RollNo input from the user.
read -p "Enter Roll No. to search: " $roll

#Search for the roll no in the data file
record=$(grep "^$roll:" file.txt)

#Check if the record exits
if [ -n "$record" ]; then
    echo "Record found: $record"

    #Prompt the user for confirmation to delete the record
    read -p "Are you sue you want to delete this record? (yes/no): " confirm
    if [ -n "$confirm" = "yes"]; then
        #Delete the record from the data file
        sed -i "/^$roll:/d" file.txt
        echo "Record DELETED successfully"
    else
        echo "Deletion cancelled"
    fi
else
    echo "Roll No not found"
fi