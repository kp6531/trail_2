# CSE Academic Advisor Chatbot (Team 2)
CSE 6550: Software Engineering Concepts, Fall 2024

**California State University, San Bernardino**

## Project Overview

The **CSE Academic Advisor Chatbot** is an AI-driven assistant designed to help students navigate academic queries related to the Computer Science and Engineering (CSE) department. The chatbot can answer questions about course prerequisites, academic schedules, department policies, and more. This project leverages advanced AI models and various technologies to provide accurate and helpful information.


## Setup

To set up the **CSE Academic Advisor Chatbot** on your local machine, follow the steps below:

### Step 1: Clone the Repository

First, clone the GitHub repository to your local machine using the command below:

```
   git clone https://github.com/DrAlzahraniProjects/csusb_fall2024_cse6550_team2.git
```

### Step 2: Navigate to the Project Directory

Once the repository is cloned, navigate to the project directory:

```
cd csusb_fall2024_cse6550_team2
```

### Step 3: Build the Docker Image

Make sure Docker is installed and running on your machine. Build the Docker image using the following command:

```
docker build -t academicadvisor .
```

### Step 4: Run the Docker Container

Run the Docker container to start the application. Use the command below:

```
docker run -p 5002:8501 academicadvisor
```

The -p 5002:8501 flag maps port 8501 inside the container to port 5002 on your local machine. The application should now be accessible at:
http://127.0.0.1:5002/ or http://localhost:5002/

