package xyz.devnote.orderfoodonline.modules.food

import android.os.Bundle
import android.support.design.widget.BottomSheetDialogFragment
import android.support.v4.app.FragmentManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import xyz.devnote.orderfoodonline.R

class SelectFoodDialog : BottomSheetDialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.dialog_select_product, container, false)
    }

    companion object {
        fun show(fragmentManager: FragmentManager) {
            SelectFoodDialog().show(fragmentManager, this::class.java.simpleName)
        }
    }
}