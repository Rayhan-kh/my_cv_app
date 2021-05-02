package com.foxcoder.cvapplication.view.base_classes

import android.app.Dialog
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.DialogFragment
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog

open class BaseDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState) as BottomSheetDialog

        dialog.setOnShowListener { dialogInterface ->
            val sheetDialog = dialogInterface as? BottomSheetDialog
            val bottomSheet = sheetDialog?.findViewById<FrameLayout>(
                com.google.android.material.R.id.design_bottom_sheet
            )

            bottomSheet?.let {
                val behavior = BottomSheetBehavior.from(it)
                behavior.skipCollapsed = true
                behavior.isFitToContents = true
                behavior.state = BottomSheetBehavior.STATE_EXPANDED

            }
        }
        return dialog
    }

}