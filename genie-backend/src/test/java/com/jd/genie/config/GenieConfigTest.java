package com.jd.genie.config;

import com.alibaba.fastjson.JSON;
import com.jd.genie.agent.util.SpringContextHolder;
import lombok.extern.slf4j.Slf4j;
import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class GenieConfigTest {

    @Test
    public void test() throws Exception {
        GenieConfig genieConfig = SpringContextHolder.getApplicationContext().getBean(GenieConfig.class);
        log.info(genieConfig.getPlanToolDesc());
    }

    @Test
    public void plannerSystemPromptMapTest() {
        GenieConfig genieConfig = SpringContextHolder.getApplicationContext().getBean(GenieConfig.class);
        log.info(JSON.toJSONString(genieConfig.getPlannerSystemPromptMap()));
    }

    @Test
    public void plannerNextStepPromptMapTest() {
        GenieConfig genieConfig = SpringContextHolder.getApplicationContext().getBean(GenieConfig.class);
        log.info(JSON.toJSONString(genieConfig.getPlannerNextStepPromptMap()));
    }

    @Test
    public void executorSystemPromptMapTest() {
        GenieConfig genieConfig = SpringContextHolder.getApplicationContext().getBean(GenieConfig.class);
        log.info(JSON.toJSONString(genieConfig.getExecutorSystemPromptMap()));
    }

    @Test
    public void executorNextStepPromptMapTest() {
        GenieConfig genieConfig = SpringContextHolder.getApplicationContext().getBean(GenieConfig.class);
        log.info(JSON.toJSONString(genieConfig.getExecutorNextStepPromptMap()));
    }

    @Test
    public void reactSystemPromptMapTest() {
        GenieConfig genieConfig = SpringContextHolder.getApplicationContext().getBean(GenieConfig.class);
        log.info(JSON.toJSONString(genieConfig.getReactSystemPromptMap()));
    }

    @Test
    public void reactNextStepPromptMapTest() {
        GenieConfig genieConfig = SpringContextHolder.getApplicationContext().getBean(GenieConfig.class);
        log.info(JSON.toJSONString(genieConfig.getReactNextStepPromptMap()));
    }

    @Test
    public void planToolDescTest() throws Exception {
        GenieConfig genieConfig = SpringContextHolder.getApplicationContext().getBean(GenieConfig.class);
        log.info(genieConfig.getPlanToolDesc());
    }

    @Test
    public void planToolParamsTest() {
        GenieConfig genieConfig = SpringContextHolder.getApplicationContext().getBean(GenieConfig.class);
        log.info(JSON.toJSONString(genieConfig.getPlanToolParams()));
    }

    @Test
    public void codeAgentDescTest() throws Exception {
        GenieConfig genieConfig = SpringContextHolder.getApplicationContext().getBean(GenieConfig.class);
        log.info(genieConfig.getCodeAgentDesc());
    }

    @Test
    public void codeAgentParamsTest() {
        GenieConfig genieConfig = SpringContextHolder.getApplicationContext().getBean(GenieConfig.class);
        log.info(JSON.toJSONString(genieConfig.getCodeAgentParams()));
    }

    @Test
    public void reportToolDescTest() throws Exception {
        GenieConfig genieConfig = SpringContextHolder.getApplicationContext().getBean(GenieConfig.class);
        log.info(genieConfig.getReportToolDesc());
    }

    @Test
    public void fileToolDescTest() throws Exception {
        GenieConfig genieConfig = SpringContextHolder.getApplicationContext().getBean(GenieConfig.class);
        log.info(genieConfig.getFileToolDesc());
    }

    @Test
    public void summarySystemPromptTest() {
        GenieConfig genieConfig = SpringContextHolder.getApplicationContext().getBean(GenieConfig.class);
        log.info(genieConfig.getSummarySystemPrompt());
    }



}