package com.framgia.awesomecity.utils.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.framgia.awesomecity.R;

/**
 * Created by tmd on 18/07/2017.
 */

public class StatusButton extends LinearLayout implements View.OnClickListener {

    private Context mContext;
    private View mRootView;
    private Button mBtnGray;

    public StatusButton(Context context) {
        super(context);
        mContext = context;
        initView();
    }

    public StatusButton(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        initView();
    }

    private void initView() {
        mRootView = inflate(mContext, R.layout.status_button, this);
        mRootView.findViewById(R.id.button_red).setOnClickListener(this);
        mRootView.findViewById(R.id.button_green).setOnClickListener(this);
        mBtnGray = mRootView.findViewById(R.id.button_gray);
        mBtnGray.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_red:

                break;
            case R.id.button_green:

                break;
            case R.id.button_gray:

                break;
            default:
                break;
        }
    }
}
