-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 30, 2018 lúc 04:10 PM
-- Phiên bản máy phục vụ: 10.1.31-MariaDB
-- Phiên bản PHP: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `timeslot`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `attendance_details`
--

CREATE TABLE `attendance_details` (
  `id` bigint(20) NOT NULL,
  `attendance_time` bigint(20) DEFAULT NULL,
  `status` int(11) NOT NULL,
  `attendance_slots_id` bigint(20) DEFAULT NULL,
  `student_id` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_520_ci;

--
-- Đang đổ dữ liệu cho bảng `attendance_details`
--

INSERT INTO `attendance_details` (`id`, `attendance_time`, `status`, `attendance_slots_id`, `student_id`) VALUES
(1, 8318831, 1, 1, 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `attendance_slots`
--

CREATE TABLE `attendance_slots` (
  `id` bigint(20) NOT NULL,
  `attendance_at` varchar(255) COLLATE utf8_unicode_520_ci DEFAULT NULL,
  `status` int(11) NOT NULL,
  `subjects_id` varchar(255) COLLATE utf8_unicode_520_ci DEFAULT NULL,
  `a_class_id` varchar(255) COLLATE utf8_unicode_520_ci DEFAULT NULL,
  `time_slots_id` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_520_ci;

--
-- Đang đổ dữ liệu cho bảng `attendance_slots`
--

INSERT INTO `attendance_slots` (`id`, `attendance_at`, `status`, `subjects_id`, `a_class_id`, `time_slots_id`) VALUES
(1, '10/6/2018', 1, 'PHP', 'T1707M', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `class`
--

CREATE TABLE `class` (
  `id` varchar(255) COLLATE utf8_unicode_520_ci NOT NULL,
  `create_at` varchar(255) COLLATE utf8_unicode_520_ci DEFAULT NULL,
  `status` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_520_ci;

--
-- Đang đổ dữ liệu cho bảng `class`
--

INSERT INTO `class` (`id`, `create_at`, `status`) VALUES
('T1707M', '10/05/2018', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_520_ci;

--
-- Đang đổ dữ liệu cho bảng `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1),
(1),
(1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `student`
--

CREATE TABLE `student` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_520_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_520_ci;

--
-- Đang đổ dữ liệu cho bảng `student`
--

INSERT INTO `student` (`id`, `name`) VALUES
(1, 'Tran Khanh Duong');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `student_class`
--

CREATE TABLE `student_class` (
  `studen_class_id` bigint(20) NOT NULL,
  `status` int(11) NOT NULL,
  `a_class_id` varchar(255) COLLATE utf8_unicode_520_ci DEFAULT NULL,
  `student_id` bigint(20) DEFAULT NULL,
  `class_id` varchar(255) COLLATE utf8_unicode_520_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_520_ci;

--
-- Đang đổ dữ liệu cho bảng `student_class`
--

INSERT INTO `student_class` (`studen_class_id`, `status`, `a_class_id`, `student_id`, `class_id`) VALUES
(1, 1, 'T1707M', 1, NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `time_slots`
--

CREATE TABLE `time_slots` (
  `id` int(11) NOT NULL,
  `time` varchar(255) COLLATE utf8_unicode_520_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_520_ci;

--
-- Đang đổ dữ liệu cho bảng `time_slots`
--

INSERT INTO `time_slots` (`id`, `time`) VALUES
(1, '8h-12h');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `attendance_details`
--
ALTER TABLE `attendance_details`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK1nfofbrqtnn98tevjgrt945uj` (`attendance_slots_id`),
  ADD KEY `FKaswut0s63m2i2rybn0a0ntybo` (`student_id`);

--
-- Chỉ mục cho bảng `attendance_slots`
--
ALTER TABLE `attendance_slots`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKtdwraeyid60cdmimqkj6sa5h5` (`a_class_id`),
  ADD KEY `FK2ows5qeq8oanlyos6bbo6dyuw` (`time_slots_id`);

--
-- Chỉ mục cho bảng `class`
--
ALTER TABLE `class`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `student_class`
--
ALTER TABLE `student_class`
  ADD PRIMARY KEY (`studen_class_id`),
  ADD KEY `FK70cf3frvf7i03b94xiuxy663b` (`a_class_id`),
  ADD KEY `FK2f81ovfviq7rv4jhpdr46dk3e` (`student_id`);

--
-- Chỉ mục cho bảng `time_slots`
--
ALTER TABLE `time_slots`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
