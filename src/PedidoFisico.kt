class PedidoFisico:ProcesarPedido {
    override fun procesar(pedido: Pedido) {
        println("Procesando un pedido Fisico: ${pedido.detalles}")
    }
}