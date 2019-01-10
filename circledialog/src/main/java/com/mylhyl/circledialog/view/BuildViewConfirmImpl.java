package com.mylhyl.circledialog.view;

import android.content.Context;

import com.mylhyl.circledialog.CircleParams;

/**
 * Created by hupei on 2018/8/14.
 */

public final class BuildViewConfirmImpl extends BuildViewAbs {
    private BodyTextView mBodyTextView;

    public BuildViewConfirmImpl(Context context, CircleParams params) {
        super(context, params);
    }

    @Override
    public BodyTextView getBodyView() {
        return mBodyTextView;
    }

    @Override
    public void buildBodyView() {
        buildRootView();
        buildTitleView(mRootCardViewByLinearLayout);
        if (mBodyTextView == null) {
            mBodyTextView = new BodyTextView(mContext, mParams.dialogParams, mParams.textParams
                    , mParams.createTextListener);
            mRootCardViewByLinearLayout.addView(mBodyTextView);
        }
    }

    @Override
    public void refreshContent() {
        if (mBodyTextView != null) {
            mBodyTextView.refreshText();
        }
    }
}
