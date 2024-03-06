package com.demo.controllers.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.demo.entities.Account;
import com.demo.services.AccountService;
import com.demo.services.RoleService;

import jakarta.servlet.http.HttpSession;
@Controller
	@RequestMapping({ "user"})
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private BCryptPasswordEncoder encoder;
	 
		@RequestMapping(value = {"account"}, method = RequestMethod.GET)
		public String index() {
			return "user/account";
		}
		
		@RequestMapping(value = { "logout" }, method = RequestMethod.GET)
		public String logout(HttpSession httpSession) {
			httpSession.removeAttribute("username");
			return "redirect:/home/index";
		}
	
		
		@RequestMapping(value = { "register" }, method = RequestMethod.GET)
		public String register(ModelMap modelMap) {
			Account account = new Account();
			modelMap.put("account", account);
			return "user/register";
		}

		@RequestMapping(value = { "register" }, method = RequestMethod.POST)
		public String register(@ModelAttribute("account") Account account, RedirectAttributes redirectAttributes) {

			try {
				account.setStatus(true);
				account.setPassword(encoder.encode(account.getPassword()));
				if (accountService.save(account)) {


					redirectAttributes.addFlashAttribute("msg", "ok");


				} else {
					redirectAttributes.addFlashAttribute("msg", "fail");
					return "redirect:/user/register";
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "redirect:/home/index";
		}
}
