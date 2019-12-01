package dev.nathanmkaya.showcasejava.di;

import androidx.lifecycle.ViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dev.nathanmkaya.showcasejava.ui.ui.dashboard.DashboardViewModel;
import dev.nathanmkaya.showcasejava.ui.ui.home.HomeViewModel;
import dev.nathanmkaya.showcasejava.ui.ui.notifications.NotificationsViewModel;

@Module
public abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(DashboardViewModel.class)
    abstract ViewModel bindDashboardViewModel(DashboardViewModel dashboardViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(NotificationsViewModel.class)
    abstract ViewModel bindNotificationViewModel(NotificationsViewModel notificationsViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel.class)
    abstract ViewModel bindHomeViewModel(HomeViewModel homeViewModel);
}
