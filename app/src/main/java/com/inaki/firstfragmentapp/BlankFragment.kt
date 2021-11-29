package com.inaki.firstfragmentapp

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)

        // logging the lifecycle onAttach
        Log.d(TAG, "Fragment onAttach called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

        // logging the lifecycle onCreate
        Log.d(TAG, "Fragment onCreate called")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        // logging the lifecycle onSaveInstance
        Log.d(TAG, "Fragment onSaveInstance called")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // logging the lifecycle onCreateView
        Log.d(TAG, "Fragment onCreateView called")
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // logging the lifecycle onActivityCreated
        Log.d(TAG, "Fragment onActivityCreated called")
    }

    override fun onStart() {
        super.onStart()
        // logging the lifecycle onCreate
        Log.d(TAG, "Fragment onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Fragment onResume called")

//        activity?.supportFragmentManager
//            ?.beginTransaction()
//            ?.add()
//            .commit()
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Fragment onStop called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "Fragment onDestroyView called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Fragment onDestroy called")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "Fragment onDetach called")
    }

    companion object {
        // here we are creating our TAG to used in logcat
        private const val TAG = "BlankFragment"
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
            BlankFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}

