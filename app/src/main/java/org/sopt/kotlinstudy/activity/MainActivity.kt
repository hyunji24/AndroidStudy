package org.sopt.kotlinstudy.activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import org.sopt.kotlinstudy.R
import org.sopt.kotlinstudy.databinding.ActivityMainBinding
import org.sopt.kotlinstudy.fragment.FragmentOne
import org.sopt.kotlinstudy.fragment.FragmentThree
import org.sopt.kotlinstudy.fragment.FragmentTwo
import org.sopt.kotlinstudy.util.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>({ ActivityMainBinding.inflate(it)}) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initBottomNavigation()
    }

    private fun initBottomNavigation(){
        binding.bnvMain.setOnItemSelectedListener { item ->
            changeFragment(
                when (item.itemId) {
                    R.id.menu_calculator -> FragmentOne()
                    R.id.menu_two -> FragmentTwo()
                    else -> FragmentThree()
                } as Fragment
            )
            true
        }
        binding.bnvMain.selectedItemId= R.id.menu_calculator
    }

    private fun changeFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container_main,fragment)
            .commit()
    }

}