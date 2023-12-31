package com.devkick.data.repo

import com.devkick.data.model.detail.Digimon
import com.devkick.data.model.list.DigimonList

/**
 * @author jacob_kim
 * @email aoqnwnd@naver.com
 * @created 10/22/23
 * @desc
 **/
interface DigimonRepo {

    /**
     * 디지몬 상세 정보 호출
     */
    suspend fun getDigimon(idOrName: String): Digimon?

    /**
     * 디지몬 정보 리스트 호출
     */
    suspend fun getDigimonList(
        name: String?,
        attribute: String?,
        xAntibody: Boolean?,
        level: String?,
        page: Int?,
        pageSize: Int?
    ): DigimonList?
}