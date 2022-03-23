package utils;

import gui.Editor;

public class MsgUI {
    public static void sendLog(String msg) {
        Editor.instance.addLog(msg);
    }
}
