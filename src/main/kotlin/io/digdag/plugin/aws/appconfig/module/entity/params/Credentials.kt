package io.digdag.plugin.aws.appconfig.module.entity.params

import io.digdag.client.config.Config

data class Credentials(val accessKeyId: String, val secretAccessKey: String) {
    companion object {
        fun fromConfig(config: Config): Credentials? {
            if (config.isEmpty()) return null
            return Credentials(
                config.get("access_key_id", String::class.java),
                config.get("secret_access_key", String::class.java)
            )
        }
    }
}
