
package com.connect.socialcomponents.main.post;

import android.net.Uri;

import com.connect.socialcomponents.main.pickImageBase.PickImageView;



public interface BaseCreatePostView extends PickImageView {
    void setDescriptionError(String error);

    void setTitleError(String error);

    String getTitleText();

    String getDescriptionText();

    void requestImageViewFocus();

    void onPostSavedSuccess();

    Uri getImageUri();
}

