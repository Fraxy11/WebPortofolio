package com.webapp.biodata.service;

import org.springframework.stereotype.Service;

import com.webapp.biodata.model.Konten;

@Service
public class KontenServiceImpl implements KontenService {

    @Override
    
    public Konten findKontenAll() {
        Konten isi1 = new Konten();
        isi1.setNama("Munib Farikhul Aziz");
        isi1.setUmur("18");
        isi1.setAlamat("Ds Wonosuko, RW/001 RT/003,Sumbermangku,Tapakrejo, Kec. Kesamben, Kab. Blitar, Jawa Timur");
        isi1.setSekolah("SMK Negeri 1 Doko");
        isi1.setTanggal("Blitar, 04 November 2005");
        isi1.setPengalaman("Membuat dan mendesain Project pembangunan Coverage Area Baru, melakukan survey virtual dengan Google Maps dan Input lokasi yang bangun. Melakukan perawawatan setiap Fiber Acces Terminal, Fiber Distribution Terminal dan Optical Line Termination dan update data area Coverage area yang telah di bangun  ");
        isi1.setPkl("PT. Indonesia Comnets+ Jember");
        isi1.setPengalaman2("Melakukan perbaikan Troubleshooting Fiber lapangan di mulai dengan perngecekan menggunakan OTDR, Splicing Kabel Fiber yang terputus hingga setting router kembali dan memastikan internet pelanggan bisa di gunakan kembali   ");
        return isi1; 
    }
}
