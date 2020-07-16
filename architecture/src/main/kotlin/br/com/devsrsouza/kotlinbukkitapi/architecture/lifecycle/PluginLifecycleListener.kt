package br.com.devsrsouza.kotlinbukkitapi.architecture.lifecycle

enum class LifecycleEvent { LOAD, ENABLE, DISABLE, CONFIG_RELOAD }

typealias PluginLifecycleListener = (LifecycleEvent) -> Unit