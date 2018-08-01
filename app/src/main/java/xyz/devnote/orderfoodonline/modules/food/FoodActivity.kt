package xyz.devnote.orderfoodonline.modules.food

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import xyz.devnote.orderfoodonline.R

class FoodActivity : AppCompatActivity() {

    private val viewModel by lazy {
        ViewModelProviders.of(this).get(FoodViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listenerViewModel()
    }

    private fun listenerViewModel() {
        viewModel.whenGotFoodList.observe(this, Observer {
            recyclerview.adapter = FoodAdapter(it ?: listOf(), onFoodClickListener)
        })

        viewModel.getData()
    }

    private val onFoodClickListener = { item: FoodViewModel.Food ->

    }
}
