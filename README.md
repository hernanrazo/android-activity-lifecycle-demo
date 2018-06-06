Android Lifecycle Demo
===

An android app demo that showcases the android activity lifecycle. There are two activities, `MainActivity.java` and `secondActivity.java`. Using the logcat and the log class, this app shows the user when each callback is called in both activities. Both activities have a button that is used to switch between the two and showcase how the lifecycles interact in each respective activity and when switching between the two.

BACKGROUND:
---
The android activity lifecycle includes the following callbacks:  

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
Called when 

onStop()
----
Called when the activiy becomes invisible to the user. The activity and its resources may still be running in the background even though it is not visible. 

onRestart()
----
Called after an activity has been stopped. This call reverts the activity to its visible lifetime.

onDestroy()
----
The end of the activity lifecycle. This activity is used to stop all resources and tasks started in onCreate(). 



Sources and helpful links:
---
https://developer.android.com/guide/components/activities/activity-lifecycle#java
