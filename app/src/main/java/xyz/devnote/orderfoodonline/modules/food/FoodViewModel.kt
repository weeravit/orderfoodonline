package xyz.devnote.orderfoodonline.modules.food

class FoodViewModel {

    data class Food(
            val id : String = "",
            val name : String = "",
            val imageUrl : String = "",
            val stock : Int = 0
    )
}