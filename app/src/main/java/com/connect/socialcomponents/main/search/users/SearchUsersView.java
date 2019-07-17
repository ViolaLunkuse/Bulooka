package com.connect.socialcomponents.main.search.users;

import com.connect.socialcomponents.main.base.BaseFragmentView;
import com.connect.socialcomponents.model.Profile;

import java.util.List;


public interface SearchUsersView extends BaseFragmentView {
    void onSearchResultsReady(List<Profile> profiles);

    void showLocalProgress();

    void hideLocalProgress();

    void showEmptyListLayout();

    void updateSelectedItem();
}
