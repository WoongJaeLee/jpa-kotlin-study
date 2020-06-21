package com.jpastudy.jpakotlinstudy.entity.item

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity

@Entity
@DiscriminatorValue("A")
class Album(override var id: Long,
            var artist: String,
            var etc: String) : Item(id)