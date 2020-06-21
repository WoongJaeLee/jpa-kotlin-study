package com.jpastudy.jpakotlinstudy.entity

import Order
import javax.persistence.*

@Entity
class Member(
    @Id @GeneratedValue
    @Column(name = "member_id")
    var id: Long,

    var name: String,

    @Embedded
    var address: Address,

    @OneToMany(mappedBy = "member")
    var orders: MutableList<Order>
)