interface ProcesarPedido {
    fun procesar(pedido:Pedido)
}

data class Pedido(val id: Int, val tipo: String, val detalles: String)

fun main() {
    val procesadores = mapOf(
        "digital" to PedidoDigital(),
        "fisico" to PedidoFisico(),
        "suscripcion" to PedidoSuscripcion()
        // Añadir nuevos procesadores de pedidos aquí no requeriría modificar el código de GestorPedidos.
    )

    val gestorPedidos = GestorPedidos(procesadores)

    // Procesar pedidos...

    val pedidoDigital = Pedido(1, "digital", "E-book de Kotlin")
    gestorPedidos.procesarPedido(pedidoDigital)

    val pedidoFisico = Pedido(2, "fisico", "Libro impreso de Kotlin")
    gestorPedidos.procesarPedido(pedidoFisico)

    val pedidoSuscripcion = Pedido(3, "suscripcion", "Suscripción a curso de Kotlin")
    gestorPedidos.procesarPedido(pedidoSuscripcion)

    val pedidoDesconocido = Pedido(4, "desconocido", "Producto misterioso")
    gestorPedidos.procesarPedido(pedidoDesconocido) // Este mostrará un mensaje de tipo de pedido no soportado.
}