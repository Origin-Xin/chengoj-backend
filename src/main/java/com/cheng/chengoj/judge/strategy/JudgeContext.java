package com.cheng.chengoj.judge.strategy;

import com.cheng.chengoj.model.dto.question.JudgeCase;
import com.cheng.chengoj.judge.codesandbox.model.JudgeInfo;
import com.cheng.chengoj.model.entity.Question;
import com.cheng.chengoj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;
/**
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> outputList;

    private List<String> inputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;
}
