package com.jpastudy.jpakotlinstudy.entity.item

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity

@Entity
@DiscriminatorValue("M")
class Movie(override var id: Long,
            var director: String,
            var actor: String) : Item(id)