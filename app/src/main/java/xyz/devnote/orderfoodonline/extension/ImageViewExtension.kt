package xyz.devnote.orderfoodonline.extension

import android.support.v7.widget.AppCompatImageView
import com.bumptech.glide.Glide

fun AppCompatImageView.load(url : String) {
    Glide.with(this)
            .load(url)
            .into(this)
}