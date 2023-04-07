plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.awilab.socketio"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.awilab.socketio"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.2"
    }
    packagingOptions {
        resources {
            excludes += listOf("META-INF/*")
        }
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.10.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")

    implementation("androidx.activity:activity-compose:1.7.0")
    implementation("androidx.compose.ui:ui:1.4.1")
    implementation("androidx.compose.ui:ui-tooling-preview:1.4.1")
    implementation("androidx.compose.material3:material3:1.1.0-beta02")
    implementation("androidx.compose.animation:animation:1.4.1")
    implementation("androidx.compose.foundation:foundation:1.4.1")
    implementation("androidx.compose.runtime:runtime:1.4.1")
    implementation("androidx.compose.runtime:runtime-livedata:1.4.1")

    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.4.1")
    debugImplementation("androidx.compose.ui:ui-tooling:1.4.1")
    debugImplementation("androidx.compose.ui:ui-test-manifest:1.4.1")

    implementation(project(":BaseModules:common"))
    implementation(project(":BaseModules:network"))
    implementation(project(":BaseModules:testing"))
}