package com.c0de_h0ng.kakaosearchcleanac.domain.repository

import com.c0de_h0ng.kakaosearchcleanac.data.remote.dto.blog.BlogDto
import io.reactivex.Observable
import io.reactivex.Single

/**
 * Created by c0de_h0ng on 2022/01/18.
 */
interface KakaoRepository {

    suspend fun getBlogResult(searchWord: String): BlogDto

    fun getRxJavaBlogResult(searchWord: String): Observable<BlogDto>

    fun getRxJavaBlogSingleResult(searchWord: String): Single<BlogDto>

}