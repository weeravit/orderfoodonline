package xyz.devnote.orderfoodonline.modules.food

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import xyz.devnote.orderfoodonline.modules.food.business.FoodMockRepository
import xyz.devnote.orderfoodonline.modules.food.business.FoodService

class FoodViewModel : ViewModel() {

    val whenGotFoodList = MutableLiveData<List<Food>>()

    private val foodService = FoodService(FoodMockRepository())

    fun getData() {
        val foodList = foodService.getFoodList().map {
            Food(it.id, it.name, it.imageUrl, it.stock)
        }

        whenGotFoodList.postValue(foodList)
    }

    data class Food(
            val id : String = "",
            val name : String = "",
            val imageUrl : String = "",
            val stock : Int = 0
    )
}