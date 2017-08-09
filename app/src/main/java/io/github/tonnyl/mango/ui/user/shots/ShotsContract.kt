package io.github.tonnyl.mango.ui.user.shots

import io.github.tonnyl.mango.data.Shot
import io.github.tonnyl.mango.mvp.BasePresenter
import io.github.tonnyl.mango.mvp.BaseView

/**
 * Created by lizhaotailang on 2017/7/19.
 *
 * This specifies the contract between the view and the presenter.
 */

interface ShotsContract {

    interface View : BaseView<Presenter> {

        fun setLoadingIndicator(loading: Boolean)

        fun showShots(shots: MutableList<Shot>)

    }

    interface Presenter : BasePresenter

}