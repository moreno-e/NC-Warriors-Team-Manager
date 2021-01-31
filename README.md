# NC Warriors Hockey Team Manager
The Team Manager application allows for the team manager to manage the current personnel in the NC Warriors hockey program. The application replaces the previous excel document that stored all of the current players information, now in a more secured program. It gives the ability to view current players contact information and player hockey information.


## Features
- Login
  - Allows only approved personnel to access application

- Home Page
  - Displays all current players in the program

- View Team (Upper or Lower)
  - Selected team will display players on the respected team, Upper Warriors or Lower Warriors team. 
  - Displays players currently playing on a Warriors league team (Lower C or Intermediate C) 
  
- Add Player
  - Team manager can add a player. Records their contact information and team information.
  
- Update / Delete
  - Update player contact information or hockey information. Delete removes a player.
  
## Future Features
- Player basic information: 
  - jersey size, equipment size, received gear option
- Player team fields: 
  - shooting hand, number of goals, number of games played
- Participation percentage (Post COVID-19): 
  - Note the percentage of volunteering a player has done in the program. 
  - Number of practices or on ice events 
- Integration of an API
- Pull stats from Sports Engine API and display under player information
- Link with website

## Dependencies
- Spring
  - Boot
  - Web MVC
  - Security
  - Devtool
  - Data JPA
- MySql
- Thymeleaf
- Bootstrap



