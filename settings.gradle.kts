pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Kaloriya kuzatuvchi"
include(":app")
include(":onboarding")
include(":core")
include(":tracker")
include(":onboarding:presentation")
include(":onboarding:domain")
include(":tracker:data")
include(":tracker:domain")
include(":tracker:presentation")
