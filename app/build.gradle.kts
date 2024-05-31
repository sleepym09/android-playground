plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.sleep.android_playground"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.sleep.android_playground"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    buildFeatures {
        viewBinding = true
        compose = true
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    composeOptions {
        val composeCompilerVersion: String by rootProject
        kotlinCompilerExtensionVersion = composeCompilerVersion
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // androidx
    implementation(libs.androidx.core)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constrantlayout)
    implementation(libs.androidx.activitycompose)
    implementation(libs.androidx.navigationcompose)
    implementation(libs.material)

    // coroutines
    implementation(libs.bundles.coroutines)

    // compose
    implementation(platform(libs.compose.bom))
    implementation(libs.compose.ui)
    implementation(libs.compose.uigraphics)
    implementation(libs.compose.uipreview)
    implementation(libs.compose.uimaterial3)

    // lifecycle
    implementation(libs.bundles.lifecycle)

    // test
    testImplementation(libs.test.junit)
    androidTestImplementation(libs.test.extjunit)
    androidTestImplementation(libs.test.espresso)
    androidTestImplementation(libs.test.uitestjunit4)
    debugImplementation(libs.compose.test.uitooling)
    debugImplementation(libs.compose.test.uitestmanifest)
}