package com.example.movie.database.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)
	public String exceptionHandlerNull(Model m, NullPointerException e) {
		m.addAttribute("msg", "Oops... Null Pointer Encountered");
		e.printStackTrace();
		return "error";
	}

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public String exceptionHandlerGeneric(Model m, Exception e) {
		m.addAttribute("msg", "Oops... Some Exception has been Encountered");
		e.printStackTrace();
		return "error";
	}

}
