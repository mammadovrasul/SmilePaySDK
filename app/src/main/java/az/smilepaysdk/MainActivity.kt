package az.smilepaysdk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        if (SmilePay.token("Rasul9922")){
//            startActivity(Intent(this@MainActivity, eActivity2::class.java))
//        }


    }

    object SmilePay {
        fun token( token: String?):Boolean {
            var secretKey = "Rasul9922"
            return token.equals(secretKey)
        }
    }
}