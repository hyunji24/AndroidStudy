package org.sopt.kotlinstudy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.sopt.kotlinstudy.databinding.FragmentOneBinding
import org.sopt.kotlinstudy.databinding.FragmentTwoBinding

class FragmentTwo: BaseFragment<FragmentTwoBinding>() {

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentTwoBinding {
        return FragmentTwoBinding.inflate(inflater,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }


}
