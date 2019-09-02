package com.ixui.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookManageController {
	
	//ログイン画面用
	@RequestMapping(value = "/login", method = RequestMethod.GET )
	public ModelAndView getlogin(ModelAndView mav) {
		mav.setViewName("login");
		return mav;
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView postLogin(ModelAndView mav) {
		mav.setViewName("login");
		return mav;
	}
	
	//新規登録画面用
	@RequestMapping(value = "/user_regist", method = RequestMethod.GET)
	public ModelAndView getUserRegist(ModelAndView mav) {
		mav.setViewName("user_regist");
		return mav;
	}
	@RequestMapping(value = "/user_regist", method = RequestMethod.POST)
	public ModelAndView postUserRegist(ModelAndView mav) {
		mav.setViewName("login");
		return mav;
	}
	
	//一般メニュー画面用
	@RequestMapping(value = "/general_menu")
	public ModelAndView getMenu(ModelAndView mav) {
		mav.setViewName("general_menu");
		return mav;
	}
	
	//書籍一覧画面用
	@RequestMapping(value = "/booklist")
	public ModelAndView getBookList(ModelAndView mav) {
		mav.setViewName("booklist");
		return mav;
	}
	
	//書籍登録画面用
	@RequestMapping(value = "/book_regist", method = RequestMethod.GET)
	public ModelAndView getBookRegist(ModelAndView mav) {
		mav.setViewName("book_regist");
		return mav;
	}
	@RequestMapping(value = "/book_regist", method = RequestMethod.POST)
	public ModelAndView postBookRegist(ModelAndView mav) {
		mav.setViewName("book_regist");
		return mav;
	}
	
	//ユーザー情報更新画面用
	@RequestMapping(value = "/user_update", method = RequestMethod.GET)
	public ModelAndView getUserUpdate(ModelAndView mav) {
		mav.setViewName("user_update");
		return mav;
	}
	@RequestMapping(value = "/user_update", method = RequestMethod.POST)
	public ModelAndView postUserUpdate(ModelAndView mav) {
		mav.setViewName("login");
		return mav;
	}
	
	//書籍返却画面用
	@RequestMapping(value = "/book_return", method = RequestMethod.GET)
	public ModelAndView getBookReturn(ModelAndView mav) {
		mav.setViewName("book_return");
		return mav;
	}
	@RequestMapping(value = "/book_return", method = RequestMethod.POST)
	public ModelAndView postBookReturn(ModelAndView mav) {
		mav.setViewName("general_menu");
		return mav;
	}
	
	//レビュー画面用
	@RequestMapping("/review")
	public ModelAndView review(ModelAndView mav) {
		mav.setViewName("review");
		return mav;
	}
	
	//書籍貸出画面用
	@RequestMapping(value = "/book_lending", method = RequestMethod.GET)
	public ModelAndView getBookLending(ModelAndView mav) {
		mav.setViewName("book_lending");
		return mav;
	}
	@RequestMapping(value = "/book_lending")
	public ModelAndView postBookLending(ModelAndView mav) {
		mav.setViewName("booklist");
		return mav;
	}
	
	//書籍更新・削除画面
	@RequestMapping(value = "/book_edit", method = RequestMethod.GET)
	public ModelAndView getBookEdit(ModelAndView mav) {
		mav.setViewName("book_edit");
		return mav;
	}
	@RequestMapping(value = "/book_edit", method = RequestMethod.POST)
	public ModelAndView postBookEdit(ModelAndView mav) {
		mav.setViewName("booklist");
		return mav;
	}
	
	//管理者用メニュー画面用
	@RequestMapping("/admin_menu")
	public ModelAndView adminMenu(ModelAndView mav) {
		mav.setViewName("admin_menu");
		return mav;
	}
	
	//ユーザー一覧画面用
	@RequestMapping("/userlist")
	public ModelAndView userList(ModelAndView mav) {
		mav.setViewName("userlist");
		return mav;
	}
	
	//各種設定画面用
	@RequestMapping(value = "settings", method = RequestMethod.GET)
	public ModelAndView getSettings(ModelAndView mav) {
		mav.setViewName("settings");
		return mav;
	}
	@RequestMapping(value = "settings", method = RequestMethod.POST)
	public ModelAndView postSettings(ModelAndView mav) {
		mav.setViewName("userlist");
		return mav;
	}
}
