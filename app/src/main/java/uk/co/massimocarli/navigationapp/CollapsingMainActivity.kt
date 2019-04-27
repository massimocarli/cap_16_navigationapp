package uk.co.massimocarli.navigationapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.collapsing_activity_main.*


class CollapsingMainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.collapsing_activity_main)
    setSupportActionBar(toolbar)
    val navController = findNavController(R.id.navHostFragmentBar)
    val appBarConfiguration = AppBarConfiguration(navController.graph)
    collapsingToolbarLayout.setupWithNavController(
      toolbar,
      navController,
      appBarConfiguration
    )
  }

  override fun onCreateOptionsMenu(menu: Menu?): Boolean {
    val inflater: MenuInflater = menuInflater
    inflater.inflate(R.menu.navigation_menu, menu)
    return true
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    val navController = findNavController(R.id.navHostFragmentBar)
    return item.onNavDestinationSelected(navController) || super.onOptionsItemSelected(item)
  }
}
