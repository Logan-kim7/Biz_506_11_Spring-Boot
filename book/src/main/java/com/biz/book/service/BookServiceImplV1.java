package com.biz.book.service;


import com.biz.book.domain.BookVO;
import com.biz.book.pesistence.BookReapository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service("bookServiceV1")
public class BookServiceImplV1 implements BookService{


    private final BookReapository bookDao;
    public BookServiceImplV1(BookReapository bookDao) {
        this.bookDao = bookDao;
    }


    @Override
    public List<BookVO> selectAll() {

        List<BookVO> bookList = bookDao.findAll();
        return bookList;
    }

    /**
     * Optianl
     * 데이터가 없음을 null이 아닌 어떤 명확한 근거를 바탕으로 
     * 알고싶다 라는 취지에서 새로 생성한 wraper 클래스
     * VO 클래스를 감싸는 wraper 클래스
     *
     * 일반적으로 DB핸들링에서 findById(Long id)를 수정한 후
     * id에 해당하는 데이터가 없을경우 return 값이 null이었다
     * if(vo=null) {
     *     log.debug("데이터가 없음")
     * }
     *  Optianl 은 어떤 객체의 지정된 값이 null인가를 비교하는 것을
     *  사용하지 않기 위해서 새롭게 등장한 clean app 이다.
     *
     * null값을 비교하는것보다 연산 비용이 많이 든다.
     * 아직은 논란의 여지가 많다.
     * 
     */
    @Override
    public BookVO findById(Long id) {
        Optional<BookVO> bookVO = bookDao.findById(id);

        // 만약 findById() 수행하여 데이터가 없으면
        // 새로운 VO를 만들고 id값을 -1로 setting 해라
        return bookVO.orElse(BookVO.builder().id(-1L).build());
    }

    @Override
    public int insert(BookVO bookVO){
        bookDao.save(bookVO);
        return 0;
    }

    @Override
    public int update(BookVO bookVO){
         bookDao.save(bookVO);
        return 0;
    }
    @Override
    public int delete(Long id){
         bookDao.deleteById(id);
        return 0;
    }
}
