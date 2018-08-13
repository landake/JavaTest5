
FROM registry.cn-hangzhou.aliyuncs.com/choerodon-tools/javabase:0.5.0

COPY start.sh ./start.sh
COPY *.jar  /exam1.jar
RUN chmod a+x start.sh \
 & ls -al
CMD ["sh", "/start.sh"]