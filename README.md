# Tag Sphere View

![Preview-logo](/art/logo.gif "Preview demo")

## Overview  

An Android library to implement an animated tag sphere

- **API SDK 21+**
- **Written in [Kotlin](https://kotlinlang.org)**
- **Supports customization**


## Dependency  

Add this in your root build.gradle file:
```groovy
allprojects {
	repositories {
        maven { url "https://jitpack.io" }
    }
}
```
Then, add the library to your module build.gradle:

```groovy
dependencies {
    implementation 'com.github.magic-goop:tag-sphere:LATEST.RELEASE.HERE'
}
```

## Usage  

Add widget in your xml layout like this:
```xml
<com.magicgoop.tagsphere.TagSphereView
    android:id="@+id/tagView"    
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
```

In code add list of tags you want to display:
```java
(0..40).map {
  TextTagItem(text = "Some text $it")
}.toList().let {
  tagView.addTagList(it)
}
```

You can change text appearance via:
```java
tagView.setTextPaint(
  TextPaint().apply {
    isAntiAlias = true
    textSize = resources.getDimension(R.dimen.tag_text_size)
    color = Color.DKGRAY
  }
)
```
###### Note: ```.setTextPaint``` should be called before setting tags list

## Library supports different types of customization   

![Preview-demo](/art/demo.gif)  

| Xml                         | Code                                                    | Notes                                                                                              |
| --------------------------- |:-------------------------------------------------------:| --------------------------------------------------------------------------------------------------:|
| app:radius="1.5"            | tagView.setRadius(1.5f)                                 | Radius of sphere. Bigger value is then lesser radius will be. Value limited from 1f to 10f         |
| app:touchSensitivity="5"    | tagView.setTouchSensitivity(5)                          | Touch sensitivity. Bigger value is then slower sphere will be rotated. Value limited from 1 to 100 |
| app:rotateOnTouch="false"   | tagView.rotateOnTouch(false)                            |  Allow rotate sphere on touch                                                                      |
| app:easingFunction="easeIn" | tagView.setEasingFunction { EasingFunction.easeIn(it) } | Specifies easing function to control how tags are drawn in relation of z coordinate.               |


Set next listeners to get click callbacks:  
```java
tagView.setOnLongPressedListener(this)
tagView.setOnTagTapListener(this)
```

For more information checkout [example](/example) project in repository.

## Limitations

###### All drawing and computation done on UI thread hence there could be frames drops on slow devices or with big amount of objects to render.


## Issues
If you find any problems or would like to suggest a feature, please feel free to file an [issue](https://github.com/magic-goop/tag-sphere/issues)

## Some examples of what you can do with this library  

Showcase 1                 |  Showcase 2              |  Showcase 3              |
:-------------------------:|:------------------------:|:------------------------:|
![](/art/showcase1.gif)    | ![](/art/showcase2.gif)  | ![](/art/showcase3.gif)  |

## License

    Copyright 2018 Alexander Rychkov

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
