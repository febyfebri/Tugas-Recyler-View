package id.ac.amikom.dinosaurus

object DinosaurusData {
    val list : ArrayList<Dinosaurus>
    get() {
        val list : ArrayList<Dinosaurus> = arrayListOf()

        list.add(
            Dinosaurus(
            nama = "Ankilosaurus",
            keterangan = "Dibanding Stegosaurus dan Triceratops, Ankilosaurus dikenal memiliki perisai yang lebih dahsyat. Mereka sering kali disamakan seperti tank hidup karena bagian punggungnya dilapisi deretan tulang keras berbentuk seperti bonggol besar. Bahkan, T-rex pun pasti kesulitan menembus pertahanan baja dinosaurus ini.\n" +
                    "Seakan belum cukup tangguh, Ankilosaurus juga memiliki senjata lain pada ekornya yaitu tulang keras dan besar yang bisa diayunkan ke kaki predator. Berat tulang tersebut bisa mencapai 5 kg dan bisa menyebabkan luka serius pada dinosaurus yang terkena hantamannya. Singkatnya, Ankilosaurus memiliki sistem pertahanan yang sangat kuat!\n",
            url = "https://www.idntimes.com/science/discovery/peter-eduard/dinosaurus-paling-populer-c1c2/8",
            gambar = R.drawable.ankilosaurus
        ))

        list.add(
            Dinosaurus(
                nama = "Brontosaurus",
                keterangan = "Kamu juga pasti mengenal sejenis dinosaurus herbivor yang berbadan besar dan berleher panjang. Dinosaurus seperti itu disebut Sauropoda. Ada banyak jenis Sauropoda dan Brontosaurus adalah salah satu jenis yang paling terkenal. Nama Brontosaurus sendiri ternyata punya arti yang keren yaitu 'kadal petir'.\n" +
                        "Yang paling ikonik dari mereka tentu ukurannya yang besar dengan panjang hingga 27 meter dan berat 38 ton. Uniknya, Brontosaurus sempat dikira hanya sebagai salah satu spesies Apatosaurus. Namun, penelitian lanjutan menunjukkan bahwa mereka memang adalah jenis dinosaurus tersendiri.\n",
                url = "https://www.idntimes.com/science/discovery/peter-eduard/dinosaurus-paling-populer-c1c2/8",
                gambar = R.drawable.brontosaurus
            ))

        list.add(
            Dinosaurus(
                nama = "Pteranodon",
                keterangan = "Dinosaurus yang bisa terbang juga umumnya cukup populer. Salah satu yang paling terkenal adalah Pteranodon. Secara teknis, sebenarnya mereka tidak termasuk dinosaurus, melainkan hewan dari keluarga Pterosauria, reptil terbang kerabat dekat dinosaurus. Umumnya, mereka dianggap sebagai bagian dari dinosaurus juga.\n" +
                        "Pteranodon berhabitat di kawasan yang sekarang menjadi Amerika Utara. Bentang sayap mereka mencapai 6 meter dan beratnya bisa mencapai 36 kg. Mereka tidak memiliki gigi sehingga mereka memakan mangsanya yaitu ikan dengan cara langsung menelannya.\n",
                url = "https://www.idntimes.com/science/discovery/peter-eduard/dinosaurus-paling-populer-c1c2/8",
                gambar = R.drawable.pteranodon
            ))

        list.add(
            Dinosaurus(
                nama = "Spinosaurus",
                keterangan = "T-rex sudah cukup menyeramkan, tapi mereka bukan dinosaurus predator terbesar yang pernah hidup. Gelar itu adalah milik Spinosaurus yang memiliki ciri khas sirip besar pada bagian ekornya. Mereka bukan saja dinosaurus predator terbesar, tapi juga karnivor darat terbesar yang pernah hidup di bumi!\n" +
                        "Memangnya seberapa besar mereka? Britannica menyebut bahwa panjang dinosaurus ini bisa mencapai 18 meter dan berat 22 ton. Tengkoraknya saja bisa tumbuh sepanjang 1,75 meter. Dengan ukuran sebesar itu, mereka sebenarnya mampu membunuh dinosaurus besar. Namun, ilmuwan memperkirakan bahwa mereka adalah pemakan ikan.\n",
                url = "https://www.idntimes.com/science/discovery/peter-eduard/dinosaurus-paling-populer-c1c2/8",
                gambar = R.drawable.spinosaurus
            ))

        list.add(
            Dinosaurus(
                nama = "Stegosaurus",
                keterangan = "Dinosaurus yang satu ini pun memiliki penampilan yang sangat ikonik dengan lempeng duri-duri di sepanjang punggungnya. Duri-duri itu merupakan bagian dari kerangka mereka. Menurut Live Science, duri-duri tersebut berfungsi untuk menarik perhatian pasangannya saat musim kawin.\n" +
                        "Ukuran yang besar juga jadi ciri khusus dinosaurus ini. Ukuran mereka bisa mencapai 9 meter dan berat lebih dari 3 ton. Uniknya, ukuran otak mereka terbilang sangat kecil jika dibandingkan dengan tubuhnya. Bentuk dan ukuran otaknya diperkirakan hanya seperti sebuah hot dog yang melengkung.\n",
                url = "https://www.idntimes.com/science/discovery/peter-eduard/dinosaurus-paling-populer-c1c2/8",
                gambar = R.drawable.stegosaurus
            ))

        list.add(
            Dinosaurus(
                nama = "T-rex",
                keterangan = "Tyrannosaurus rex atau T-rex bisa dibilang sebagai spesies dinosaurus paling populer di dunia. Reputasi mereka sebagai predator raksasa ganas membuatnya sangat terkenal. Gak heran jika mereka sangat sering muncul dalam film, bahkan film animasi sekalipun.\n" +
                        "Penampilan mereka juga sangat ikonik: berdiri tegak dengan dua kaki; punya rahang yang besar dan penuh gigi tajam; tapi juga memiliki dua tangan kecil yang seolah gak berfungsi. Laman National Geographic menyebut bahwa bisa jadi tangan mungil itu ada fungsinya yaitu untuk mencabik mangsa atau untuk menahan pasangannya saat kawin.\n",
                url = "https://www.idntimes.com/science/discovery/peter-eduard/dinosaurus-paling-populer-c1c2/8",
                gambar = R.drawable.trex
            ))

        list.add(
            Dinosaurus(
                nama = "Triceratops",
                keterangan = "Dinosaurus bertanduk yang satu ini juga pasti kamu kenal. Nama Triceratops secara harfiah berarti 'wajah bertanduk tiga' dan memang tiga tanduknya itulah yang jadi ciri khas mereka. Tengkoraknya yang dilengkapi lempeng besar seperti perisai juga membuat penampilan mereka sangat mudah dikenali.\n" +
                        "Ukuran Triceratops diperkirakan hampir sama dengan gajah afrika. Panjangnya mencapai 9 meter, sementara bobotnya bisa mencapai lebih dari 7 ton. Kepala mereka sangat besar, salah satu yang terbesar di antara seluruh hewan darat. Spesimen tengkorak terbesar yang pernah ditemukan mencapai panjang 2,5 meter, sedangkan tanduknya bisa mencapai panjang 1 meter.\n",
                url = "https://www.idntimes.com/science/discovery/peter-eduard/dinosaurus-paling-populer-c1c2/8",
                gambar = R.drawable.triceratops
            ))

        list.add(
            Dinosaurus(
                nama = "Velociraptor",
                keterangan = "Dinosaurus yang satu ini juga sangat populer. Penampilan dan keganasannya konon mirip seperti T-rex, namun berukuran jauh lebih kecil dan gerakannya jauh lebih cepat. Nama Velociraptor sendiri dalam bahasa latin berarti 'pencuri yang gesit'.\n" +
                        "Namun, tahukah kamu bahwa ukuran dan penampilan Velociraptor sebenarnya tidak seperti yang digambarkan di film? Live Science menyebut bahwa mereka berbulu seperti burung dan tingginya hanya mencapai 0,5 meter, jauh lebih pendek dari manusia dewasa. Mereka juga lebih suka berburu hewan yang lebih kecil, seperti mamalia kecil, reptil, amfibi, bahkan serangga.\n",
                url = "https://www.idntimes.com/science/discovery/peter-eduard/dinosaurus-paling-populer-c1c2/8",
                gambar = R.drawable.velociraptor
            ))

        return list
    }
}