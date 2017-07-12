package com.lee.web;

import com.lee.entity.Book;
import com.lee.entity.Data;
import com.lee.entity.LeePage;
import com.lee.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

        LeePage leePage = new LeePage();
        leePage.setLimit(10);
        leePage.setPage(1);

        List<Book> list = bookService.queryPage(leePage);
        model.addAttribute("itemsList", list);
        model.addAttribute("page", 1);

        return "list";
    }


    @RequestMapping(value = "/prev/{page}", method = RequestMethod.GET)
    private String prevPage(@PathVariable("page") Integer page, Model model) {

        nextOrPrePage(page, model);
        return "list";
    }




    @RequestMapping(value = "/next/{page}", method = RequestMethod.GET)
    private String nextPage(@PathVariable("page") Integer page, Model model) {
        nextOrPrePage(page, model);
        return "list";
    }


    @RequestMapping(value = "/{bookId}/detail", method = RequestMethod.GET)
    private String detail(@PathVariable("bookId") Integer bookId, Model model) {
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

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    private String addBook() {
        Book book = new Book();
        int i = bookService.addBook(book);
        System.out.print(i);
        return "detail";
    }

    @RequestMapping(value = "/delete/{bookId}", method = RequestMethod.GET)
    private String deleteBook(@PathVariable("bookId") Integer bookId) {
        int i = bookService.deleteById(bookId);
        System.out.print(i);
        return "detail";
    }

    /**
     * 返回json
     *
     * @param bookId
     * @return
     */
    @RequestMapping(value = "/{bookId}", method = RequestMethod.GET)
    public @ResponseBody
    Data getBookInJson(@PathVariable Integer bookId) {
        Data data = new Data();
        List<Book> bookList = bookService.getList();
        data.setBookList(bookList);
        data.setCode(200);
        return data;
    }

    @RequestMapping(value = "/json/{bookId}", method = RequestMethod.GET)
    public ResponseEntity<Book> getCourseInJson2(@PathVariable Integer bookId) {
        Book book = bookService.getById(bookId);
        return new ResponseEntity<Book>(book, HttpStatus.OK);
    }


    private void nextOrPrePage(@PathVariable("page") Integer page, Model model) {
        LeePage leePage = new LeePage();
        leePage.setLimit(10);
        leePage.setPage((page - 1) * 10 + 1);
        List<Book> list = bookService.queryPage(leePage);
        model.addAttribute("itemsList", list);
        model.addAttribute("page", page);
    }

}
