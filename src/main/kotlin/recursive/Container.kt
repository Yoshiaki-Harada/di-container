package recursive

import kotlin.reflect.KClass
import kotlin.reflect.full.primaryConstructor

object Container {
    private val map = HashMap<KClass<*>, KClass<*>>()
    public fun <T : Any> register(clazz: KClass<T>) {
        map[clazz] = clazz
    }

    public fun <T : Any> get(clazz: KClass<T>): T {
        val constructor = map[clazz]?.primaryConstructor ?: throw Exception("${clazz.simpleName} is not found")
        val params = constructor.parameters
            .map {
                val kClass = it.type.classifier as KClass<*>
                map[kClass] ?: throw Exception("$kClass is not found in this Container")
            }
            .map { get(it) }
            .toTypedArray()
        return constructor.call(*params) as T
    }
}