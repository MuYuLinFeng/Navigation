package com.navigation.fragment

import android.os.Bundle
import android.view.View
import androidx.core.app.ActivityOptionsCompat
import androidx.navigation.ActivityNavigator
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
            val imagePair = Pair<View, String>(userAvatarIV, "userAvatarTn")
            val textPair = Pair<View, String>(userNameEt, "userNameTn")
            val extra = FragmentNavigatorExtras(imagePair, textPair)
            val args = Bundle()
            args.putString("userName", userNameEt.text.toString())
            findNavController().navigate(
                    R.id.to_register_fragment,
                    args,
                    null,
                    extra
            )
        }
        rootView.toForgetPage.setOnClickListener {
            findNavController().navigate(R.id.to_forget_fragment)
        }
        rootView.toAgreementPage.setOnClickListener {
            val imagePair = androidx.core.util.Pair<View, String>(userAvatarIV, "userAvatarTn")
            val textPair = androidx.core.util.Pair<View, String>(userNameEt, "userNameTn")
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                    requireActivity(),
                    imagePair,
                    textPair)

            val args = Bundle()
            args.putString("userName", userNameEt.text.toString())
            findNavController().navigate(
                    R.id.to_agreement_activity,
                    args,
                    null,
                    ActivityNavigator.Extras.Builder().setActivityOptions(options).build())
        }

        rootView.toTaoBaoPage.toTaoBaoPage.setOnClickListener {
            findNavController().navigate(R.id.to_activity_taobao)
        }
    }
}