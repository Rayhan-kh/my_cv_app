package com.foxcoder.cvapplication.utils

import android.app.Activity
import android.content.Context
import android.view.View
import com.foxcoder.cvapplication.R
import com.google.android.material.snackbar.Snackbar

class SnackBarHandler {
        fun showSnackbar(message: String, mContext: Context) {
            val rootView =
                (mContext as Activity).window.decorView.findViewById<View>(android.R.id.content)
            val snackbar = Snackbar.make(rootView, message, Snackbar.LENGTH_LONG)
            snackbar.show()
        }

        fun showSnackbar(message: String, mView: View) {
            val snackbar = Snackbar.make(mView, message, Snackbar.LENGTH_LONG)
            snackbar.show()
        }

        fun showInternetIssue(mContext: Context) {
            val rootView =
                (mContext as Activity).window.decorView.findViewById<View>(android.R.id.content)
            val snackbar = Snackbar.make(
                rootView,
                mContext.getString(R.string.internet_error),
                Snackbar.LENGTH_LONG
            )
            snackbar.view.setBackgroundColor(mContext.resources.getColor(R.color.colorRed))
            snackbar.show()
        }

        fun showInternetIssue(mView: View) {
            val snackbar = Snackbar.make(
                mView,
                mView.context.getString(R.string.internet_error),
                Snackbar.LENGTH_LONG
            )
            snackbar.view.setBackgroundColor(mView.context.resources.getColor(R.color.colorRed))
            snackbar.show()
        }

        fun showErrorMsg(errMsg: String, mContext: Context) {
            val rootView =
                (mContext as Activity).window.decorView.findViewById<View>(android.R.id.content)
            val snackbar = Snackbar.make(
                rootView,
                errMsg,
                Snackbar.LENGTH_LONG
            )
            snackbar.view.setBackgroundColor(mContext.resources.getColor(R.color.colorRed))
            snackbar.show()
        }

        fun showErrorMsg(errMsg: String, view: View) {
            val snackbar = Snackbar.make(
                view,
                errMsg,
                Snackbar.LENGTH_LONG
            )
            snackbar.view.setBackgroundColor(view.context.resources.getColor(R.color.colorRed))
            snackbar.show()
        }


        fun showSuccessMsg(successMsg: String, mContext: Context) {
            val rootView =
                (mContext as Activity).window.decorView.findViewById<View>(android.R.id.content)
            val snackbar = Snackbar.make(
                rootView,
                successMsg,
                Snackbar.LENGTH_LONG
            )
            snackbar.view.setBackgroundColor(mContext.resources.getColor(R.color.colorGreen))
            snackbar.show()
        }

        fun showSuccessMsg(successMsg: String, mView: View) {

            val snackbar = Snackbar.make(
                mView,
                successMsg,
                Snackbar.LENGTH_LONG
            )
            snackbar.view.setBackgroundColor(mView.context.resources.getColor(R.color.colorGreen))
            snackbar.show()
        }

        fun showNutralMsg(msg: String, mContext: Context) {
            val rootView =
                (mContext as Activity).window.decorView.findViewById<View>(android.R.id.content)
            val snackbar = Snackbar.make(
                rootView,
                msg,
                Snackbar.LENGTH_LONG
            )
            snackbar.show()
        }

        fun showSuccess(mContext: Context) {
            val rootView =
                (mContext as Activity).window.decorView.findViewById<View>(android.R.id.content)
            val snackbar = Snackbar.make(
                rootView,
                mContext.getString(R.string.success),
                Snackbar.LENGTH_LONG
            )
            snackbar.view.setBackgroundColor(mContext.resources.getColor(R.color.colorGreen))
            snackbar.show()
        }

        fun showSuccess(mView: View) {

            val snackbar = Snackbar.make(
                mView,
                mView.context.getString(R.string.success),
                Snackbar.LENGTH_LONG
            )
            snackbar.view.setBackgroundColor(mView.context.resources.getColor(R.color.colorGreen))
            snackbar.show()
        }
}