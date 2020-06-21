package com.jpastudy.jpakotlinstudy.entity.item

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity

@Entity
@DiscriminatorValue("B")
class Book(override var id: Long,
           var author: String,
           var isbn: String) : Item(id)