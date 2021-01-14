<!--- STARTEXCLUDE --->
# AstraDB Spring REST
*30 minutes, Beginner, [Start Building](https://github.com/DataStax-Examples/astradb-spring-rest#prerequisites)*

Create a Spring application that reads data from [DataStax Astra](https://astra.datastax.com/register?utm_source=devplay&utm_medium=github&utm_campaign=astradb-spring-rest) using a REST API.
<!--- ENDEXCLUDE --->

![image](https://raw.githubusercontent.com/DataStax-Examples/sample-app-template/master/screenshots/astra-sample-app-default.png)

## Objectives
* Demonstrate how to communicate with the AstraDB REST API using Spring.

## How this works
Once the Astra credentials are provided, the necessary tables are created in the database. Then, you 
can run the app and view the output from the AstraDB REST API.

## Get Started
To build and play with this app, follow the build instructions that are located here: [https://github.com/DataStax-Examples/astradb-spring-rest](https://github.com/DataStax-Examples/astradb-spring-rest#prerequisites)

<!--- STARTEXCLUDE --->
# Running AstraDB Spring REST
Follow the instructions below to get started.

## Prerequisites
Let's do some initial setup.

### DataStax Astra
1. Create a [DataStax Astra account](https://astra.datastax.com/register?utm_source=github&utm_medium=referral&utm_campaign=astradb-spring-rest) if you don't 
already have one:
![image](https://raw.githubusercontent.com/DataStax-Examples/sample-app-template/master/screenshots/astra-register-basic-auth.png)

2. On the home page. Locate the button **`Add Database`**
![image](https://raw.githubusercontent.com/DataStax-Examples/sample-app-template/master/screenshots/astra-dashboard.png)

3. Pick **free plan** and a **region** close to you, click configure.
![image](https://raw.githubusercontent.com/DataStax-Examples/sample-app-template/master/screenshots/astra-create-db-1-top.png)
![image](https://raw.githubusercontent.com/DataStax-Examples/sample-app-template/master/screenshots/astra-create-db-1-bottom.png)

4. Define a **database name**, **keyspace name** and **credentials** (Take note of the DB Password)
![image](https://raw.githubusercontent.com/DataStax-Examples/sample-app-template/master/screenshots/astra-create-db-2.png)

5. Your Astra DB will be ready when the status will change from *`Pending`* to **`Active`** 💥💥💥 
![image](https://raw.githubusercontent.com/DataStax-Examples/sample-app-template/master/screenshots/astra-db-active.png)

6. After your database is provisioned, head to the `Connect` screen and copy your connection 
information (we'll need this later!):
![image](https://raw.githubusercontent.com/DataStax-Examples/sample-app-template/master/screenshots/astra-connect.png)

### Github
1. Click `Use this template` at the top of the [GitHub Repository](https://github.com/DataStax-Examples/astradb-spring-rest):
![image](https://raw.githubusercontent.com/DataStax-Examples/sample-app-template/master/screenshots/github-use-template.png)

2. Enter a repository name and click 'Create repository from template':
![image](https://raw.githubusercontent.com/DataStax-Examples/sample-app-template/master/screenshots/github-create-repository.png)

3. Clone the repository:
![image](https://raw.githubusercontent.com/DataStax-Examples/sample-app-template/master/screenshots/github-clone.png)

## 🚀 Getting Started Paths:
*Make sure you've completed the [prerequisites](#prerequisites) before starting this step*
  - [Running on Gitpod](#running-on-gitpod)

### Running on Gitpod
1. Click the 'Open in Gitpod' link:
[![Open in IDE](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/#https://github.com/DataStax-Examples/astradb-spring-rest)

2. Wait for your Gitpod workspace to start:
![image](https://user-images.githubusercontent.com/3254549/88744125-5171c280-d0fb-11ea-9676-de4589e42589.png)

3. Set your Astra database details by running the gitpod setup script in the Gitpod terminal at the bottom of the screen:
```sh
./gitpod-setup.sh
```
![image](https://user-images.githubusercontent.com/3254549/88752966-f7c7c300-d10f-11ea-9a78-d2a9707192bd.png)

4. Run the app and view the output in the terminal:
```sh
./gradlew bootRun 
```

<!--- ENDEXCLUDE --->
