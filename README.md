Android Lifecycle Demo
===

An android app demo that showcases the android activity lifecycle. There are two activities, `MainActivity.java` and `secondActivity.java`. Using the logcat and the log class, this app shows the user when each callback is called in both activities. Both activities have a button that is used to switch between the two and showcase how the lifecycles interact in each respective activity and when switching between the two.

BACKGROUND:
---
The android activity lifecycle includes the following callbacks: `onCreate()`, `onStart()`, `onResume()`, `onPause()`, `onStop()`, `onRestart()`, and `onDestroy()`. These callbacks offer areas for developers to dictate how apps behave. 

onCreate()
----
This activity is mandatory. It must be in all activities in an android project. the activity lifecycle begins here. This is where any layout resources (buttons, textViews, etc.) and background threads are initialized. 

onStart()
----
Called right after onCreate(). An activity is in this state when it becomes visible to the user.

onResume()
----
Called when the user returns to an activity after briefly exiting it. At this point, the user is interacting with the activity and is completely visible to the user.

onPause()
----
Called when the user leaves the current activity to another activity or leaves the app altogether. Certain processes that are not needed while the activity is not in the foreground will be stopped.  

onStop()
----
Called when the activiy becomes invisible to the user. The activity and its resources may still be running in the background even though it is not visible. 

onRestart()
----
Called after an activity has been stopped. This call reverts the activity to its visible lifetime.

onDestroy()
----
The end of the activity lifecycle. This activity is used to stop all resources and tasks started in onCreate(). 

How to use this demo
===

As stated earlier, there are two activities in this app. Toasts on the screen and logs in the logcat show up whenever a callback is called.   
  
You can view the logcat logs by opening the logcat in android studio while your android device is running the app and connected to your computer.  

![Logcat screenshot](https://github.com/hrazo7/android-activity-lifecycle-demo/blob/master/images/logcat.png)]  

When looking at the actual phone screen, you can see that the toasts for each respective callback will pop up on the screen. `onCreate()` will show up on top and all other callbacks up to `onStop()`will show up underneath it. The toasts for the first activity will show up on the left while the callbacks for the second activity will show up on the right. The example screenshots shown here will show the behavior for the first activity only.  

Map showing where each activity's toasts will show up:  

<img src="https://github.com/hrazo7/android-activity-lifecycle-demo/blob/master/images/toastMap.png" width="400" height="650" title="Toast Map">  

The `onCreate()` toasts will show up the highest:  
  
<img src="https://github.com/hrazo7/android-activity-lifecycle-demo/blob/master/images/onCreate.png" width="400" height="650" title="onCreate">    
Switch between activities to see other callbacks and how they are each called. In this case, the user went from the second activity into the first activity:  

<img src="https://github.com/hrazo7/android-activity-lifecycle-demo/blob/master/images/betweenActivities.png" width="400" height="650" title="between activities">  

the `onPause()` toasts will show up when you escape but don't kill the app. As shown here, the toast shows up on the homescreen:   
  
<img src="https://github.com/hrazo7/android-activity-lifecycle-demo/blob/master/images/onPause.png" width="400" height="650" title="onPause">  

All other callback toasts should be fairly obvious. To call the `onRestart()` callback toast, exit the app without killing it and then return to it shortly after:  
  
<img src="https://github.com/hrazo7/android-activity-lifecycle-demo/blob/master/images/onRestart.png" width="400" height="650" title="onRestart">  

Sources and helpful links:
---
https://developer.android.com/guide/components/activities/activity-lifecycle#java
