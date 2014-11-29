// so we can use keywords from Android, such as 'Android' and 'proguardOptions'
import android.Keys._

// load the android plugin into the build
android.Plugin.androidBuild

// project name, completely optional
name := "hello-world"

// pick the version of scala you want to use
scalaVersion := "2.11.4"

// scala 2.10 flag for feature warnings
scalacOptions in Compile += "-feature"

// for non-ant-based projects, you'll need this for the specific build target
platformTarget in Android := "android-21"

// this is needed for scala 2.11.4
proguardOptions in Android ++= Seq("-dontobfuscate", "-dontoptimize", "-keepattributes Signature", "-printseeds target/seeds.txt", "-printusage target/usage.txt", "-dontwarn scala.collection.**")

// call install and run without having to prefix with android
run <<= run in Android

install <<= install in Android
