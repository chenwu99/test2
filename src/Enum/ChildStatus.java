package Enum;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.Arrays;
import java.util.List;

public enum ChildStatus {
        //删除
        DELETE(-1, "child.status.delete",null),
        //启用
        START_UP(1, "child.status.start.up", Arrays.asList(
                1,2,3,4)),
        //未启用
        NOT_ACTIVE(2, "child.status.not.active",Arrays.asList(
                1,2,3,4));

    ChildStatus(int code, String message, List<Integer> actions) {
        this.code = code;
        this.message = message;
        this.actions = actions;
    }

    /**结果code*/
        private int code;
        /**结果消息*/
        private String message;
        /**可以操作*/
        private List<Integer> actions;

    public static void main(String[] args) {
        System.out.println(START_UP.name());
        System.out.println(NOT_ACTIVE.ordinal());
    }

}
