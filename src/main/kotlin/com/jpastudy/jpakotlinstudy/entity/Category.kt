package com.jpastudy.jpakotlinstudy.entity

import com.jpastudy.jpakotlinstudy.entity.item.Item
import javax.persistence.*

@Entity
class Category {
    @Id
    @GeneratedValue
    @Column(name = "category_id")
    var id: Long? = null

    var name: String = ""

    @ManyToMany
    @JoinTable(name = "category_item",
            joinColumns = [JoinColumn(name = "category_id")],
            inverseJoinColumns = [JoinColumn(name = "item_id")])
    var items: MutableList<Item> = ArrayList()

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    var parent: Category? = null

    @OneToMany(mappedBy = "parent")
    var child: MutableList<Category> = ArrayList()

    fun addChildCategory(child: Category) {
        this.child.add(child)
        child.parent = this
    }
}
