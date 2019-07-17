
package com.connect.socialcomponents.main.main;

import android.view.View;

import com.connect.socialcomponents.main.base.BaseView;
import com.connect.socialcomponents.model.Post;



public interface MainView extends BaseView {
    void openCreatePostActivity();
    void hideCounterView();
    void openPostDetailsActivity(Post post, View v);
    void showFloatButtonRelatedSnackBar(int messageId);
    void openProfileActivity(String userId, View view);
    void refreshPostList();
    void removePost();
    void updatePost();
    void showCounterView(int count);
}
