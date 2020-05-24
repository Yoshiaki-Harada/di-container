package basic

import kotlin.reflect.KClass
import kotlin.reflect.full.primaryConstructor

object Container {
    private val map = HashMap<KClass<*>, KClass<*>>()
    public fun <T : Any> register(clazz: KClass<T>) {
        map[clazz] = clazz
    }

    public fun <T : Any> get(clazz: KClass<T>): T {
        val constructor =
            map[clazz]?.primaryConstructor ?: throw Exception("${clazz.simpleName} is not found in this Container")
        return constructor.call() as T
    }
}