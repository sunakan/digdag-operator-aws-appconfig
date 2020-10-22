package io.digdag.plugin.aws.appconfig.module.repository.aws

interface AwsAppConfigRepository {
    companion object : AwsAppConfigRepository

    interface Context {
        val awsAppConfigRepository: AwsAppConfigRepository
    }

    interface Provider : Context {
        override val awsAppConfigRepository: AwsAppConfigRepository
            get() = AwsAppConfigRepository
    }

    fun test(message: String) {
        println("RepositoryCompanionObject: $message")
    }
}
