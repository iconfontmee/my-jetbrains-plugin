package com.github.iconfontmee.myjetbrainsplugin.services

import com.intellij.openapi.project.Project
import com.github.iconfontmee.myjetbrainsplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
