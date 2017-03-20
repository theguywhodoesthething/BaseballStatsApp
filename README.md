## Baseball Stats App
CRUD app for Major League Baseball

Written by Matthew Gmur for the Skill Distillery course content.

This app was written using the Spring MVC model in Eclipse and optimized for a Tomcat 8.0 web server. This app can be accessed and tested by following this link and navigating to the projects page and clicking on Baseball Stats App.

<a href="http://52.34.71.100">Matt Gmur's Portfolio Site</a>

This App reads in Major League Baseball statistics for every player from 3 seperate .csv files. The players are parsed into their respective teams and each team is placed into a HashMap of teams which the Spring controller controls. Users are able to create, edit, and delete teams as well as add and delete players to those teams.

Features that could be included in the future are a more comprehensive statistics process that could include comparing player stats and making trades between teams. Also I would like to add a feature that allows the user to export the displayed data as a .csv file. Finally, the site could use better formatting and design to enhance the user experience.

The major stumbling block encountered in this project was effectively using the Spring session feature to allow the user to make changes to the correct team and players. Additionally the formatting and design of the site could've been planned out in advance better and more efficiently.
