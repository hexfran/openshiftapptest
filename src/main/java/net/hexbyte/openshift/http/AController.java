package net.hexbyte.openshift.http;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/openshift")
@Slf4j
public class AController
{
    @GetMapping("/test")
    public ResponseEntity<String> testGet(HttpServletRequest httpServletRequest)
    {
        return ResponseEntity.ok("Hello: " + httpServletRequest.getRemoteAddr());
    }
}
