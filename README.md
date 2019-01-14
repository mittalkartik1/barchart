# barchart
It is used to create a bar chart with specified percentage of individual bars.

# USAGE
You can set the bars colour and the background colour also using its pre defined functions.
#### setBarNum(LinearLayout layout, Activity activity, BarNum, Integer[] array)
It is the main function used for drawing the bar chart on specified LinearLayout. Number of bars are passed in its parameters. And respective percentage of these bars are passed in integer array of its parameter.
#### setBackColor(String color) 
It is used to set the background colour behind the bars. Just pass the hex code of the colour as parameter of this function. Eg:-#ff0000
#### setBarsColor(String color, Linearlayout layout)
This method is used to set the bars colour by passing colour hex code and linearlayout object on which you are using this as parameter to this function.

# IMPLEMENTATION
To use this in your project you just have to do two things:-
## 1. Add 
```
dependencies{
      ...
      implementation 'com.github.mittalkartik1:barchart:1.0'
}
```
in build.gradle (Module:app) 
## 2. Then add
```
allprojects {
    repositories {
        google()
        jcenter()
        maven { url "https://jitpack.io" }
    }
}
```
in build.gradle (Project: Application_name)
