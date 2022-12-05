# Upgrade your calculation skills
A service to test and update your calculation skills.
## Idea
The main idea is to create an app that can be used by someone to test or improve their mathematical knowledge. 
# How it works
- User can register
- User can log in to the site after successful registration
- User can go to the appropriate tab and begin to practice their knowledge by solving examples
- User can see their stats for all time
# Technological stack
- SpringBoot as a skeleton framework
- MySQL database as a database for saving user and statistics info
- Spring Boot Maven Plugin
- Spring Boot DevTools
- Spring Web
- Spring Data JPA
# Getting Started
- [Setup Eclipse IDE For Java Development + install Java JDK](https://www.youtube.com/watch?v=i8rjkre_RYw)
- [Install Maven on Eclipse](https://www.youtube.com/watch?v=2UilpPZi9hQ) OR [How to install JAVA + MAVEN + ECLIPSE on Windows 10](https://www.youtube.com/watch?v=9A425SE59SQ)
- [Setup Spring Tools 4 for Eclipse](https://www.youtube.com/watch?v=DKW6IlUrxG8)
- [Install MySQL 8.0.22 Server and Workbench](https://www.youtube.com/watch?v=OM4aZJW_Ojs)
- After that you can [import an existing Java Project in Eclipse](https://www.youtube.com/watch?v=R3k8S28pr1c)
- You have to [create only DB](https://www.youtube.com/watch?v=OnXB3ZRrOW0) "uycs_db"(without tables) in MySQL:
```bash
  drop database if exists uycs_db;
  create database uycs_db char set utf8;
  use uycs_db;
```
- In file: ["application.properties"](https://github.com/VitaliiBaranetskyi/UpgradeYourCalculationSkills/blob/develop/src/main/resources/application.properties) you should [change username and password](https://www.youtube.com/watch?v=8mlM9s--xfw)(3:14):
```bash
   spring.datasource.username = yourname
   spring.datasource.password = yourpassword
```

- [Run Application.java](https://www.youtube.com/watch?v=LkZP74GKfvA) (8:20) or [Run Application.java](https://www.youtube.com/watch?v=8mlM9s--xfw)(6:30)
- For JUnit test you should open one of the files in this directory: ["test"](https://github.com/VitaliiBaranetskyi/UpgradeYourCalculationSkills/tree/develop/src/test/java/com/github/vitaliibaranetskyi/uycs) in Eclipse IDE and [run it](https://www.youtube.com/watch?v=tkzJsP7NP54)(8:42)
## License
This project is Apache License 2.0 - see the [LICENSE](LICENSE) file for details
## Developer
Student: Baranetskyi Vitalii

Email: vitalik.baranetskiy@gmail.com
