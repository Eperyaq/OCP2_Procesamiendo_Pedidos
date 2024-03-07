class PedidoSuscripcion: ProcesarPedido{
    override fun procesar(pedido: Pedido) {
        println("Procesando una Suscripcion: ${pedido.detalles}")
    }
}