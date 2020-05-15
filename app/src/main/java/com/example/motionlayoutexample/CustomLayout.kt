package com.example.motionlayoutexample

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

class CustomLayout @JvmOverloads constructor(
    context: Context,
    attrSet: AttributeSet,
    defStyle: Int = 0
) : FrameLayout(context, attrSet, defStyle) {

    override fun setVisibility(visibility: Int) {
        super.setVisibility(visibility)
        println("CustomLayout.setVisibility=$visibility")
    }

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        println("CustomLayout.setEnabled=$enabled")
    }
}
