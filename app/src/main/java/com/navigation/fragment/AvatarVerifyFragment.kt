package com.navigation.fragment

import android.view.View
import androidx.navigation.fragment.findNavController
import com.navigation.R
import com.navigation.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_avatar_verify.view.*

class AvatarVerifyFragment : BaseFragment() {
    override fun getLayoutResourceId() = R.layout.fragment_avatar_verify

    override fun initView(rootView: View) {
        super.initView(rootView)
        rootView.avatarVerifyBtn.setOnClickListener {
            findNavController().navigate(R.id.to_login_fragment)
        }
    }
}