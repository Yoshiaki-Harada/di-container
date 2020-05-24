package recursive

import java.time.chrono.IsoChronology

fun main() {
    Container.register(SampleDriver::class)
    Container.register(SampleGateway::class)
    Container.register(ISampleUsecase::class, SampleUsecase::class)
    val usecase = Container.get(ISampleUsecase::class)
    usecase.execute()
}