package com.cheng.chengoj.judge;

import com.cheng.chengoj.judge.strategy.DefaultJudgeStrategy;
import com.cheng.chengoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.cheng.chengoj.judge.strategy.JudgeContext;
import com.cheng.chengoj.judge.strategy.JudgeStrategy;
import com.cheng.chengoj.judge.codesandbox.model.JudgeInfo;
import com.cheng.chengoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
