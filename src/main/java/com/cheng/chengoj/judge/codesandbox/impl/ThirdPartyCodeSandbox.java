package com.cheng.chengoj.judge.codesandbox.impl;

import com.cheng.chengoj.judge.codesandbox.CodeSandbox;
import com.cheng.chengoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.cheng.chengoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 第三方代码沙箱（调用远程第三方代码沙箱）
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
