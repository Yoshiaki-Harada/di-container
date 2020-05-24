package basic

fun main() {
    Container.register(SampleUsecase::class,SampleUsecase::class)
    val driver = Container.get(SampleUsecase::class)
    driver.execute()
}