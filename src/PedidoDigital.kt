class PedidoDigital: ProcesarPedido {
    override fun procesar(pedido: Pedido) {
        println("Procesando un pedido Digital: ${pedido.detalles}")
    }
}