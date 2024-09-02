#!/usr/bin/env sh

# "sonar.token" variable (or sonar.login before SONARQUBE 9.9) : private TOKEN generated in your local SonarQube during installation
# (input paramater of this script)
mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.9.1.2184:sonar -Dsonar.host.url=http://localhost:$1 -Dsonar.token=$2

# command if you have a SONARQUBE < 9.9 (sonar.token existing for SONARQUBE >= 10.0)
# mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.9.1.2184:sonar -Dsonar.login=$1
