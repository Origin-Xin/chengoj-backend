package com.cheng.chengoj.judge.strategy;

import com.cheng.chengoj.judge.codesandbox.model.JudgeInfo;

public interface JudgeStrategy {
    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
