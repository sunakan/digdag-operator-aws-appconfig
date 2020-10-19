package io.digdag.plugin.aws.appconfig.module.service

import io.digdag.plugin.aws.appconfig.module.repository.aws.UseAwsAppConfigRepository
import io.digdag.plugin.aws.appconfig.module.repository.aws.UseAwsAppConfigRepositoryCompanion
import io.digdag.plugin.aws.appconfig.module.repository.aws.UseAwsAppConfigRepositoryMock

interface AwsAppConfigService : UseAwsAppConfigRepository {

    fun test(message: String) {
        awsAppConfigRepository.test(message)
    }

    companion object :
        AwsAppConfigService,
        UseAwsAppConfigRepositoryCompanion

    object Mock :
        AwsAppConfigService,
        UseAwsAppConfigRepositoryMock
}
