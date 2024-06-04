#!/bin/bash
<<Q11
Add some student records in the “student” file manually. The fields to be considered are “RollNo”, “Name”, “Marks_Hindi”, “Marks_Maths”, “Marks_Physics”.
Write a script which does the following 
a) If the roll number already exists, then store the record and the following message 
“roll number exists” in a log file “log1”.
b) If the marks in the subjects is not in the range of 1 – 99 then store such a record followed by a message “marks out of range” in “log1”
c) If the data is valid, the calculate total, percentage, grade and display on the terminal
Q11

echo "Enter Roll no:"
read roll
record=$(grep -q "^$roll:" student.txt)

if [ -n $record ]; then
	echo "$roll exists" >> log1.txt
	echo "$roll already exists"
	exit 1
fi

echo "Enter name:"
read name
marks_valid=true

echo "Enter marks of hindi:"
read marks_hindi
if [[ $marks_hindi -lt 1 || $marks_hindi -gt 99 ]]; then
  echo "Marks out of Range: Hindi" >> "$log_file"
  marks_valid=false
fi

echo "Enter marks of maths:"
read marks_maths
if [[ $marks_maths -lt 1 || $marks_maths -gt 99 ]]; then
  echo "Marks out of Range: Maths" >> "$log_file"
  marks_valid=false
fi

echo "Enter marks of physics:"
read marks_physics
if [[ $marks_physics -lt 1 || $marks_physics -gt 99 ]]; then
  echo "Marks out of Range: Physics" >> "$log_file"
  marks_valid=false
fi

if $marks_valid; then
  total=$((marks_hindi + marks_maths + marks_physics))
  percentage=$((total / 3))
  if [[ $percentage -lt 35 ]]; then
    grade="Fail"
  elif [[ $percentage -ge 35 && $percentage -lt 50 ]]; then
    grade="Third"
  elif [[ $percentage -ge 50 && $percentage -lt 60 ]]; then
    grade="Second"
  elif [[ $percentage -ge 60 && $percentage -lt 75 ]]; then
    grade="First"
  else
    grade="Distinction"
  fi
  
  if [[ $marks_hindi -lt 35 || $marks_maths -lt 35 || $marks_physics -lt 35 ]]; then
    class="Fail"
  else
    class="Pass"
  fi
  echo "$roll_number: $name $marks_hindi $marks_maths $marks_physics" >> "$student_file"
  echo "Roll number: $roll_number"
  echo "Name: $name"
  echo "Marks in hindi: $marks_hindi"
  echo "Marks in maths: $marks_maths"
  echo "Marks in physics: $marks_physics"
  echo "Total marks: $total"
  echo "Percentage: $percentage"
  echo "Grade: $grade"
  echo "Class: $class"
fi