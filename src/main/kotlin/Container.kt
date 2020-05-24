import kotlin.reflect.KClass
import kotlin.reflect.full.primaryConstructor

object Container {
    private val map = HashMap<KClass<*>, KClass<*>>()
    public fun <T : Any> register(clazz: KClass<T>) {
        map.put(clazz, clazz)
    }

    public fun <T : Any> get(clazz: KClass<T>): T {
        val constructor = map.get(clazz)?.primaryConstructor ?: throw Exception("${clazz.simpleName} is not found")
        return constructor.call() as T
    }
}