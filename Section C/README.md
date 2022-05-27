<a id="toc"></a>
# Table of contents
 1. [Introduction](#introduction)
 2. [Features](#features)
 3. [Installation](#installation)
 4. [Usage](#usage)
 5. [License](#license)
 6. [Author](#author)

<a id="introduction"></a>
## The International Standard Book Numbers Checker 👋 

This program allows the user to enter a international standard book number (ISBN).

Using the ISBN number provided by the user it will then check if the number is a valid ISBN number.
 
<a name="features"></a>
## Features 
* Accepts users input of the ISBN number
* Depending on if the number is a 10 digit number or a 13 digit number it will excecute different methods.
* It is able to convert a valid 10 digit number to a valid 13 digit number.
* If the number contains an *x* it will convert it to the number 10.

<a name="installation"></a>
## Installation 

 * In order to run this program you will need to have the Java Development Kit (JDK) and a IDE in this case we will be using IntelliJ.
 * Below I will include instructions for installing JDK and IntelliJ to get it setup and allow you to run the program.
   * Firstly for IntelliJ to work we will need to install JDK. Below will be instructions for that.
     * Click [here](https://www.oracle.com/java/technologies/downloads/) to go to the JDK download page then download the installer for your Operating System (OS).
     * Once it has been downloaded run the installer and follow the installers instructions, After the installation is finished you can click close.
     * You can find a full guide on how to install JDK [here](https://docs.oracle.com/en/java/javase/17/install/overview-jdk-installation.html#GUID-8677A77F-231A-40F7-98B9-1FD0B48C346A__INSTALLINGTHEJDKANDJREONMICROSOFTWI-E04E8B17)
     * Next lets confirm that JDK has been installed correctly, to do so type the following into the command-line/terminal.
     * *java --version* and you should see something similar to whats below
     
       ```
       java 17.0.2 2022-01-18 LTS
       Java(TM) SE Runtime Environment (build 17.0.2+8-LTS-86)
       Java HotSpot(TM) 64-Bit Server VM (build 17.0.2+8-LTS-86, mixed mode, sharing)
       ```
     * Do the same for *javac --version*
     
       ```
       javac 17.0.2
       ```
       
  * Now that JDK has been installed correctly we can now install IntelliJ clicking [here](https://www.jetbrains.com/idea/download/?fromIDE=#section=windows) for the download page then download the community version for your OS.
  
    ![Download the community version](https://user-images.githubusercontent.com/98963869/152643639-396bad1c-0995-43c9-98e0-45c2363f30b7.png)
    
    * Once it has been downloaded run the installer to download IntelliJ.
  
  * IntelliJ and JDK should both now be installed on your computer and you can now download or clone the program from github saving it somewhere you can find later.
    
<a name="usage"></a>
## Usage  
* In order to use the project you will need to clone it from github. [Here is a link from IntelliJ in how to clone a project from github.com](https://www.youtube.com/watch?v=aBVOAnygcZw)
* Now that you should have the project files setup and opened within IntelliJ, you can now navigate through to the section you wish to view.
* Next you will have to setup JDK for the project, in order to do navigate through *Section C* to *src* to *main* then finally click on *ISBNValidator.java*.
  * You should now have screen similar to below.![Screenshot (58)](https://user-images.githubusercontent.com/98963869/170743796-069ec750-87e8-47b6-b369-557f03b6d755.png)
  * Click on add then JDK it will then prompt you to navigate to where you have installed it.
    * Click Ok when you have found and selected the downloaded JDK.
  * Now I would like you to navigate to test then click on *ISBNValidatorTest*
    * Next as shown below right click on *junit* ![Screenshot (60)](https://user-images.githubusercontent.com/98963869/170744842-f05dadbe-a645-4a4e-b290-15777131013e.png)
    * After this click on *Add 'JUnit5.8.1' to classpath*.
      * Once this is done you should be prompted something similar as below ![Screenshot (62)](https://user-images.githubusercontent.com/98963869/170746049-9e1311ce-c7bf-4a64-907b-c70f5ca74b04.png)
      * Click on Ok, now everything should be set up for you to run the tests and main program.
* Now in order to run the program or tests, double click to open the one you would to run or click on the tabs at the top.
  * Right click within the code block and click on run as shown below ![Screenshot (63)](https://user-images.githubusercontent.com/98963869/170748465-444920ca-a382-453e-9612-3176f5070cee.png)
* Finally the program or tests should now run.


<a name="license"></a>
## License 

Distributed under the GNU General Public License v3.0. See `LICENSE.txt` for more information.

<a name="author"></a>
## Author 

🖥️ **John Dorman**

* Github: [@johnDorman98](https://github.com/johnDorman98)

## Show your support

Give a ⭐️ if this project helped you!

[Back to the top of the page](#table-of-contents)
