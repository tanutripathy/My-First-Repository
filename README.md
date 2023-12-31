# New Maven Project

This project is created for training & learning purpose.
     This project show how to do the following :
     
     * create a Github account & install git in local pc
     * Clone the repository with local pc
     * create a Maven project in intellij & save it in cloned repository
     * Push the code to Github
     * Add dependencies to project in POM.xml file
     * create a BDD Framework structure in the maven project

## Creating Github account
Github is a platform & cloud based service for software development & version control using git.

* Step 1. Go to [ https://github.com/join.]
* Step 2.Type a username, your email address and password.
* Step 3. Click verify to start verification puzzle.
* Step 4.Than click the green **create account** button
* Step 5. After clicking **create account**, you'll receive a email with a code, verify your email by entering the code.
* Step 6. After that github display a quick survey, you can skip the survey by clicking **skip personalization** at the bottom of the page, clicking this will take you directly to github dashboard page with free account.
  
**Creating Repository**
 1. Go to [ https://GitHub.com] home page, do one of the following:
  * In **your repository**,choose **New repository**.
  
  * On the navigation bar choose **create new(+)**,and than choose **New repository**.

2. In the **create New repository** page, do the following:
    
  * In the **Repository name** box, enter the name.

  * Select **public** 
  
  * Click on the **initialize this repository with a README** check box.
  
  * choose **create repository**.
    
     
### Git Installation

Git is widely used open-source software tracking application use to track project across different teams and revision levels. 

* Step 1. Browse to the website [https://git-scm.com/downloads]
* Step 2. Click on the download link for windows and allow the download to complete.
  
  ![Screenshot 2023-08-06 183153](https://github.com/tanutripathy/My-First-Repository/assets/137702596/2029d8cd-f2ee-43f6-ad37-0512f97db96c)

* Step 3. Click on the downloaded installer file and select **yes** to continue.After selecting yes the Installation begins.
* Step 4. Default component are automatically selected in this step so, click on **Next** to continue.
* Step 5. The default git command line option select automatically.click **next** to continue.
* Step 6.The default transport backend options are selected in this step. **Click** next to continue.  
* Step 7.This is the last step that provides some extra features like system caching, credential management and symbolic link. click on the **next**
  ![Screenshot 2023-08-07 180952](https://github.com/tanutripathy/My-First-Repository/assets/137702596/19ca27da-3e70-4d2a-b6ca-0319cecdd9f4)


* Step 8. The files are being extracted in this step.
 Therefore, git Installation process
 finished.

### Cloning repository with pc

The clone command in git is used when we want to download an exisiting git repository to our local pc.
STEPS:
* step 1. Open your github account & go to github repository that you want to clone.
*  steps2. Click on **code** & copy the URL.
![Screenshot 2023-08-07 181755](https://github.com/tanutripathy/My-First-Repository/assets/137702596/894483b9-cf0a-48f0-abf7-8ada4177c165)

* step 3. Open gitbash & change the current directory to the location where you want the clone repository.
* step 4.Type *git clone* in the terminal & paste the URL you copied & press *enter* to create a local clone.
 
  
### Creating Maven project in Intellij

* Step 1. Open Intellij on your Pc. From your welcome screen select new project or you already have an intellij project, select file -> New -> project
* step 2. From the left select **maven** option and choose JDK for the project,.
* step 3. And name the maven project.
* step 4. In maven archetype choose **quickstart**.& click on create.  

![Screenshot 2023-08-07 182414](https://github.com/tanutripathy/My-First-Repository/assets/137702596/8f6f229c-074e-4143-8b4b-64b8de79a856)

Maven project will be created.

### Push code to GitHub

* Step 1. Open **gitbash** on windows & changed the directory into your project directory.
 * step 2. Add all the current file to the repository by command (**git add . & git commit -m "Initial commit"**).
 * step3. Than open your github project main page, you can the see the green **"code"** button to reveal the repository URL and copy the URL.
 * step 4. In gitbash write command(**git remote add origin paste the URL**) & enter.
 * Step 5. The final step to push the code is write command **git push origin main**.

 ### Adding dependencies to project

 A software dependency is a realtionship between software components where one component relies on other to work properly. Here we need the following dependencies:
 * Selenium: To add selenium dependencies do the following:
     * step 1. Go to  Maven Repository:[https://mvnrepository.com/ ]
     * step 2. search for **Selenium Java** 
     * step 3. Than choose the version **(version 4.10.0)**
![Screenshot 2023-08-07 182715](https://github.com/tanutripathy/My-First-Repository/assets/137702596/aa9233b5-42e1-49d3-9a8f-cc2a0050f10c)

      * step 4. Copy the dependency and paste it in POM.xml file in maven project.

 * Cucumber: To add Cucumber dependencies do the following: 
    * step 1. Go to  Maven Repository:[https://mvnrepository.com/ ] OR [https://cucumber.io/docs/cucumber/checking-assertions/].
    * step 2. search for *"Cucumber Java"*
![Screenshot 2023-08-07 183012](https://github.com/tanutripathy/My-First-Repository/assets/137702596/bd4311a8-720d-4d9f-916c-bfb06d250177)

     * step 3. Than select the version **7.13.0**.
    * step 4. Copy the dependency & paste it after selenium dependency.

 * Cucumber Junit: To add Cucumber dependencies do the following: 
    * step 1. Go to  Maven Repository:[https://mvnrepository.com/ ] OR [https://cucumber.io/docs/cucumber/checking-assertions/].
   * step 2. search for *"Cucumber Junit"*
   * step 3. Than select the version **7.13.0**.
![Screenshot 2023-08-07 183129](https://github.com/tanutripathy/My-First-Repository/assets/137702596/4a0f1b12-098d-4322-8af9-a408b6bdbafe)

      * step 4. Copy the dependency & paste it after cucumber Java dependency.
   
### BDD Framework Structure in Maven project

Packages     
    * BrowserControl
    * PageObject
    * Feature
    * StepDefinition
    * Utilities
    
* Step 1. Open your maven project in intellij & in the left Select src -> test -> Java.
* step 2. Right click on java than select New -> Package
 * step 3. Name the Package,the Package will be created.

![Screenshot 2023-08-08 133827](https://github.com/tanutripathy/My-First-Repository/assets/137702596/4bdb124d-4689-4348-b464-1fa7783175d0)

    Similariy for next all packages.
