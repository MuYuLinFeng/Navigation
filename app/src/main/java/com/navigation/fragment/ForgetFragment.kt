package com.navigation.fragment

import android.view.View
import androidx.navigation.fragment.findNavController
import com.navigation.R
import com.navigation.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_forget.view.*

class ForgetFragment :BaseFragment(){
    override fun getLayoutResourceId() = R.layout.fragment_forget

    override fun initView(rootView: View) {
            rootView.btnBackView.setOnClickListener {
                //这两个都可以返回不过有区别 注意看文档
                findNavController().navigateUp()
                //findNavController().popBackStack()
            }
    }
}