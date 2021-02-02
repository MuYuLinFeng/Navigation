package com.navigation.taoobao

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.navigation.R
import kotlinx.android.synthetic.main.activity_taobao.*

class TaobaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_taobao)
        initView()
    }

    private fun initView() {
        //方法一
        val navHostFragment: NavHostFragment =
                supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        NavigationUI.setupWithNavController(bottom_nav, navHostFragment.navController)

        //方法二
        //NavigationUI.setupWithNavController(bottom_nav, findNavController(R.id.fragmentContainerView))
    }
}