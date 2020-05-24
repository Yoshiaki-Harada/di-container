package basic_interface

fun main() {
    Container.register(ISampleUsecase::class,SampleUsecase::class)
    val driver = Container.get(ISampleUsecase::class)
    driver.execute()
}