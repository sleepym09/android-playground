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

rootProject.name = "android-playground"

sequenceOf("app", "dependencies")
    .flatMap { File(rootDir, it).walk().maxDepth(5) }
    .filter { it.name == "build.gradle.kts" }
    .map { it.parent }
    .map { it.removePrefix(rootDir.path) }
    .map { it.replace(File.separatorChar, ':') }
    .forEach { include(it) }