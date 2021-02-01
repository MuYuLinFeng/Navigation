package com.navigation.fragment

import android.view.View
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.navigation.R
import com.navigation.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_login.view.*

class LoginFragment : BaseFragment() {
    override fun getLayoutResourceId() = R.layout.fragment_login

    override fun initView(rootView: View) {
        super.initView(rootView)
        rootView.toRegisterPage.setOnClickListener {
            val extra = FragmentNavigatorExtras(userAvatarIV to "userAvatarTn")
            findNavController().navigate(
                R.id.to_register_fragment,
                null,
                null,
                extra
            )
        }
        rootView.toForgetPage.setOnClickListener {
            findNavController().navigate(R.id.to_forget_fragment)
        }
        rootView.toAgreementPage.setOnClickListener {
            findNavController().navigate(R.id.to_agreement_activity)
        }
    }
}