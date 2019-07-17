
package com.connect.socialcomponents.managers.listeners;

import com.connect.socialcomponents.model.Post;

public interface OnPostChangedListener {
    public void onObjectChanged(Post obj);

    public void onError(String errorText);
}
