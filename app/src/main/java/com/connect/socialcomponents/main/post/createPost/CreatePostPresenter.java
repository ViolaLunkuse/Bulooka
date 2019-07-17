
package com.connect.socialcomponents.main.post.createPost;

import android.content.Context;

import com.google.firebase.auth.FirebaseAuth;
import com.connect.socialcomponents.R;
import com.connect.socialcomponents.main.post.BaseCreatePostPresenter;
import com.connect.socialcomponents.model.Post;


public class CreatePostPresenter extends BaseCreatePostPresenter<CreatePostView> {

    public CreatePostPresenter(Context context) {
        super(context);
    }

    @Override
    protected int getSaveFailMessage() {
        return R.string.error_fail_create_post;
    }

    @Override
    protected void savePost(String title, String description) {
        ifViewAttached(view -> {
            view.showProgress(R.string.message_creating_post);
            Post post = new Post();
            post.setTitle(title);
            post.setDescription(description);
            post.setAuthorId(FirebaseAuth.getInstance().getCurrentUser().getUid());
            postManager.createOrUpdatePostWithImage(view.getImageUri(), this, post);
        });
    }

    @Override
    protected boolean isImageRequired() {
        return true;
    }
}
