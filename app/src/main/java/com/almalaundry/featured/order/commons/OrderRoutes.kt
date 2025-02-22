package com.almalaundry.featured.order.commons

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class OrderRoutes(val route: String) {
    @Serializable
    @SerialName("order")
    data object Index : OrderRoutes("order")

    @Serializable
    @SerialName("order/{orderId}")
    data class Detail(
        val orderId: String
    ) : OrderRoutes("order/{orderId}")
}