package recursive

fun main() {
    Container.register(SampleDriver::class)
    Container.register(SampleGateway::class)
    Container.register(ISampleUsecase::class, SampleUsecase::class)
    val usecase = Container.get<SampleUsecase>(SampleUsecase::class)
    usecase.execute()
}