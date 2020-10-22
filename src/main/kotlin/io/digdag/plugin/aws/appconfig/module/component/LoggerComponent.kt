package io.digdag.plugin.aws.appconfig.module.component

import org.slf4j.Logger
import org.slf4j.LoggerFactory

interface LoggerComponent {

    interface Context {
        val logger: LoggerComponent
    }

    interface Provider : Context {
        override val logger: LoggerComponent
            get() = this.let {
                object : LoggerComponent {
                    override val inner = LoggerFactory.getLogger(it::class.java)
                }
            }
    }

    val inner: Logger

    fun info(msg: String) {
        inner.info(msg)
    }

    fun warn(msg: String) {
        inner.warn(msg)
    }

    fun error(msg: String) {
        inner.error(msg)
    }
}
