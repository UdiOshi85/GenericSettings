# Generic settings library for Android

Android generic settings library to handle all kinds of items in your application. (Equivalent to [Native settings preference](https://developer.android.com/guide/topics/ui/settings.html))

[ ![Download](https://api.bintray.com/packages/udioshi85/maven/libGenericSettings/images/download.svg) ](https://bintray.com/udioshi85/maven/libGenericSettings/_latestVersion)
[ ![Android API Level](https://img.shields.io/badge/API-15%2B-blue.svg) ]()


### Table of Contents
- [Introduction](#introduction)
- [Compile](#compile)
- [Supported views](#supported-views)
- [Example](#example)
- [Contribution](#contribution)

## Introduction

As an android developer for 6 years, many times I've started new project (For myself or in my work) and had to do Settings Activity over and over again.
So I had enough. wasted to much time in my life doing same code every time.

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
  compile 'com.github.udioshi85:libGenericSettings:1.0.5'
}
````  

* Via Maven
````xml
<dependency>
  <groupId>com.github.udioshi85</groupId>
  <artifactId>libGenericSettings</artifactId>
  <version>1.0.5</version>
  <type>pom</type>
</dependency>
````

## Supported views
* [HeaderData](https://github.com/UdiOshi85/libGenericSettings/blob/master/src/main/java/com/oshi/libgenericsettings/data/HeaderData.java) -  headerName (String) & headerColor (Integer) fields.
![alt text](https://github.com/UdiOshi85/GenericSettings/blob/master/tut-pics/header-title.jpg "HeaderData example")  
* [TitleData](https://github.com/UdiOshi85/libGenericSettings/blob/master/src/main/java/com/oshi/libgenericsettings/data/TitleData.java) - title (String) & titleColor (Integer) fields.
![alt text](https://github.com/UdiOshi85/GenericSettings/blob/master/tut-pics/title.jpg "TitleData example")  
* [TitleSubtitleData](https://github.com/UdiOshi85/libGenericSettings/blob/master/src/main/java/com/oshi/libgenericsettings/data/TitleSubtitleData.java) - title (String), subtitle (String), titleColor (Integer) & subtitleColor (Integer) fields.
![alt text](https://github.com/UdiOshi85/GenericSettings/blob/master/tut-pics/title-subtitle-data.jpg "TitleSubtitleData example") 
* [IconTitleData](https://github.com/UdiOshi85/libGenericSettings/blob/master/src/main/java/com/oshi/libgenericsettings/data/IconTitleData.java) - TitleData Fields & iconResId (Integer) field.
![alt text](https://github.com/UdiOshi85/GenericSettings/blob/master/tut-pics/icon-title.jpg "IconTitleData example") 
* [TitleSwitchData](https://github.com/UdiOshi85/libGenericSettings/blob/master/src/main/java/com/oshi/libgenericsettings/data/TitleSwitchData.java) - TitleData Fields & isSwitchOn (Boolean) field.
![alt text](https://github.com/UdiOshi85/GenericSettings/blob/master/tut-pics/title-switch.jpg "TitleSwitchData example") 
* [TitleSubtitleSwitchData](https://github.com/UdiOshi85/libGenericSettings/blob/master/src/main/java/com/oshi/libgenericsettings/data/TitleSubtitleSwitchData.java) - TitleSubtitleData Fields & isSwitchOn (Boolean) field.
![alt text](https://github.com/UdiOshi85/GenericSettings/blob/master/tut-pics/title-subtitle-switch.jpg "TitleSubtitleSwitchData example") 
* [TitleSubtitleCheckbox](https://github.com/UdiOshi85/libGenericSettings/blob/master/src/main/java/com/oshi/libgenericsettings/data/TitleSubtitleCheckbox.java) - TitleSubtitleData fields & isEnabled field.  
![alt text](https://github.com/UdiOshi85/GenericSettings/blob/master/tut-pics/title-subtitle-checkbox.jpg "TitleSubtitleCheckbox example")
 * [TitleSecondaryTitleData](https://github.com/UdiOshi85/libGenericSettings/blob/master/src/main/java/com/oshi/libgenericsettings/data/TitleSecondaryTitleData.java) -  TitleData Fields, secondaryTitle (String) & secondaryTitleColor (Integer) fields.
 ![alt text]( https://github.com/UdiOshi85/GenericSettings/blob/master/tut-pics/title-secondary-title.jpg "TitleSecondaryTitleData example")
 * [DividerData](https://github.com/UdiOshi85/libGenericSettings/blob/master/src/main/java/com/oshi/libgenericsettings/data/DividerData.java) - dividerColor(Integer) field - Simple divider, 1 dp height.
 
 ## Example
 I tried to minify the code as much as I can't. So we're going to need a recyclerview, adapter, and presenter.

In your Activity/Fragment add a simple xml with RecyclerView and in your onCreate / onViewCreated
````java
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        settingsPresenter = new MainPresenter();
        adapter = new SettingsAdapter(MainActivity.this, settingsPresenter);
        recyclerView.setAdapter(adapter);
    }
````
For the presenter, Create your own MainPresenter and extend from BaseSettingsPresenter. Here's a presenter example which shows all the view types together:
````java
public class MainPresenter extends BaseSettingsPresenter {

    @Override
    public List<BaseViewTypeData> getItems(Context context) {

        List<BaseViewTypeData> dataList = new ArrayList<>();

        // Simple header
        HeaderData firstHeader = new HeaderData("Simple header");
        dataList.add(firstHeader);

        // Title only
        TitleData titleData = new TitleData("Title only");
        dataList.add(titleData);

        dataList.add(DividerData.create());

        // Title & Subtitle, Subtitle is red!
        TitleSubtitleData titleSubtitleData = new TitleSubtitleData("Title & Subtitle", "Subtitle is red!");
        titleSubtitleData.setSubtitleColor(R.color.red);
        dataList.add(titleSubtitleData);

        dataList.add(DividerData.create());

        // Icon & title
        IconTitleData iconTitleData = new IconTitleData("Icon & title");
        iconTitleData.setIconResId(R.drawable.ic_android_black_24dp);
        dataList.add(iconTitleData);

        // Colored header
        HeaderData coloredHeader = new HeaderData("Colored header", R.color.red);
        dataList.add(coloredHeader);

        // Title & Switch
        TitleSwitchData titleSwitchData = new TitleSwitchData("Title & Switch", false);
        dataList.add(titleSwitchData);

        dataList.add(DividerData.create());

        // Title, Subtitle & Switch
        TitleSubtitleSwitchData titleSubtitleSwitchData = new TitleSubtitleSwitchData("Title, Subtitle & Switch", "Subtitle is here", false);
        dataList.add(titleSubtitleSwitchData);

        dataList.add(DividerData.create());

        // Title, Subtitle & Checkbox
        TitleSubtitleCheckbox titleSubtitleCheckbox = new TitleSubtitleCheckbox("Title, Subtitle & Checkbox", "Subtitle is here", false);
        dataList.add(titleSubtitleCheckbox);

        dataList.add(DividerData.create());

        // Title & Secondary title
        TitleSecondaryTitleData titleSecondaryTitleData = new TitleSecondaryTitleData("Title & Secondary title", "8");
        dataList.add(titleSecondaryTitleData);

        return dataList;
    }
````

And the output is:
 ![alt text]( https://github.com/UdiOshi85/GenericSettings/blob/master/tut-pics/all-items.png "Setting screen example")
 
## Dev note - To handle clicks, you should override the functions in BaseSettingsPresenter class

## Contribution
This library was built for all developers who don't wish to do all the Settings screen logic over and over again. You can do whatever you want with this library. No contribution is needed. the You can [clone/download full library code](https://github.com/UdiOshi85/libGenericSettings).  
I do wish to get your feedback about this library, I will maintain it as long as i'm considering myself as an android developer so feel free to open issues / ask for new viewtypes / or just STAR this page.
