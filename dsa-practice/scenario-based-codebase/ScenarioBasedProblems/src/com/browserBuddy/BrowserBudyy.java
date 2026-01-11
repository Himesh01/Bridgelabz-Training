package com.browserBuddy;

public class BrowserBudyy {

    public static void main(String[] args) {
        Browser browser = new Browser();

        browser.openTab("google.com");
        browser.visitPage("github.com");
        browser.visitPage("stackoverflow.com");

        browser.back();
        browser.forward();

        browser.closeTab();
        browser.restoreTab();
    }
}
