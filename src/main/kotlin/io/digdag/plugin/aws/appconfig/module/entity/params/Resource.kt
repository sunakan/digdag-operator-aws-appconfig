package io.digdag.plugin.aws.appconfig.module.entity.params

import io.digdag.client.config.Config

data class Resource(
    val application: String,
    val environment: String,
    val coufinguration: String,
    val clientId: String,
    val clientConfigurationVersion: String?
) {
    companion object {
        fun fromConfig(config: Config): Resource? {
            if (config.isEmpty()) return null
            return Resource(
                config.get("application", String::class.java),
                config.get("environment", String::class.java),
                config.get("configuration", String::class.java),
                config.get("client_id", String::class.java),
                config.getOptional("client_configuration_version", String::class.java).let { it.orNull() }
            )
        }
    }
}
