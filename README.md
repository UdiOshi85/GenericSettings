# Generic settings library for Android

Android generic settings library to handle all kinds of items in your application. (Equivalent to [Native settings preference](https://developer.android.com/guide/topics/ui/settings.html))

[ ![Download](https://api.bintray.com/packages/udioshi85/maven/libGenericSettings/images/download.svg) ](https://bintray.com/udioshi85/maven/libGenericSettings/_latestVersion)

### Table of Contents
- [Introduction](#introduction)
- [Compile](#compile)
- [Supported views](#supported-views)
- [Example](#example)

## Introduction

As an android developer for 6 years, many times i've started new project (For myself or in my work) and had to do SettingsActivity over and over again.
So I had enoght. wasted to much time in my life doing same code every time.

#### Native settings preference - Pros & Cons

![#c5f015](https://placehold.it/15/c5f015/000000?text=+) `Easy & fast implementation`  
![#c5f015](https://placehold.it/15/c5f015/000000?text=+) `Works directly with SharedPreferences`  
![#c5f015](https://placehold.it/15/c5f015/000000?text=+) `All screens - one XML!`  
![#f03c15](https://placehold.it/15/f03c15/000000?text=+) `Very difficult to control items layout (Heights, colors etc..)`  
![#f03c15](https://placehold.it/15/f03c15/000000?text=+) `Very difficult to navigate into nested preference screens and control back press`  
![#f03c15](https://placehold.it/15/f03c15/000000?text=+) `Very difficult to add & manage custom preference with custom UI`  


* But why not using [Android native Settings Preferences](https://developer.android.com/guide/topics/ui/settings.html)?
It provides an easy implementation via XML and works directly with SharedPreferences. But to me it's kinda old approach and take care of the UI. But once you need to open a specific nested PreferenceScreen or send analytics once you clicked it's get very frustrating.
So I decided to build my own Generic settings library using the lates android library such as Data Binding & ConstraintLayout for the views.

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
  compile 'com.github.udioshi85:libGenericSettings:1.0.2'
}
````  

* Via Maven
````xml
<dependency>
  <groupId>com.github.udioshi85</groupId>
  <artifactId>libGenericSettings</artifactId>
  <version>1.0.2</version>
  <type>pom</type>
</dependency>
````

## Supported views
* HeaderData -  headerName (String) & headerColor (Integer) fields.
![alt text](https://github.com/UdiOshi85/GenericSettings/blob/master/tut-pics/header-title.jpg "HeaderData example")  
* TitleData - title (String) & titleColor (Integer) fields.
![alt text](https://github.com/UdiOshi85/GenericSettings/blob/master/tut-pics/title.jpg "TitleData example")  
* TitleSubtitleData - title (String), subtitle (String), titleColor (Integer) & subtitleColor (Integer) fields.
![alt text](https://github.com/UdiOshi85/GenericSettings/blob/master/tut-pics/title-subtitle-data.jpg "TitleSubtitleData example") 
* IconTitleData - TitleData Fields & iconResId (Integer) field.
![alt text](https://github.com/UdiOshi85/GenericSettings/blob/master/tut-pics/icon-title.jpg "TitleSubtitleData example") 
