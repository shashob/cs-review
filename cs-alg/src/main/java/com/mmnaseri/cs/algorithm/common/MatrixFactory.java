package com.mmnaseri.cs.algorithm.common;

/**
 * @author Mohammad Milad Naseri (m.m.naseri@gmail.com)
 * @since 1.0 (5/26/15, 11:16 PM)
 */
public interface MatrixFactory {

    <E> Matrix<E> getMatrix(int rows, int columns);

}
