package com.example.weathersaina

import android.app.AlertDialog
import android.content.Context
import android.widget.EditText

class DialogManager {


    interface Listener{
        fun OnClick(name: String?)
    }

    companion object {
        fun locationSettingsDialog(requireContext: Context, listener: DialogManager.Listener) {
            val builder = AlertDialog.Builder(requireContext)
            val dialog = builder.create()
            dialog.setTitle("Enable location")
            dialog.setMessage("location Disabled, do you want enable locaton?")
            dialog.setButton(AlertDialog.BUTTON_POSITIVE, "ok"){_,_ ->
                listener.OnClick(null)
                dialog.dismiss()
            }
            dialog.setButton(AlertDialog.BUTTON_NEGATIVE, "CANCEL"){_,_ ->
                dialog.dismiss()
            }
            dialog.show()
        }

        fun searchByNameDialog(context: Context, listener: Listener) {
            val builder = AlertDialog.Builder(context)
            val edName = EditText(context)
            builder.setView(edName)
            val dialog = builder.create()
            dialog.setTitle("City name:")
            dialog.setButton(AlertDialog.BUTTON_POSITIVE, "ok"){_,_ ->
                listener.OnClick(edName.text.toString())
                dialog.dismiss()
            }
            dialog.setButton(AlertDialog.BUTTON_NEGATIVE, "CANCEL"){_,_ ->
                dialog.dismiss()
            }
            dialog.show()
        }
    }
}