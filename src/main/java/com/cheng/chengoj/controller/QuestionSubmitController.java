package com.cheng.chengoj.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cheng.chengoj.annotation.AuthCheck;
import com.cheng.chengoj.common.BaseResponse;
import com.cheng.chengoj.common.ErrorCode;
import com.cheng.chengoj.common.ResultUtils;
import com.cheng.chengoj.constant.UserConstant;
import com.cheng.chengoj.exception.BusinessException;
import com.cheng.chengoj.model.dto.question.QuestionQueryRequest;
import com.cheng.chengoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.cheng.chengoj.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.cheng.chengoj.model.entity.Question;
import com.cheng.chengoj.model.entity.QuestionSubmit;
import com.cheng.chengoj.model.entity.User;
import com.cheng.chengoj.model.vo.QuestionSubmitVO;
import com.cheng.chengoj.service.QuestionSubmitService;
import com.cheng.chengoj.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 题目提交接口
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@RestController
//@RequestMapping("/question_submit")
@Slf4j
@Deprecated
public class QuestionSubmitController {

    @Resource
    private QuestionSubmitService questionSubmitService;

    @Resource
    private UserService userService;

    /**
     * 提交题目
     *
     * @param questionSubmitAddRequest
     * @param request
     * @return resultNum 本次点赞变化数
     */
//    @PostMapping("/")
//    public BaseResponse<Long> doQuestionSubmit(@RequestBody QuestionSubmitAddRequest questionSubmitAddRequest,
//            HttpServletRequest request) {
//        if (questionSubmitAddRequest == null || questionSubmitAddRequest.getQuestionId() <= 0) {
//            throw new BusinessException(ErrorCode.PARAMS_ERROR);
//        }
//        // 登录才能点赞
//        final User loginUser = userService.getLoginUser(request);
//        long result = questionSubmitService.doQuestionSubmit(questionSubmitAddRequest, loginUser);
//        return ResultUtils.success(result);
//    }

    /**
     * 分页获取题目提交列表（仅管理员）
     *
     * @param questionSubmitQueryRequest
     * @return
     */
//    @PostMapping("/list/page")
//    public BaseResponse<Page<QuestionSubmitVO>> listQuestionSubmitByPage(@RequestBody QuestionSubmitQueryRequest questionSubmitQueryRequest, HttpServletRequest request) {
//        long current = questionSubmitQueryRequest.getCurrent();
//        long size = questionSubmitQueryRequest.getPageSize();
//        User loginUser = userService.getLoginUser(request);
//        // 从数据中查询原始的题目提交分页信息
//        Page<QuestionSubmit> questionSubmitPage = questionSubmitService.page(new Page<>(current, size),
//                questionSubmitService.getQueryWrapper(questionSubmitQueryRequest));
//        // 返回脱敏信息
//        return ResultUtils.success(questionSubmitService.getQuestionSubmitVOPage(questionSubmitPage,loginUser));
//    }

}
