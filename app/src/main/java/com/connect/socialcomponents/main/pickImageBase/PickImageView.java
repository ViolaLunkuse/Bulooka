

package com.connect.socialcomponents.main.pickImageBase;

import android.net.Uri;

import com.connect.socialcomponents.main.base.BaseView;


public interface PickImageView extends BaseView {
    void hideLocalProgress();

    void loadImageToImageView(Uri imageUri);
}
