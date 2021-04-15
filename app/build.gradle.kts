
}plugins {
id("com.android.application")
kotlin("android")
kotlin("android.extensions")
}

android {
compileSdkVersion (30)//function
buildToolsVersion=  "30.0.1"

defaultConfig {
applicationId = "com.ibareq.the_chance_week6"//property
minSdkVersion( 23)//function
targetSdkVersion (30)//function
versionCode =1 //property
versionName ="1.0"//property

testInstrumentationRunner ="androidx.test.runner.AndroidJUnitRunner"
}

buildTypes {
getByName("release") {
isMinifyEnabled =false
proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
}
}
////////////////
compileOptions {
sourceCompatibility( JavaVersion.VERSION_1_8)
targetCompatibility (JavaVersion.VERSION_1_8)
}
kotlinOptions {
jvmTarget =" 1.8"
}
}

//dependencies {
//
//


//    implementation ("androidx.appcompat:appcompat:1.2.0")
//





dependencies {

implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.21")
implementation ("androidx.appcompat:appcompat:1.2.0")
implementation("androidx.core:core-ktx:1.3.2")
implementation("androidx.constraintlayout:constraintlayout:2.0.4")
implementation( "com.google.android.material:material:1.3.0")
testImplementation("junit:junit:4.+")
androidTestImplementation(" androidx.test.ext:junit:1.1.2")
androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
}