package xyz.devnote.orderfoodonline.modules.food

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class FoodViewModel : ViewModel() {

    val whenGotFoodList = MutableLiveData<List<Food>>()

    fun getData() {
        val foodList = listOf(
                Food("1", "KFC", "https://steemitimages.com/DQmT4kwXu8YkQx3PgzhGMn5cpZM4bF1LW8CAbUwE26QWoBj/this-is-what-kfc-is-famous.jpg", 5),
                Food("1", "french-fries", "https://4.imimg.com/data4/OM/TL/MY-10347843/french-fries-250x250.jpg", 5),
                Food("1", "KFC", "https://4.imimg.com/data4/OM/TL/MY-10347843/french-fries-250x250.jpg", 5),
                Food("1", "KFC", "https://4.imimg.com/data4/OM/TL/MY-10347843/french-fries-250x250.jpg", 5),
                Food("1", "KFC", "https://4.imimg.com/data4/OM/TL/MY-10347843/french-fries-250x250.jpg", 5),
                Food("1", "KFC", "https://4.imimg.com/data4/OM/TL/MY-10347843/french-fries-250x250.jpg", 5),
                Food("1", "KFC", "https://4.imimg.com/data4/OM/TL/MY-10347843/french-fries-250x250.jpg", 5),
                Food("1", "KFC", "https://4.imimg.com/data4/OM/TL/MY-10347843/french-fries-250x250.jpg", 5),
                Food("1", "KFC", "https://4.imimg.com/data4/OM/TL/MY-10347843/french-fries-250x250.jpg", 5),
                Food("1", "KFC", "https://4.imimg.com/data4/OM/TL/MY-10347843/french-fries-250x250.jpg", 5),
                Food("1", "KFC", "https://4.imimg.com/data4/OM/TL/MY-10347843/french-fries-250x250.jpg", 5),
                Food("1", "KFC", "https://4.imimg.com/data4/OM/TL/MY-10347843/french-fries-250x250.jpg", 5)
        )

        whenGotFoodList.postValue(foodList)
    }

    data class Food(
            val id : String = "",
            val name : String = "",
            val imageUrl : String = "",
            val stock : Int = 0
    )
}