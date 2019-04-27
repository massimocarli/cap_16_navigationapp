package uk.co.massimocarli.navigationapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.bottom_activity_main.*


class BottomMainActivity : AppCompatActivity() {

  private lateinit var navController: NavController

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.bottom_activity_main)
    navController = findNavController(R.id.navHostFragment)
    bottomNavigationView.setupWithNavController(navController)
  }
}
