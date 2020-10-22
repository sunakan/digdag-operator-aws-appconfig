package io.digdag.plugin.aws.appconfig.module.service

import io.digdag.plugin.aws.appconfig.module.component.LoggerComponent
import io.digdag.plugin.aws.appconfig.module.repository.aws.AwsAppConfigRepository

interface AwsAppConfigService : LoggerComponent.Context, AwsAppConfigRepository.Context {

    companion object :
        AwsAppConfigService,
        LoggerComponent.Provider,
        AwsAppConfigRepository.Provider

    fun test(message: String) {
        logger.warn("test")
        awsAppConfigRepository.test(message)
    }
}
