package xyz.devnote.orderfoodonline.modules.food.business


class FoodLocalStorageRepository : FoodRepository {

    override fun getFoodList(): List<FoodEnity> {
        return listOf(
                FoodEnity("1", "KFC", "https://steemitimages.com/DQmT4kwXu8YkQx3PgzhGMn5cpZM4bF1LW8CAbUwE26QWoBj/this-is-what-kfc-is-famous.jpg", 5),
                FoodEnity("1", "french-fries", "https://4.imimg.com/data4/OM/TL/MY-10347843/french-fries-250x250.jpg", 5),
                FoodEnity("1", "KFC", "https://4.imimg.com/data4/OM/TL/MY-10347843/french-fries-250x250.jpg", 5),
                FoodEnity("1", "KFC", "https://4.imimg.com/data4/OM/TL/MY-10347843/french-fries-250x250.jpg", 5),
                FoodEnity("1", "KFC", "https://4.imimg.com/data4/OM/TL/MY-10347843/french-fries-250x250.jpg", 5),
                FoodEnity("1", "KFC", "https://4.imimg.com/data4/OM/TL/MY-10347843/french-fries-250x250.jpg", 5),
                FoodEnity("1", "KFC", "https://4.imimg.com/data4/OM/TL/MY-10347843/french-fries-250x250.jpg", 5),
                FoodEnity("1", "KFC", "https://4.imimg.com/data4/OM/TL/MY-10347843/french-fries-250x250.jpg", 5),
                FoodEnity("1", "KFC", "https://4.imimg.com/data4/OM/TL/MY-10347843/french-fries-250x250.jpg", 5),
                FoodEnity("1", "KFC", "https://4.imimg.com/data4/OM/TL/MY-10347843/french-fries-250x250.jpg", 5),
                FoodEnity("1", "KFC", "https://4.imimg.com/data4/OM/TL/MY-10347843/french-fries-250x250.jpg", 5),
                FoodEnity("1", "KFC", "https://4.imimg.com/data4/OM/TL/MY-10347843/french-fries-250x250.jpg", 5)
        )
    }
}