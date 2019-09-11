package cn.wmyskxz.blog.common.exception.handler;



import cn.wmyskxz.blog.common.enums.Enum_ErrorMsg;
import cn.wmyskxz.blog.common.enums.ErrorCodes;
import cn.wmyskxz.blog.common.exception.customizedexception.ErrorMsgException;
import cn.wmyskxz.blog.common.exception.customizedexception.ProcessFaliException;
import cn.wmyskxz.blog.common.vo.ErrorMessage;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * 定义全局异常
 */
@ControllerAdvice(basePackages = {"com.sinosoft.sss"})
@Slf4j
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ErrorMsgException.class)
    @ResponseBody
    ResponseEntity<ErrorMessage> handleErrotMsgExceptions(ErrorMsgException ex) {
        ErrorMessage errorMessage = new ErrorMessage(Enum_ErrorMsg.DEFAULT_ERROR);
        try {
            if (StringUtils.isNotEmpty(ex.getErrorCode())) {
                errorMessage.setCode(ex.getErrorCode());
                errorMessage.setMsg(ex.getMessage());
            }
        } catch (Exception e) {
            log.warn(e.getMessage());
        }
        return new ResponseEntity<>(errorMessage, HttpStatus.OK);
    }

    @ExceptionHandler(ProcessFaliException.class)
    @ResponseBody
    ResponseEntity<ErrorMessage> handleProcessExceptions(ProcessFaliException ex) {
        log.error(String.valueOf(ex));
        ErrorMessage errorMessage = new ErrorMessage(Enum_ErrorMsg.DEFAULT_ERROR);
        try {
            if (StringUtils.isNotEmpty(ex.getErrorCode())) {
                errorMessage.setCode(ex.getErrorCode());
                errorMessage.setMsg(ex.getMessage());
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return new ResponseEntity<>(errorMessage, HttpStatus.OK);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseBody
    ResponseEntity<ErrorMessage> handleIllegalArgumentExceptions(IllegalArgumentException ex) {
        ErrorMessage errorMessage = new ErrorMessage(Enum_ErrorMsg.REQUEST_ERROR);
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    ResponseEntity<ErrorMessage> handleAllExceptions(Exception ex) {
        log.error(ex.getMessage());
        ErrorMessage errorMessage = new ErrorMessage(ErrorCodes.SYSTEM_ERROR);
        return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
