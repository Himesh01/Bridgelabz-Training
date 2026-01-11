package com.browserBuddy;


import java.util.Stack;

public class Browser {
    private Tab activeTab;
    private Stack<Tab> closedTabs;

    public Browser() {
        closedTabs = new Stack<>();
    }
    
    public void openTab(String homepage) {
        activeTab = new Tab(homepage);
        System.out.println("Opened tab with homepage: " + homepage);
    }

    public void visitPage(String url) {
        if (activeTab != null) {
            activeTab.visit(url);
            System.out.println("Visited: " + url);
        }
    }

    public void back() {
        if (activeTab != null) {
            activeTab.back();
            System.out.println("Current page: " + activeTab.getCurrentPage());
        }
    }

    public void forward() {
        if (activeTab != null) {
            activeTab.forward();
            System.out.println("Current page: " + activeTab.getCurrentPage());
        }
    }

    public void closeTab() {
        if (activeTab != null) {
            closedTabs.push(activeTab);
            activeTab = null;
            System.out.println("Tab closed.");
        }
    }

    public void restoreTab() {
        if (!closedTabs.isEmpty()) {
            activeTab = closedTabs.pop();
            System.out.println("Tab restored. Current page: " +
                               activeTab.getCurrentPage());
        } else {
            System.out.println("No closed tabs to restore.");
        }
    }
}
