package com.biz.book.pesistence;

import com.biz.book.domain.BookVO;
import org.springframework.data.jpa.repository.JpaRepository;
//사실상 여기서 BookReapository 이란 이름이지만 BbsDao 와 같은역할을하는 인터페이스
public interface BookReapository extends JpaRepository<BookVO, Long> {




}
