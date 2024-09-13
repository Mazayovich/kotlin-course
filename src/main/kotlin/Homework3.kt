package org.example

import java.time.LocalDate
import java.time.LocalDateTime

val name: String = "Hackathon Survival"
val eventDate: LocalDateTime
var location: String = "Handsome computer club"
class EventBudget {

    var venueCost: Double = 10000.0
        set(value) {
            require(value >= 0) { "Стоимость аренды не может быть отрицательной." }
            field = value
        }

    var equipmentCost: Double = 7000.0
        set(value) {
            require(value >= 0) { "Стоимость оборудования не может быть отрицательной." }
            field = value
        }

    var cateringCost: Double = 4000.0
        set(value) {
            require(value >= 0) { "Стоимость кейтеринга не может быть отрицательной." }
            field = value
        }

    var personnelCost: Double = 5000.0
        set(value) {
            require(value >= 0) { "Стоимость оплаты труда не может быть отрицательной." }
            field = value
        }

    var marketingCost: Double = 2500.0
        set(value) {
            require(value >= 0) { "Стоимость маркетинга не может быть отрицательной." }
            field = value
        }

    var prizeCost: Double = 3000.0
        set(value) {
            require(value >= 0) { "Стоимость призов не может быть отрицательной." }
            field = value
        }

    var reserveFund: Double = 1500.0
        set(value) {
            require(value >= 0) { "Резервный фонд не может быть отрицательным." }
            field = value
        }

    fun calculateTotalCost(): Double {
        return venueCost + equipmentCost + cateringCost + personnelCost + marketingCost + prizeCost + reserveFund
    }

    fun printBudgetDetails() {
        println("Бюджет мероприятия:")
        println("Аренда помещения: $$venueCost")
        println("Оборудование: $$equipmentCost")
        println("Кейтеринг: $$cateringCost")
        println("Оплата персонала: $$personnelCost")
        println("Маркетинг: $$marketingCost")
        println("Призы: $$prizeCost")
        println("Резервный фонд: $$reserveFund")
        println("Общий бюджет: $${calculateTotalCost()}")
    }
}

fun main() {
    val eventBudget = EventBudget()
    eventBudget.printBudgetDetails()
}
var participantsCount: Int = 50
val duration: Int = 3
private var contactInfo: String = "?"
var status: String = "подготовка"
var sponsors: List<String>:
const val maxCapacity: Int = 500
var participationRules: String = "Базовые навыки, подтвержденное участие в конкурсах"
var statusUpdateInterval: Duration: 15
var vipAccessList: List<String>
var publicFeedback: List<String>
var internetUsage: Double
var notificationSystem: NotificationService
var venueSetupPlan: String
var eventCoordinator: Person
var eventMap: String
var statusHistory: List<String>
var merchandiseAvailable: Boolean

