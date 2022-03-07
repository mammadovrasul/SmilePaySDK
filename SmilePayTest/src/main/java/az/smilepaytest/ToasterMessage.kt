package az.smilepaytest

import android.content.Context
import android.widget.Toast


class ToasterMessage {
    fun showMessage(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}