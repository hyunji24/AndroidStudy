package org.sopt.kotlinstudy.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.sopt.kotlinstudy.databinding.FragmentThreeBinding
import org.sopt.kotlinstudy.util.BaseFragment

class FragmentThree : BaseFragment<FragmentThreeBinding>() {

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentThreeBinding {
        return FragmentThreeBinding.inflate(inflater,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


    }


}