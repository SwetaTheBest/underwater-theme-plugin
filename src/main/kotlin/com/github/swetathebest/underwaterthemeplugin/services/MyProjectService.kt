package com.github.swetathebest.underwaterthemeplugin.services

import com.intellij.openapi.project.Project
import com.github.swetathebest.underwaterthemeplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
