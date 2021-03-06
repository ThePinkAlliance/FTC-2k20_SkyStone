package org.firstinspires.ftc.PinkCode.Subsystems;

import org.firstinspires.ftc.PinkCode.OpModes.Teleop;
import org.firstinspires.ftc.PinkCode.Robot.Hardware;

// Class Which Defines Variables Used in Other Subsystems and Sets Powers and Commands for Teleop/Auto
public abstract class Subsystem extends Teleop {
    // Define Class Members
    public static Hardware robot = new Hardware();
    static double front_left_wheel_command;
    static double back_left_wheel_command;
    static double front_right_wheel_command;
    static double back_right_wheel_command;
    static double collect_command_right;
    static double collect_command_left;
    static double lift_command;
    static double lift_target_position;
    static double lift_error;
    static double lift_speed;
    static double previous_lift_position;
    static double lift_hold_position;
    static double score_target_position;
    static double score_collect_position;
    static double hook_left_target_position;
    static double hook_right_target_position;
    static double score_cap_position;
    static double left_arm_command;
    static double right_arm_command;
    static double scoreR_rotate_command;
    static double scoreL_rotate_command;
    static double sideClaw_rotate_pos;
    static double sideFlap_rotate_pos;

    // Method Which Sends the Motor Powers to the Motors
    public static void set_motor_powers() {
        // Set Motor Powers
        robot.rightF_drive.setPower(Subsystem.front_right_wheel_command);
        robot.rightB_drive.setPower(Subsystem.back_right_wheel_command);
        robot.leftF_drive.setPower(Subsystem.front_left_wheel_command);
        robot.leftB_drive.setPower(Subsystem.back_left_wheel_command);
        robot.collect_right.setPower(Subsystem.collect_command_right);
        robot.collect_left.setPower(Subsystem.collect_command_left);
        robot.right_lift.setPower(lift_command);
        robot.left_lift.setPower(lift_command);
    }

    // Method Which Sends the Servo Positions to the Servos
    public static void set_servo_positions() {
        // Set Servo Positions
//        robot.scorer_rotate.setPosition(score_target_position);
        robot.sideClaw.setPosition(sideClaw_rotate_pos);
        robot.sideFlap.setPosition(sideFlap_rotate_pos);
        robot.scorerR_rotate.setPosition(scoreR_rotate_command);
        robot.scorerL_rotate.setPosition(scoreL_rotate_command);
        robot.scorer_collect.setPosition(score_collect_position);
        robot.left_hook.setPosition(hook_left_target_position);
        robot.right_hook.setPosition(hook_right_target_position);
        robot.cap_hook.setPosition(score_cap_position);
    }

}