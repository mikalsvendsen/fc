package com.github.mikalsvendsen.fc.services

import com.github.mikalsvendsen.fc.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
