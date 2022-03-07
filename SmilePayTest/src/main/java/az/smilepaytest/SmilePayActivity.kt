package az.smilepaytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import az.smilepaytest.databinding.ActivitySmilePayBinding

class SmilePayActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySmilePayBinding
    lateinit var navController: NavController
    private lateinit var controller: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_smile_pay)
        setUpNavView()

        if (SmilePay.token("")) {

        }
    }

    object SmilePay {
        fun token(token: String?): Boolean {
            var secretKey = "Rasul9922"
            return token.equals(secretKey)
        }
    }

    private fun setUpNavView() {
        navController = findNavController(R.id.nav_host_fragment_activity_main)
        controller = findNavController(R.id.nav_host_fragment_activity_main)

    }
}
