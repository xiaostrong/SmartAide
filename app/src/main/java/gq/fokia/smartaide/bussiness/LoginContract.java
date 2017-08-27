package gq.fokia.smartaide.bussiness;

import gq.fokia.smartaide.BasePresenter;
import gq.fokia.smartaide.BaseView;

/**
 * Created by archie on 8/27/17.
 */

public interface LoginContract {

    interface Presenter extends BasePresenter{
        void login();
        void reset();
    }

    interface View extends BaseView<Presenter>{
        String getUserEmail();
        String getPassword();

        boolean isEmailValid(String email);
        boolean isPasswordValid(String password);

        boolean setEmailError(String error);
        boolean setPasswordError(String error);

        void showLoginProgress(boolean show);
        void resetEditView();
        void toMainAct();
        void showFailedError();
    }
}
