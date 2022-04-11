fun main() {
    val amount = 20000
    val itemPrice = 10000
    val meloman:Boolean=true
    val discountstandart=itemPrice-100
    val discount=itemPrice-((itemPrice/100)*5)
    if(amount<1000 && meloman==true) {
        println("Цена товара с учетом скидки: ${itemPrice-((itemPrice/100)*1)}")
    } else if (amount in 1001..10000 && meloman==true)
        println("Цена товара с учетом скидки: ${discountstandart-((itemPrice/100)*1)}")
    else if(amount>10001 && meloman==true) {
        println("Цена товара с учетом скидки: ${discount-((itemPrice/100)*1)}")
    } else if(amount<1000 && meloman==false) {
        println("Цена товара: ${itemPrice}")
    } else if (amount in 1001..10000&&meloman==false) {
        println("Цена товара с учетом скидки: ${discountstandart}")
    } else if(amount>10001 && meloman==false) {
        println("Цена товара с учетом скидки: ${discount}")
    }

}