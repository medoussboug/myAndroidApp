package com.example.trendingrespositoriesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.trendingrespositoriesapp.databinding.MostStaredRepositoryItemBinding

class MostStaredRepositoryFragment : Fragment() {
    private var _mostStaredRepositoryFragmentBinding: MostStaredRepositoryItemBinding? = null
    val mostStaredRepositoryFragmentBinding get() = _mostStaredRepositoryFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.most_stared_repository_Item, container, false)
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {

    }
}