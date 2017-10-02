
package zl.management.validator;

import java.util.HashMap;
import java.util.Map;

import zl.management.domain.Researchers;

public class ResearcherValidator {
	
	public Map<String, String> validateRegistered(Researchers r) {
		Map<String, String> errors = new HashMap<String, String>();
		
		String name = r.getName();
		String email = r.getEmail();
		
		if(email == null || email.trim().equals("")) {
			errors.put("email", "邮箱不为空");
		}else if (!email.matches("\\w+@\\w+(\\.\\w+)+")){
			errors.put("email", "邮箱格式错误");
		}
		
		return errors;
	}
}
