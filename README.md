# Generic settings library for Android

Android generic settings library to handle all kinds of items in your application. (Equivalent to [Native settings preference](https://developer.android.com/guide/topics/ui/settings.html))

[ ![Download](https://api.bintray.com/packages/udioshi85/maven/libGenericSettings/images/download.svg) ](https://bintray.com/udioshi85/maven/libGenericSettings/_latestVersion)
[ ![Android API Level](https://img.shields.io/badge/API-15%2B-blue.svg) ]()
[ ![Library license](https://img.shields.io/badge/License-Apache--2.0-blue.svg) ]()
[![CircleCI](https://circleci.com/gh/UdiOshi85/GenericSettings.svg?style=svg)](https://circleci.com/gh/UdiOshi85/GenericSettings)


[![Example app](https://img.youtube.com/vi/ywjI1ErnBgw/0.jpg)](https://www.youtube.com/watch?v=ywjI1ErnBgw)

As an android developer for 6 years, there has been many
times I’ve started a new personal or work project and had to
redo the Settings Activity over and over again. I’ve had
enough; I’ve wasted too much time in my life doing the same
code every time I start a new project. So I’ve decided to
develop a way that creates the settings screen quickly and
efficiently.


## Compile

* Via Gradle
```gradle
// In you top level project build.gradle file
repositories {
  mavenCentral() // jcenter() is also working.
}

// In you application module build.gradle file
dependencies {
  ...
  ...
  compile 'com.github.udioshi85:libGenericSettings:1.1'
}
````  

* Via Maven
````xml
<dependency>
  <groupId>com.github.udioshi85</groupId>
  <artifactId>libGenericSettings</artifactId>
  <version>1.1</version>
  <type>pom</type>
</dependency>
````

## Summary
I’ve created a sample app which covers all the supported types/views
* Sample app code
* Issues? Open issue on GitHub
* Question & Other help? Send email udioshi@gmail.com
* This library was built for all developers who do not wish
to do the Settings screen logic over and over again. You
can do whatever you want with this library. No
contribution is needed. You can clone/download full
library code. I do wish to get your feedback about this
library; I will maintain it as long as I’m considering
myself an Android developer. Feel free to open issues /
ask for new viewtypes / or just STAR this page.
