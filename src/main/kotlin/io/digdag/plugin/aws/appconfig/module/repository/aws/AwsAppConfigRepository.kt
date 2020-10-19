package io.digdag.plugin.aws.appconfig.module.repository.aws

interface AwsAppConfigRepository {
    companion object : AwsAppConfigRepository

    fun test(message: String) {
        println("RepositoryCompanionObject: $message")
    }
}

interface UseAwsAppConfigRepository {
    val awsAppConfigRepository: AwsAppConfigRepository
}

interface UseAwsAppConfigRepositoryCompanion : UseAwsAppConfigRepository {
    override val awsAppConfigRepository: AwsAppConfigRepository
        get() = AwsAppConfigRepository
}

interface UseAwsAppConfigRepositoryMock : UseAwsAppConfigRepository {
    override val awsAppConfigRepository: AwsAppConfigRepository
        get() = object : AwsAppConfigRepository {
            override fun test(message: String) {
                println("RepositoryMock: $message")
            }
        }
}
