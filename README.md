# My first Scala Android project

What you need to do to make it work ...

* install sbt
* install the Android SDK and download platfrom level 18 (this is the one I am using)
* clone this repo
* create an avd and start the emulator
* run `sbt compile` and `ant debug`
* run `adb install -r bin/HelloWorld-debug.apk`
* open HelloActivity on the emulator

... and you should be in business.