# CLUBBER

Based on a real life problem faced by many clubs at UBC that is
managing their list of club members, their roles , tasks assigned
contact information and what are the upcoming events. These all can
be done on a single platform now. Also track the list of
sponsors as well as who has paid the membership fees and much more.

This can be easily optimized to be used by clubs and I view this in a future as a system where all the members
are on a single platform and take quick decisions. This can
also be used as a tool for marketing about their clubs and adding new people as you go by.

## User Stories

- As a user I want to be able to add members to my club
- As a user I want to be able to view the list of members
- As a user I want to be able to assign new roles to members
- As a user I want to be able to check if the members have fulfilled the task
- As a user I want to be able to remove members
- As a user I want to be able to generate the contact information of the members
- As a user I want to be able to add new sponsors, track all the funding received
- As a user I want to be able to add new events, deadlines and much more
- As a user I want to be able to save my data
- As a user I want to be able to load my previous data
- As a user I want to be able to only change my member file, sponsor file and events

## Instructions for Grader

- You can create new members in you club, and are automatically saved
- You can create new events in you club, and are automatically saved
- You can create new sponsors in you club, and are automatically saved
- You can load your previous date from all the three
- The data is displayed very elegantly for each of the three cases
- Image of ubc is added at the start
- You can always go back on the main menu and you are never stuck


## Phase 4 : Task-2

- User can easily see all the logged activities
- User can see if a new member is added event is added or a sponsor is added
- The console also  tracks if the data was loaded from the three files if requested by the user
- All the activity performed by the user is tracked on the console
- here is an Example -
- Fri Dec 02 18:09:14 PST 2022
  Member file was loaded
  Fri Dec 02 18:09:14 PST 2022
  Member was added
  Fri Dec 02 18:09:20 PST 2022
  Member was added
  Fri Dec 02 18:09:20 PST 2022
  Member was added
  Fri Dec 02 18:09:30 PST 2022
  Event file was loaded
  Fri Dec 02 18:09:30 PST 2022
  Event was added
  Fri Dec 02 18:09:44 PST 2022
  Sponsor file was loaded
  Fri Dec 02 18:09:44 PST 2022
  Sponsor was added
- This only displays when exit is pressed

## Phase 4 : Task 3
- My design has three classes member, events and sponsors which are all independent from each other
- There is a class of clubber which uses all these three classes and makes objects for all of them
- The Json reader and writer also use the three classes to create and extract data from these objects
- The event log class has a list of all the events, Event is a class which creates an Event for the console
- The event log class creates a singleton list of event

## Changes I would have done to refactor it more
- I would have made a new class in my model package which had a list of all the three classes that is events, members 
- This would have made a new hierarchy which would then include everything under it and a part of it
- Then I could easily see what all is going on together in my club rather than referring to each of the classes
- It could also give me better control on handling these lists together

 


