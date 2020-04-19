package com.magicgoop.tagpshere.example

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.GestureDetector
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager.adapter = ExampleFragmentPagerAdapter(supportFragmentManager)
        tlTabs.setupWithViewPager(viewpager)

        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (item.itemId == R.id.menuAbout) {
            openGithub()
            true
        } else super.onOptionsItemSelected(item)
    }

    private fun openGithub() {
        val intent =
            Intent(Intent.ACTION_VIEW, Uri.parse("https://www.github.com/magic-goop/tag-sphere"))
        packageManager?.let {
            intent.resolveActivity(it)?.let {
                startActivity(intent)
            }
        }
    }
}