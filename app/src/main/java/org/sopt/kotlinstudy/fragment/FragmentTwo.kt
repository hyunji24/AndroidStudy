package org.sopt.kotlinstudy.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.sopt.kotlinstudy.Datasource
import org.sopt.kotlinstudy.ItemAdapter
import org.sopt.kotlinstudy.databinding.FragmentTwoBinding
import org.sopt.kotlinstudy.util.BaseFragment

class FragmentTwo: BaseFragment<FragmentTwoBinding>() {

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentTwoBinding {
        return FragmentTwoBinding.inflate(inflater,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val myDataset= Datasource().loadAffirmations()
        binding.recyclerView.adapter= ItemAdapter(requireContext(),myDataset)
        binding.recyclerView.setHasFixedSize(true)
    }


}
