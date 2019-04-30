package com.woniu.yoga.user.service;

import com.woniu.yoga.communicate.pojo.Comment;
import com.woniu.yoga.user.pojo.Order;
import com.woniu.yoga.user.vo.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author liufeng
 * @ClassName StudentService
 * @Date 2019/4/18 15:30
 * @Version 1.0
 * @Description TODO
 **/
public interface StudentService {




    Result getDetailInfoByUserId(Integer userId, Integer coachId) throws RuntimeException;


    Result saveOrder(Integer userId,Order order) throws RuntimeException;


    Result updateOrderWithCoupon(Integer userId,String orderId, @RequestParam(required = false) Integer couponId) throws RuntimeException;


    Result updateOrderForPay(Integer userId,String orderId) throws RuntimeException;


    Result saveComment(Integer userId,String orderId,Comment comment) throws RuntimeException;


    Result listAllCourseAppoint() throws RuntimeException;


    Result updateOrderForRefund(Integer userId,String orderId) throws RuntimeException;

    Result updateOrderForCancel(Integer userId, String orderId) throws RuntimeException;

    Result findCoachPhoneByUserId(Integer userId) throws RuntimeException;

    Result repeatOrder(Integer userId, String orderId) throws RuntimeException;
}
