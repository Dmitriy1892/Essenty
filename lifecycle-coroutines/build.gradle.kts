import com.arkivanov.gradle.setupBinaryCompatibilityValidator
import com.arkivanov.gradle.setupMultiplatform
import com.arkivanov.gradle.setupPublication
import com.arkivanov.gradle.setupSourceSets

plugins {
    id("kotlin-multiplatform")
    id("com.android.library")
    id("com.arkivanov.gradle.setup")
}

setupMultiplatform()
setupPublication()
setupBinaryCompatibilityValidator()

android {
    namespace = "com.arkivanov.essenty.lifecycle.coroutines"
}

kotlin {
    setupSourceSets {
        common.main.dependencies {
            implementation(project(":lifecycle"))
            implementation(deps.kotlinx.coroutinesCore)
        }

        common.test.dependencies {
            implementation(deps.kotlinx.coroutinesTest)
        }
    }
}
