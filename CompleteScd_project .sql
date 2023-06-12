-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 12, 2023 at 09:31 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `scd_project`
--

-- --------------------------------------------------------

--
-- Table structure for table `announcement`
--

CREATE TABLE `announcement` (
  `Record` varchar(600) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `announcement`
--

INSERT INTO `announcement` (`Record`) VALUES
('Muaz is suspanded due to purpose the girl');

-- --------------------------------------------------------

--
-- Table structure for table `assignments`
--

CREATE TABLE `assignments` (
  `Activity` varchar(10) NOT NULL,
  `Obtained Marks` int(10) NOT NULL,
  `Total Marks` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `assignments`
--

INSERT INTO `assignments` (`Activity`, `Obtained Marks`, `Total Marks`) VALUES
('A-1', 9, 10),
('A-2', 7, 10),
('A-3', 10, 10),
('A-4', 9, 10),
('A-5', 8, 10),
('A-6', 0, 10),
('A-7', 7, 10),
('A-8', 6, 10);

-- --------------------------------------------------------

--
-- Table structure for table `attendence`
--

CREATE TABLE `attendence` (
  `01-June-2023` varchar(10) NOT NULL,
  `02-June-2023` varchar(10) NOT NULL,
  `03-June-2023` varchar(10) NOT NULL,
  `04-June-2023` varchar(10) NOT NULL,
  `05-June-2023` varchar(10) NOT NULL,
  `06-June-2023` varchar(10) NOT NULL,
  `07-June-2023` varchar(10) NOT NULL,
  `08-June-2023` varchar(10) NOT NULL,
  `09-June-2023` varchar(10) NOT NULL,
  `10-June-2023` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `attendence`
--

INSERT INTO `attendence` (`01-June-2023`, `02-June-2023`, `03-June-2023`, `04-June-2023`, `05-June-2023`, `06-June-2023`, `07-June-2023`, `08-June-2023`, `09-June-2023`, `10-June-2023`) VALUES
('P', 'P', 'P', 'L', 'P', 'P', 'L', 'L', 'L', 'P'),
('P', 'P', 'P', 'P', 'A', 'P', 'P', 'P', 'A', 'A'),
('P', 'P', 'P', 'A', 'P', 'P', 'L', 'P', 'P', 'P'),
('P', 'P', 'A', 'A', 'P', 'P', 'P', 'P', 'P', 'P'),
('P', 'L', 'L', 'L', 'A', 'A', 'P', 'P', 'P', 'P'),
('P', 'A', 'P', 'P', 'P', 'P', 'P', 'P', 'L', 'L'),
('P', 'P', 'P', 'P', 'A', 'A', 'A', 'L', 'P', 'P'),
('P', 'P', 'P', 'A', 'A', 'P', 'P', 'P', 'P', 'P'),
('L', 'L', 'P', 'P', 'P', 'P', 'L', 'L', 'P', 'P');

-- --------------------------------------------------------

--
-- Table structure for table `enroll_course`
--

CREATE TABLE `enroll_course` (
  `Course` varchar(20) NOT NULL,
  `Section` int(10) NOT NULL,
  `CreditHours` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `enroll_course`
--

INSERT INTO `enroll_course` (`Course`, `Section`, `CreditHours`) VALUES
('Data Science', 1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `feesummary`
--

CREATE TABLE `feesummary` (
  `name` varchar(250) NOT NULL,
  `id` varchar(250) NOT NULL,
  `ChallanID` varchar(250) NOT NULL,
  `DateOFIssue` varchar(250) NOT NULL,
  `GetCourse` varchar(250) NOT NULL,
  `CampusID` varchar(250) NOT NULL,
  `ScholarShip` varchar(250) NOT NULL,
  `DueDate` varchar(250) NOT NULL,
  `LateSubmition` varchar(250) NOT NULL,
  `total` int(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `feesummary`
--

INSERT INTO `feesummary` (`name`, `id`, `ChallanID`, `DateOFIssue`, `GetCourse`, `CampusID`, `ScholarShip`, `DueDate`, `LateSubmition`, `total`) VALUES
('osaf', '23', '323', '323-32-3', 'BSE', '2323', '10', '32-3-323', '234', 2154),
('234', '342fd', '324', '34', 'BSE', 'BSE', '234', '234', '324', 310),
('Osaf Ahmed', 'bse203022', '1234', '23-5-2023', 'BSE', '1', '25', '23-6-2023', '1000', 7500);

-- --------------------------------------------------------

--
-- Table structure for table `foam_gpa`
--

CREATE TABLE `foam_gpa` (
  `Course Title` text NOT NULL,
  `Grade` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `foam_gpa`
--

INSERT INTO `foam_gpa` (`Course Title`, `Grade`) VALUES
('artificial intelligence', 'A'),
('Data Science', 'A'),
('Software Quality Engineer', 'A'),
('MathA', 'A');

-- --------------------------------------------------------

--
-- Table structure for table `gpa`
--

CREATE TABLE `gpa` (
  `Course Title` int(50) NOT NULL,
  `Grade` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `registercompleteinformationofstudent`
--

CREATE TABLE `registercompleteinformationofstudent` (
  `Student_ID` varchar(250) NOT NULL,
  `Name` varchar(250) NOT NULL,
  `FName` varchar(250) NOT NULL,
  `Cnic` varchar(250) NOT NULL,
  `DateOfBirth` varchar(250) NOT NULL,
  `Email` varchar(250) NOT NULL,
  `Contact` int(250) NOT NULL,
  `Address` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `registercompleteinformationofstudent`
--

INSERT INTO `registercompleteinformationofstudent` (`Student_ID`, `Name`, `FName`, `Cnic`, `DateOfBirth`, `Email`, `Contact`, `Address`) VALUES
('bse203022', 'Osaf', 'Zaka', '38403-2236888-1', '29-4-2002', 'osafahmed6723@gmail.com', 3880663, 'Sargodha');

-- --------------------------------------------------------

--
-- Table structure for table `registerforlogin`
--

CREATE TABLE `registerforlogin` (
  `Name` varchar(250) NOT NULL,
  `FName` varchar(250) NOT NULL,
  `CNIC` varchar(250) NOT NULL,
  `DateOfBirth` varchar(250) NOT NULL,
  `Username` varchar(250) NOT NULL,
  `Email` varchar(250) NOT NULL,
  `Password` varchar(250) NOT NULL,
  `RePassword` varchar(250) NOT NULL,
  `UserCato` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `registerforlogin`
--

INSERT INTO `registerforlogin` (`Name`, `FName`, `CNIC`, `DateOfBirth`, `Username`, `Email`, `Password`, `RePassword`, `UserCato`) VALUES
('Osaf', 'Zaka', '64564-43543-345', '23/5-2022', 'osaf106', 'osafahmed343@g.com', '123', '123', ''),
('Ali', 'Osaf', '348834-34-334', '12-2-2023', 'ali106', 'ali@106gmail.com', 'sial106', 'sial106', 'Admin'),
('osaf', 'zaka', '324234', '324', 'osaf106', 'osafasdasd', 'sial2106', 'sial2106', 'Student');

-- --------------------------------------------------------

--
-- Table structure for table `student_record`
--

CREATE TABLE `student_record` (
  `Name` varchar(10) NOT NULL,
  `Roll No` int(10) NOT NULL,
  `GPA` int(10) NOT NULL,
  `Program` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student_record`
--

INSERT INTO `student_record` (`Name`, `Roll No`, `GPA`, `Program`) VALUES
('Usman', 30, 4, 'SE');

-- --------------------------------------------------------

--
-- Table structure for table `student_record_gpa`
--

CREATE TABLE `student_record_gpa` (
  `Course Title` text NOT NULL,
  `Grade` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student_record_gpa`
--

INSERT INTO `student_record_gpa` (`Course Title`, `Grade`) VALUES
('Artificial Intelligence', 'A'),
('Data Science', 'A'),
('Software Quality Engineer', 'A'),
('Software Const & Develop ', 'A');

-- --------------------------------------------------------

--
-- Table structure for table `teacher_t1`
--

CREATE TABLE `teacher_t1` (
  `Degree` text NOT NULL,
  `Institution` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teacher_t1`
--

INSERT INTO `teacher_t1` (`Degree`, `Institution`) VALUES
('MS', 'Cust'),
('BS (CS)', 'Cust');

-- --------------------------------------------------------

--
-- Table structure for table `teacher_t2`
--

CREATE TABLE `teacher_t2` (
  `Degree` text NOT NULL,
  `Institution` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teacher_t2`
--

INSERT INTO `teacher_t2` (`Degree`, `Institution`) VALUES
('MPhil (CS)', 'Quaid-I-Azam University'),
('BS (SE)', 'University Faisalabad');

-- --------------------------------------------------------

--
-- Table structure for table `teacher_t3`
--

CREATE TABLE `teacher_t3` (
  `Degree` text NOT NULL,
  `Institution` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teacher_t3`
--

INSERT INTO `teacher_t3` (`Degree`, `Institution`) VALUES
('PhD (SE)', 'MAJU'),
('MS (SE)', 'NUST'),
('MSc (CS)', 'QAU'),
('BSc (physics)', 'PU');

-- --------------------------------------------------------

--
-- Table structure for table `tests`
--

CREATE TABLE `tests` (
  `Activity` varchar(10) NOT NULL,
  `Obtained Marks` int(10) NOT NULL,
  `Total Marks` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tests`
--

INSERT INTO `tests` (`Activity`, `Obtained Marks`, `Total Marks`) VALUES
('Test 1', 8, 10),
('Test 2', 9, 10),
('Test 3', 9, 10),
('Test 4', 5, 10),
('Test 5', 10, 10);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
