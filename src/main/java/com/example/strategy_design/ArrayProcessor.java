package com.example.strategy_design;

import com.example.strategy_design.Filter.Filter;
import com.example.strategy_design.Search.Search;
import com.example.strategy_design.Sort.Sort;

public class ArrayProcessor {
    Sort sort;
    Search search;
    Filter filter;

    public ArrayProcessor(Sort sort, Search search, Filter filter) {
        this.sort = sort;
        this.search = search;
        this.filter = filter;
    }

    public void sort(int[] array) {
        sort.sort(array);
    }

    public void filter(int[] array, int value) {
        filter.filter(array, value);
    }

    public int search(int[] array, int target) {
        return search.search(array, target);
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }
}
