package basic

fun main() {
    Container.register(SampleDriver::class)
    val driver = Container.get(SampleDriver::class)
    driver.execute()
}