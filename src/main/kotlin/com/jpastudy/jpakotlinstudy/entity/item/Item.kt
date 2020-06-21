package com.jpastudy.jpakotlinstudy.entity.item

import com.jpastudy.jpakotlinstudy.entity.Category
import javax.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
open class Item(@Id @GeneratedValue
                @Column(name = "item_id")
                open var id: Long,
                open var price: Int = 0,
                open var name: String = "",
                open var stockQuantity: Int = 0,
                @ManyToMany(mappedBy = "items") open var categories: List<Category> = arrayListOf())