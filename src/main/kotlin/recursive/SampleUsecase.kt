package recursive

class SampleUsecase(private val gateway: SampleGateway):ISampleUsecase {
    override fun execute() {
        println("execute usecase")
        gateway.execute()
    }
}