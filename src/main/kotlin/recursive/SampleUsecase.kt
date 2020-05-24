package recursive

class SampleUsecase(private val gateway: SampleGateway) {
    fun execute() {
        println("execute usecase")
        gateway.execute()
    }
}