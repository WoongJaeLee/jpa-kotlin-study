package com.jpastudy.jpakotlinstudy.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Member(
    @Id @GeneratedValue var id: Long,
    var name: String
)