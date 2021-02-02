package com.navigation.fragment

import android.os.Bundle
import android.transition.TransitionInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import com.navigation.R
import com.navigation.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_register.view.*

class RegisterFragment : BaseFragment() {
    override fun getLayoutResourceId() = R.layout.fragment_register

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedElementEnterTransition = TransitionInflater.from(requireContext())
                .inflateTransition(R.transition.shared_image)
    }

    override fun initView(rootView: View) {
        super.initView(rootView)
        rootView.toAvatarVerifyBtn.setOnClickListener {
            findNavController().navigate(R.id.to_avatar_verify_fragment)
        }
        arguments?.let {
            val name = it.getString("userName")
            rootView.regUserNameEt.setText(name)
        }
    }
}