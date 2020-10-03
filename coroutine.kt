object Coroutines {
    fun main(work : suspend (()-> Unit)) = CoroutineScope(Dispatchers.Main).launch {
        work()
    }

    fun IO(work : suspend (()-> Unit)) = CoroutineScope(Dispatchers.IO).launch {
        work()
    }

    fun Default(work : suspend (()-> Unit)) = CoroutineScope(Dispatchers.Default).launch {
        work()
    }

    fun Unconfined(work : suspend (()-> Unit)) = CoroutineScope(Dispatchers.Unconfined).launch {
        work()
    }
}