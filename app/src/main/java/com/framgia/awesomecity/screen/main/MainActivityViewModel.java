package com.framgia.awesomecity.screen.main;

/**
 * Exposes the data to be used in the MainActivity screen.
 */

public class MainActivityViewModel implements MainActivityContract.ViewModel {

    private MainActivityContract.Presenter mPresenter;

    public MainActivityViewModel() {
    }

    @Override
    public void onStart() {
        mPresenter.onStart();
    }

    @Override
    public void onStop() {
        mPresenter.onStop();
    }

    @Override
    public void setPresenter(MainActivityContract.Presenter presenter) {
        mPresenter = presenter;
    }
}
