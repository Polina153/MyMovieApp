package ru.geekbrains.mymovieapp.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import ru.geekbrains.mymovieapp.databinding.MainFragmentBinding
import ru.geekbrains.mymovieapp.viewmodel.MainViewModel

class MainFragment : Fragment() {

    private lateinit var viewModel: MainViewModel
    private var _binding: MainFragmentBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = MainFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        //viewModel.getLiveData().observe(viewLifecycleOwner, Observer { renderData(it) })
        //viewModel.getListFromLocalStorage()
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance() = MainFragment()
    }
}