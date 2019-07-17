

package com.connect.socialcomponents.managers.listeners;

import com.connect.socialcomponents.model.PostListResult;

public interface OnPostListChangedListener<Post> {

    public void onListChanged(PostListResult result);

    void onCanceled(String message);
}
