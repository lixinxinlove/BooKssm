package com.lee.web;

import com.lee.entity.Book;
import com.lee.service.BookService;
import com.lee.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lixinxin on 2017/6/24.
 */

@Controller
@RequestMapping("/book") // url:/模块/资源/{id}/细分 /seckill/list
public class BookController {


    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private String list(Model model) {
        List<Book> list = bookService.getList();
        model.addAttribute(list);

        for (Book book : list) {
            System.out.print(book.toString());
        }


        //  model.addAttribute("list", list);
        // list.jsp + model = ModelAndView
        return "list";// WEB-INF/jsp/"list".jsp
    }

    @RequestMapping(value = "/{bookId}/detail", method = RequestMethod.GET)
    private String detail(@PathVariable("bookId") Long bookId, Model model) {
        if (bookId == null) {
            return "redirect:/book/list";
        }
        Book book = bookService.getById(bookId);
        if (book == null) {
            return "forward:/book/list";
        }
        model.addAttribute("book", book);
        return "detail";
    }

    /**
     * 返回json
     * @param bookId
     * @return
     */

    @RequestMapping(value = "/{bookId}", method = RequestMethod.GET)
    public @ResponseBody
    Book getBookInJson(@PathVariable Integer bookId) {
        return bookService.getById(bookId);
    }


    @RequestMapping(value="/json/{bookId}",method=RequestMethod.GET)
    public ResponseEntity<Book> getCourseInJson2(@PathVariable Integer bookId){
        Book book =   bookService.getById(bookId);
        return new ResponseEntity<Book>(book, HttpStatus.OK);
    }

}