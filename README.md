# EasyBehavior
滑动隐藏显示标题栏、底部导航栏以及悬浮按钮......


How to include it in your project:
--------------
**Step 1.** Add the JitPack repository to your build file
```groovy
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

**Step 2.** Add the dependency
```groovy
dependencies {
    implementation 'com.google.android.material:material:1.2.1'
	implementation 'com.github.FPhoenixCorneaE:EasyBehavior:1.0.0'
}
```


------------------------------------------------------
#### 设置app:layout_behavior属性的View必须是CoordinatorLayout的childView,否则无效
```xml
<androidx.coordinatorlayout.widget.CoordinatorLayout>
    <com.google.android.material.appbar.MaterialToolbar
        app:layout_behavior="@string/easy_behavior_title_behavior"/>
    <androidx.core.widget.NestedScrollView/>
    <com.google.android.material.floatingactionbutton.FloatingActionButton
        app:layout_behavior="@string/easy_behavior_float_behavior"/>
    <com.google.android.material.bottomnavigation.BottomNavigationView
        app:layout_behavior="@string/easy_behavior_bottom_behavior"/>
</androidx.coordinatorlayout.widget.CoordinatorLayout>
```

--------------------------------------------
#### 你也可以调用show()、hide()实现显示隐藏View
```kotlin
AbstractEasyBehavior.from(toolbar).hide()
```
```kotlin
AbstractEasyBehavior.from(toolbar).show()
```