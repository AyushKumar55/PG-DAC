<<Q3
Display the name of files in the current directory along with the names of files with maximum & minimum size. 
The file size is considered in bytes.
Q3

#!/bin/bin

echo "Maximum sized file : "
ls -lS | awk 'NR==2{print $5, $9}'
echo "Minimum sized file : "
ls -lSr | awk 'NR==2{print $5, $9}'
