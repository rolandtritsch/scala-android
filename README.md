# My first Scala Android project

What you need to do to make it work ...

* install sbt
* install the Android SDK and download platform level 19 (this is the one I am using)
* clone this repo to `<dir of your choice>`
* you either need to set ANDROID_HOME or you need to run `android project update -p <dir of your choice>/scala-android`
* create an [avd](http://developer.android.com/tools/devices/managing-avds-cmdline.html) (I recommend to use the Google API target) and start the emulator
* run `sbt compile` and `ant debug`
* run `adb install -r bin/HelloWorld-debug.apk`
* open HelloActivity on the emulator

... and you should be in business.
