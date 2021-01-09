package com.xing.erp.sys.model;

public class Menu {
    private String menuid;

    private String menuname;

    private String icon;

    private String url;

    private String pid;

    public Menu(String menuid, String menuname, String icon, String url, String pid) {
        this.menuid = menuid;
        this.menuname = menuname;
        this.icon = icon;
        this.url = url;
        this.pid = pid;
    }

    public Menu() {
        super();
    }

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
}