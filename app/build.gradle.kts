plugins { id("com.android.application"); id("org.jetbrains.kotlin.android") }
android {
    namespace = "com.zombiefarm.game"
    compileSdk = 34
    defaultConfig { applicationId = "com.zapfarm.game"; minSdk = 24; targetSdk = 34; versionCode = 1; versionName = "0.1" }
    compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
    kotlinOptions { jvmTarget = "17" }
}
