import org.gradle.api.Project

fun Project.applyDependencyManagement() {
    configurations.all {
        resolutionStrategy {
            force("com.squareup:javapoet:1.13.0")
            force("org.jetbrains.kotlinx:kotlinx-serialization-core:1.5.1")
            force("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1")
        }
    }
} 