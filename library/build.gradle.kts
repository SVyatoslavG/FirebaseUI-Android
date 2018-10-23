import com.android.build.gradle.internal.dsl.TestOptions

tasks.named("check").configure { dependsOn("testAll", "prepareArtifacts") }

apply(plugin = "com.github.dcendents.android-maven")

group = "com.github.SVyatoslavG"

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
