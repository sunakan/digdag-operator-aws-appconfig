package io.digdag.plugin.aws.appconfig.module.service

import io.digdag.plugin.aws.appconfig.module.component.LoggerComponent

interface ParamService : LoggerComponent.Context {

    companion object :
        ParamService,
        LoggerComponent.Provider
}
