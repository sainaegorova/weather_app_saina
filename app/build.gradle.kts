plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)

}


android {
    namespace = "com.example.weathersaina"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.weathersaina"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    buildFeatures{
        viewBinding = true
    }

}

dependencies {

    implementation(libs.volley)
    implementation(libs.picasso)
    implementation(libs.play.services.location)
    implementation(libs.androidx.fragment.ktx)

    implementation(libs.androidx.lifecycle.viewmodel.ktx.v286)

    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.volley)
    implementation(libs.androidx.fragment)
    implementation(libs.google)

    implementation(libs.viewmodel)
    implementation(libs.runtime)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //implementation (libs.lifecycle.viewmodel.ktx)
    //implementation (libs.androidx.lifecycle.runtime.ktx)
}