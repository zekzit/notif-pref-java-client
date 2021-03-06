# swagger-java-client [![Build Status](https://travis-ci.com/Trust1Team/notif-pref-java-client.svg?token=eUEn2WqVpepdMsSFZWqZ&branch=master)](https://travis-ci.com/Trust1Team/notif-pref-java-client)

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation & Usage

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

After the client library is installed/deployed, you can use it in your Maven project by adding the following to your *pom.xml*:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>

```

When you like to cleanup the whole database at once.
```sql
truncate table notificationtopic, notificationtopicconfig, notificationtopicpreference, softwarecomponent, supportedcommchannel, supportedlanguage, theme, usercontactdetail, usernotificationprofile;
```

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author
Michallis Pashidis