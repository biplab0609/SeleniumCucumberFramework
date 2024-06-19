**Set up maven in MacBook Pro (Mac OS + M1 chip) - Download Maven, update JAVA_HOME and PATH variables**
follow the steps below:

check if JAVA_HOME is defined in your Mac OS + M1 chip
@mac ~ % echo $JAVA_HOME

if no home defined, get the path of java by running the command
    @mac ~ % /usr/libexec/java_home
/Library/Java/JavaVirtualMachines/zulu-15.jdk/Contents/Home

@mac ~ % export JAVA_HOME=/Library/Java/JavaVirtualMachines/zulu-15.jdk/Contents/Home
@mac ~ % echo $JAVA_HOME
/Library/Java/JavaVirtualMachines/zulu-15.jdk/Contents/Home

Download Maven from - https://maven.apache.org/install.html
@mac ~ % sudo mv apache-maven-3.6.3-bin.tar.gz /opt

extract file
@mac /opt % sudo tar xzvf apache-maven-3.6.3-bin.tar.gz

#add apache mvn to path
% export PATH=/Users/garimaraha/IdeaProjects/apache-maven-3.9.7/bin:$PATH

#validate
mvn -v# check if JAVA_HOME is defined in your Mac OS + M1 chip
@mac ~ % echo $JAVA_HOME

if no home defined, get the path of java by running the command
    @mac ~ % /usr/libexec/java_home
/Library/Java/JavaVirtualMachines/zulu-15.jdk/Contents/Home

@mac ~ % export JAVA_HOME=/Library/Java/JavaVirtualMachines/zulu-15.jdk/Contents/Home
@mac ~ % echo $JAVA_HOME
/Library/Java/JavaVirtualMachines/zulu-15.jdk/Contents/Home

Download Maven from - https://maven.apache.org/install.html
@mac ~ % sudo mv apache-maven-3.6.3-bin.tar.gz /opt

extract file
@mac /opt % sudo tar xzvf apache-maven-3.6.3-bin.tar.gz

#add apache mvn to path
% export PATH=/opt/apache-maven-3.6.3/bin:$PATH

#validate
mvn -v


***************************************************************************************************

**Jenkins Setup**

Jenkins can be installed using the Homebrew package manager. Homebrew formula: jenkins-lts This is a package supported by a third party which may be not as frequently updated as packages supported by the Jenkins project directly.
Sample commands:
* Install the latest LTS version: brew install jenkins-lts
* Start the Jenkins service: brew services start jenkins-lts
* Restart the Jenkins service: brew services restart jenkins-lts
* Update the Jenkins version: brew upgrade jenkins-lts
After starting the Jenkins service, browse to http://localhost:8080

cat /Users/garimaraha/.jenkins/secrets/initialAdminPassword

Username = admin
Password = cat /Users/<username>/.jenkins/secrets/initialAdminPassword

****************************************************************************************************
**CLI Command :**
export PATH=/Users/<username>/IdeaProjects/apache-maven-3.9.7/bin:$PATH
mvn test -Dcucumber.filter.tags="@SmokeTest" -Dbrowser="chrome" 
