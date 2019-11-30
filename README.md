# JavaGroupProjectPart1
***NOTES FROM FIRST DELIVERABLE*** - delete these when you finish them, put in groupchat as well

Class Structure and Code ------------------------- 
Your ValueGuest constructor doesnt finish the initializations: You should always initialize all your data fields, even ones for which you do not receive parameter data. (Even if the system defaults for those data types are still "ok"). Code looks okay otherwise! 

Application Usage: ---------------------- 
When you run the all rooms booking report, its probably best to keep each room's info to one line. Then, the details can be printed for the booking report for just one room or guest. Makes reports of this sort more useable and less cluttered. If the hotel has several hundred rooms, your current print could get messy. 
If you are printing a report for a specific guest, its probably best to show their full name. There could be more than one "John" in the system. The first booking report should really be a report for just a single room. If you want to print a Guest report, break that out into a separate menu option. 
-5 Points: Getting an IndexOutOfBoundsException at line 437 when I do the following: run the booking report for a specific guest, choose "0 Brenden", choose room 308. The index that is out of bounds is 308. Looks like you are using the typed in room number as an ArrayList index location. When I chose John, and no rooms printed for him, the system still asked for a room, I typed in "0" and it printed a room. Issues in this area. 
-1 Point: The Guest should not have access to the Room Report showing cost and booking information. Move this to the Employee menu. 

Overall ------------- 
You have some issues as listed above. I really like how neat the menu UI is, and this should translate well to UI. Fix the above issues and you should be ready for Part 2. 44/50 8/10


Andrew Taylor, George Moya, Mark Kilgore, Dylan Vetter, Brendan Boyle

My plan is to constantly update this repository so everyone is working with a live version of the code.
Only problem is if one person makes a large edit to a class or the application it may affect how everyone's code will run.
What I want to avoid is having the code only on one person's computer.

When updating the application file, just paste in the changes you made, do not copy and paste in the entire code because that may fuck up someone else's revision of the application
any changes to the cdf should be announced in the groupme because a change to one cdf could disrupt multiple functions
