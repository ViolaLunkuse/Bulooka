
package com.connect.socialcomponents.main.search.posts;

import com.connect.socialcomponents.main.base.BaseFragmentView;
import com.connect.socialcomponents.model.Post;

import java.util.List;


public interface SearchPostsView extends BaseFragmentView {
    void onSearchResultsReady(List<Post> posts);
    void showLocalProgress();
    void hideLocalProgress();
    void showEmptyListLayout();
}
