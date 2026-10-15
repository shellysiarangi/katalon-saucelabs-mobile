# Katalon-SauceLabs-Mobile

Project otomasi pengujian **Mobile (Android)** menggunakan **Katalon Studio** untuk aplikasi demo **Sauce Labs** (Swag Labs / `APK-sauce-labs.2.7.1.apk`).

---

## 📋 Deskripsi Project

Project ini menguji alur utama aplikasi mobile Swag Labs: autentikasi login (positif dan negatif), navigasi menu (hamburger menu & logout), pemilihan produk, keranjang belanja, serta alur *checkout* pemesanan barang. Pengujian dibangun menggunakan pendekatan Page Object Model, Custom Keyword, dan Global Variable.

* **Target aplikasi** : Mobile Android (`APK-sauce-labs.2.7.1.apk`)
* **Tools** : Katalon Studio (Mobile Testing / Appium)
* **Bahasa** : Groovy / Java

---

## 📂 Struktur Folder

| Folder | Isi |
| --- | --- |
| `Test Cases/` | 3 test case utama (`Login_Logout`, `Login_Invalid`, `CheckOut_Barang`) |
| `Test Suites/` | 3 test suite (`Login_Logout`, `Login_Invalid`, `CheckOut_Barang`) |
| `Object Repository/` | Test object (locator XPath/Mobile) per halaman (Login, Check_Out, dll) |
| `Keywords/` | Custom keyword: `login.Login`, `login.Verify_Login`, `checkout.Information_Checkout`, `checkout.Scrool` |
| `Profiles/default.glbl` | Global Variable (Path APK, kredensial user, data checkout) |
| `Data/apk/` | File installer aplikasi (`APK-sauce-labs.2.7.1.apk`) |
| `Reports/` | Hasil eksekusi Test Suite (HTML, CSV, JUnit XML) |

---

## 🚀 Cara Menjalankan

> **Prasyarat:** Katalon Studio, Android Emulator atau Device Android terhubung (USB Debugging aktif), Appium / Node.js, dan koneksi internet.

1. Clone repository: `git clone [https://github.com/shellysiarangi/katalon-saucelabs-mobile.git](https://github.com/shellysiarangi/katalon-saucelabs-mobile.git)` (atau repository lokal Anda)
2. Buka Katalon Studio, pilih **File > Open Project**, lalu pilih file `katalon-saucelabs-mobile.prj`.
3. Periksa file `Profiles/default.glbl` dan sesuaikan path lokasi file APK (`apk`) jika diperlukan.
4. Buka folder **Test Suites**, pilih salah satu Test Suite (misal `CheckOut_Barang`).
5. Pilih perangkat target (Android Device / Emulator), lalu klik tombol **Run**.
6. Hasil eksekusi dapat dilihat pada folder **Reports**.

---

## 🔑 Kredensial dan Global Variable

Tidak ada kredensial yang ditulis langsung di script test case. Semua nilai dikelola melalui **Global Variable**:

| Variable | Fungsi / Nilai |
| --- | --- |
| `apk` | Path file APK aplikasi Swag Labs |
| `timeout` | Batas waktu tunggu element (10 detik) |

---

## 🧪 Test Suite

| Test Suite | Test Case | Jenis / Kategori |
| --- | --- | --- |
| `Login_Logout` | `Login_Logout` | Positif (Login valid, navigasi menu, dan Logout) |
| `Login_Invalid` | `Login_Invalid` | Negatif (Login dengan password salah / kredensial tidak valid) |
| `CheckOut_Barang` | `CheckOut_Barang` | Positif (Pilih produk, tambah ke keranjang, isi form *checkout*, dan selesai) |

---

## 📊 Test Coverage

| Fitur | Skenario | Pengecekan / Hasil yang Diharapkan |
| --- | --- | --- |
| Login Valid | Masukkan username & password valid | Masuk ke halaman utama produk (Products) |
| Login Invalid | Masukkan password salah | Muncul pesan error autentikasi yang sesuai |
| Checkout Barang | Pilih produk, add to cart, isi data diri, dan finish | Transaksi sukses dan tampil teks konfirmasi *Thank you for your order* |
| Logout | Akses hamburger menu lalu klik logout | Kembali ke halaman halaman login |

Total: **3 test case**, **3 test suite**. Contoh report dan log eksekusi tersedia di folder `Reports/`.

---

## 📝 Catatan

* Pastikan layanan Appium dan emulator/perangkat Android aktif sebelum menjalankan test suite di Katalon Studio.
* Path pada `GlobalVariable.apk` dapat disesuaikan dengan direktori lokal komputer Anda jika menjalankan project di mesin yang berbeda.