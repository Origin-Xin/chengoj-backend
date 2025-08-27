package com.cheng.chengoj.judge.codesandbox;

import com.cheng.chengoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.cheng.chengoj.judge.codesandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
