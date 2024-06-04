<<Q4
Write a script which when executed checks out whether it is a working day or not?
(Note: Working day Mon-Fri)
Q4

#!/bin/bash
a=$(date +%u)
if [ $a -lt 6 ]
then
  	echo "Working day"
else
	echo "Not a Working Day"
fi

