package com.connect.socialcomponents.adapters.holders;

import android.view.View;

import com.connect.socialcomponents.main.base.BaseActivity;
import com.connect.socialcomponents.managers.listeners.OnPostChangedListener;
import com.connect.socialcomponents.model.FollowingPost;
import com.connect.socialcomponents.model.Post;
import com.connect.socialcomponents.utils.LogUtil;


public class FollowPostViewHolder extends PostViewHolder {


    public FollowPostViewHolder(View view, OnClickListener onClickListener, BaseActivity activity) {
        super(view, onClickListener, activity);
    }

    public FollowPostViewHolder(View view, OnClickListener onClickListener, BaseActivity activity, boolean isAuthorNeeded) {
        super(view, onClickListener, activity, isAuthorNeeded);
    }

    public void bindData(FollowingPost followingPost) {
        postManager.getSinglePostValue(followingPost.getPostId(), new OnPostChangedListener() {
            @Override
            public void onObjectChanged(Post obj) {
                bindData(obj);
            }

            @Override
            public void onError(String errorText) {
                LogUtil.logError(TAG, "bindData", new RuntimeException(errorText));
            }
        });
    }

}
