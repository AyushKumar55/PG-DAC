#!/bin/bash

<<Q10
Write a script that takes a command line argument and reports on its file type (regular file, directory file, etc.). For more than one argument generate error message.
Q10

if (("$#" == 0 || "$#" > 1)); then
	echo "Usage $0 <file>  (single file name only)"
	exit 1
fi

for file in "$@"; do
	if [ ! -e "$file" ]; then
		echo "No such file or directory."
	elif [ -b "$file" ]; then
		echo "Block File."
	elif [ -f "$file" ]; then
		echo "Ordinary File."
	elif [ -d "$file" ]; then
		echo "Directory File."
	elif [ -p "$file" ]; then
		echo "Named Pipe : (FIFO)"
	elif [ -c "$file" ]; then
		echo "Character device"
	else
		echo "Unknown File"
	fi
done