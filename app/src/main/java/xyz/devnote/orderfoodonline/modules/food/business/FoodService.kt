package xyz.devnote.orderfoodonline.modules.food.business

class FoodService(private val repository: FoodRepository) {

    fun getFoodList() = repository.getFoodList()
}