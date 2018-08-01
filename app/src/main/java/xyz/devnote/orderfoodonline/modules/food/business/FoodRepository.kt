package xyz.devnote.orderfoodonline.modules.food.business

interface FoodRepository {
    fun getFoodList(): List<FoodEnity>
}