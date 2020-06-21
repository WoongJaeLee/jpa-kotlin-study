import com.jpastudy.jpakotlinstudy.entity.Delivery
import com.jpastudy.jpakotlinstudy.entity.Member
import com.jpastudy.jpakotlinstudy.entity.OrderItem
import com.jpastudy.jpakotlinstudy.entity.OrderStatus

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "orders")
class Order(orderDate: LocalDateTime, member: Member, orderStatus: OrderStatus, delivery: Delivery) {

    @Id @GeneratedValue
    @Column(name = "order_id")
    var id: Long? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    var member: Member = member
        set(member) {
            this.member = member
            member.orders.add(this)
        }

    @OneToMany(mappedBy = "order", cascade = [CascadeType.ALL])
    var orderItems: MutableList<OrderItem> = ArrayList()

    @OneToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "delivery_id")
    var delivery: Delivery = delivery
        set(delivery) {
            this.delivery = delivery
            delivery.order = this
        }

    @Enumerated(EnumType.STRING)
    var orderStatus: OrderStatus = orderStatus

    var orderDate: LocalDateTime = orderDate

    fun addOrderItems(orderItem: OrderItem) {
        orderItems.add(orderItem)
        orderItem.order = this
    }
}
