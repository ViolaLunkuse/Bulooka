

package com.connect.socialcomponents.main.editProfile;

import com.connect.socialcomponents.main.pickImageBase.PickImageView;



public interface EditProfileView extends PickImageView {
    void setName(String username);

    void setProfilePhoto(String photoUrl);

    String getNameText();

    void setNameError(String string);
}
