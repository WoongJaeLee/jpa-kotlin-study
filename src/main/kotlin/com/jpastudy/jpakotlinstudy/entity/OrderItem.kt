package com.jpastudy.jpakotlinstudy.entity

import com.jpastudy.jpakotlinstudy.entity.item.Item
import javax.persistence.*

@Entity
class OrderItem (

    @Id @GeneratedValue
    @Column(name = "order_item_id")
    var id: Long,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    var order: Order,

    @ManyToOne(fetch = FetchType.LAZY)
    var item: Item,

    var orderPrice: Int,

    var count: Int
)
