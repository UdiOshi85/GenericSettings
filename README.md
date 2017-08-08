# Generic settings library for Android

Android generic settings library to handle all kinds of items in your application. (Equivalent to PreferenceFragment)

[ ![Download](https://api.bintray.com/packages/udioshi85/maven/libGenericSettings/images/download.svg) ](https://bintray.com/udioshi85/maven/libGenericSettings/_latestVersion)

### Table of Contents
- [Introduction](#introduction)
- [Integration](#integration)
- [Supported views](#supported-views)

## Introduction

As an android developer for 6 years, many times i've started new project (For myself or in my work) and had to do SettingsActivity over and over again.
So I had enoght. wasted to much time in my life doing same code every time.
* But why not using [Android native Settings Preferences](https://developer.android.com/guide/topics/ui/settings.html)?
It provides an easy implementation via XML and works directly with SharedPreferences. But to me it's kinda old approach and take care of the UI. But once you need to open a specific nested PreferenceScreen or send analytics once you clicked it's get very frustrating.
So I decided to build my own Generic settings library using the lates android library such as Data Binding & ConstraintLayout for the views.
