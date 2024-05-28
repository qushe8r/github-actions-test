package log.qushe8r.githubactionstest.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping
	ResponseEntity<TestResponse> getTestResponse() {
		return ResponseEntity.status(200).body(new TestResponse("success", "The test was successful."));
	}
}
