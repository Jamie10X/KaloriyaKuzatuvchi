buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.application:com.android.application.gradle.plugin:8.2.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0")
    }

}
tasks.register("clean", Delete::class){
    delete(rootProject.buildDir)
}