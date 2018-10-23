tasks.named("check").configure { dependsOn("testAll", "prepareArtifacts") }

android {
    lintOptions {
        isAbortOnError = false
    }
}

dependencies {
    api(project(":auth"))
    api(project(":database"))
    api(project(":firestore"))
    api(project(":storage"))
}


apply plugin: 'com.github.dcendents.android-maven'  

group='com.github.SVyatoslavG'