class GestorPedidos(private val procesadores:Map<String, ProcesarPedido>) {
    fun procesarPedido(pedido: Pedido) {
        val procesador = procesadores[pedido.tipo]
        procesador?.procesar(pedido) ?: println("Tipo de pedido '${pedido.tipo}' no soportado.") // esto copiado de diego
    }
}