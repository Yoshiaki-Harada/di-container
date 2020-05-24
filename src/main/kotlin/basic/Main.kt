package basic

fun main() {
    Container.register(SampleUsecase::class)
    val usecase = Container.get(SampleUsecase::class)
    usecase.execute()
}