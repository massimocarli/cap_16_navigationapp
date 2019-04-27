package uk.co.massimocarli.navigationapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.drawer_activity_main.*


class DrawerMainActivity : AppCompatActivity() {

  private lateinit var appBarConfiguration: AppBarConfiguration
  private lateinit var navController: NavController

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.drawer_activity_main)
    navController = findNavController(R.id.navHostFragment)
    appBarConfiguration = AppBarConfiguration(
      navController.graph,
      drawerLayout
    )
    navigationView.setupWithNavController(navController)
  }
}
