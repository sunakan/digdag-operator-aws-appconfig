package io.digdag.plugin.aws.appconfig.module.service

import io.digdag.plugin.aws.appconfig.module.component.LoggerComponent

interface AwsCredentialsService : LoggerComponent.Context {

    companion object :
        AwsCredentialsService,
        LoggerComponent.Provider

    interface Context {
        val awsCredentialsService: AwsCredentialsService
    }

    interface Provider : Context {
        override val awsCredentialsService: AwsCredentialsService
            get() = AwsCredentialsService
    }

    fun test(message: String) {
        logger.warn("test")
    }
}
