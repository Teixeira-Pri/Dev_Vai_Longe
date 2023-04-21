package com.example.devvailonge

import com.example.devvailonge.models.Video

class DataSource {

    companion object{

        fun createDataSet(): ArrayList<Video>{

            val list = ArrayList<Video>()

            list.add(
                Video(
                    "#01 Aprenda a escrever testes para android, nova documentação do Google.",
                    "Dev Vai Longe",
                    "https://i.ytimg.com/an_webp/8CDvhkVjk2s/mqdefault_6s.webp?du=3000&sqp=CInqiqIG&rs=AOn4CLDH0NgnbzN5jTo3LTLDsETHaoZtzA",
                    "https://www.youtube.com/watch?v=8CDvhkVjk2s"
                )
            );

            list.add(
                Video(
                    "#02 Testes unitários no Android com mockito, jUnit e kotlin.",
                    "Dev Vai Longe",
                    "https://i.ytimg.com/an_webp/iKaPscjFa-4/mqdefault_6s.webp?du=3000&sqp=CJ6Wi6IG&rs=AOn4CLCZOuboA5sjdiLng7GgD3LfqOwh1w",
                    "https://www.youtube.com/watch?v=iKaPscjFa-4"
                )
            );

            list.add(
                Video(
                    "#03 TDD - Test Driven Development no Android seguindo tutorial do Google.",
                    "Dev Vai Longe",
                    "https://i.ytimg.com/an_webp/3otGKarMMB4/mqdefault_6s.webp?du=3000&sqp=CJLKi6IG&rs=AOn4CLCULXsWgN187IUAUFpZecUfhBn-aw",
                    "https://www.youtube.com/watch?v=3otGKarMMB4"
                )
            );

            list.add(
                Video(
                    "#04 TESTES PARA VIEWMODEL E LIVEDATA COM A LIB DO ANDROIDX",
                    "Dev Vai Longe",
                    "https://i.ytimg.com/an_webp/k82EQ603mJg/mqdefault_6s.webp?du=3000&sqp=CLi_i6IG&rs=AOn4CLC0dItX6BeX6PWX1cyexgOK93Sdkw",
                    "https://www.youtube.com/watch?v=k82EQ603mJg"
                )
            )

            return list
        }
    }
}