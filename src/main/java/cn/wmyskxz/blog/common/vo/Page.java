package cn.wmyskxz.blog.common.vo;

import org.springframework.util.Assert;

import java.io.Serializable;

public class Page implements Serializable {
    private static final long serialVersionUID = 1L;

    private int allRow = 0; // allRow will always big than -1
    private int currentPage; // currentPage will always big than 0
    private int size; // size will always big than 0
    private int totalPage = 0; // totalPage will always big than -1
    private static final Integer DEFAULT_PAGE_SIZE = 15;
    private static final Integer DEFAULT_MAX_PAGE_SIZE = 200;

    public Page(Integer currentPage) {
        this(null, currentPage);
    }


    public Page(Integer size, Integer currentPage) {
        this.currentPage = (currentPage == null ? 1 : currentPage);
        this.size = (size == null ? DEFAULT_PAGE_SIZE : size);

        Assert.isTrue(size <= DEFAULT_MAX_PAGE_SIZE, "pageSize 不能大于200");
        Assert.isTrue(currentPage > 0, "currentPage不能小于1");

        this.currentPage = currentPage;
        this.size = size;
    }

    /**
     * the total number of result
     *
     * @return
     */
    public int getAllRow() {
        return allRow;
    }

    /**
     * allRow must big or equal 0
     *
     * @param allRow
     */
    public void setAllRow(Integer allRow) {
        Assert.isTrue(allRow >= 0,"查询条数不能为负值");
        Assert.notNull(allRow,"查询条数不能为空");

        this.totalPage = (allRow + size ) / size;
        this.allRow = allRow;
    }


    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * according to size and currentPage calculate the start row num for databases
     *
     * @return
     */
    public int getStart() {
        return this.getSize() * (this.getCurrentPage() - 1);
    }

    public int getSize() {
        return size;
    }

    public int getTotalPage() {
        return totalPage;
    }
}
