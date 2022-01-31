package org.sopt.kotlinstudy.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.sopt.kotlinstudy.databinding.FragmentOneBinding
import org.sopt.kotlinstudy.util.BaseFragment

class FragmentOne : BaseFragment<FragmentOneBinding>() {

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentOneBinding {
        return FragmentOneBinding.inflate(inflater,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }


}