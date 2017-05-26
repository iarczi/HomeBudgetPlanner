package xyz.thecodeside.homebudgetplanner.paymentlist

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.view.MenuItem
import android.widget.Toast
import com.hannesdorfmann.mosby3.mvp.MvpActivity
import kotlinx.android.synthetic.main.activity_payments_list.*
import kotlinx.android.synthetic.main.app_bar_payments_list.*
import xyz.thecodeside.homebudgetplanner.R

class PaymentsListActivity :
        MvpActivity<PaymentsListView, PaymentsListPresenter>(),
        PaymentsListView,
        NavigationView.OnNavigationItemSelectedListener {

    override fun createPresenter(): PaymentsListPresenter = PaymentsListPresenter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payments_list)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { Toast.makeText(applicationContext, "Click", Toast.LENGTH_SHORT).show() }

        //loadingView.setOnClickListener { Toast.makeText(applicationContext,"Click", Toast.LENGTH_SHORT).show() }
        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        val id = item.itemId

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }


        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}

