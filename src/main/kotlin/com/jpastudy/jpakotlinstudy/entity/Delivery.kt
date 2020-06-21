package com.jpastudy.jpakotlinstudy.entity

import Order
import javax.persistence.*

@Entity
class Delivery (
    @Id @GeneratedValue
    @Column(name = "delivery_id")
    var id: Long,

    @OneToOne(mappedBy = "delivery", fetch = FetchType.LAZY)
    var order: Order,

    @Embedded
    var address: Address,

    @Enumerated(EnumType.STRING)
    var status: DeliveryStatus
)
