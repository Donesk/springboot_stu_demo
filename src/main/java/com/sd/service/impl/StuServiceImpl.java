package com.sd.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sd.dao.StuMapper;
import com.sd.entity.Student;
import com.sd.service.StuService;
import org.springframework.stereotype.Service;

@Service
public class StuServiceImpl extends ServiceImpl<StuMapper, Student> implements StuService {
}
