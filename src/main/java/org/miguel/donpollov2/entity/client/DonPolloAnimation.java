//package org.miguel.donpollov2.entity.client;
//
//import software.bernie.geckolib.core.animation.Animation;
//import software.bernie.geckolib.core.keyframe.Keyframe;
//
//
//public class DonPolloAnimation {
//
//    public static final Animation NPC_STEVE_WALK = Animation.Builder.create(1f).looping()
//            .addBoneAnimation("leftArm",
//                    new Transformation(Transformation.Targets.ROTATE,
//                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR),
//                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(-60f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR),
//                            new Keyframe(0.75f, AnimationHelper.createRotationalVector(60f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR),
//                            new Keyframe(1f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR)))
//            .addBoneAnimation("rightArm",
//                    new Transformation(Transformation.Targets.ROTATE,
//                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR),
//                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(60f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR),
//                            new Keyframe(0.75f, AnimationHelper.createRotationalVector(-60f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR),
//                            new Keyframe(1f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR)))
//            .addBoneAnimation("leftLeg",
//                    new Transformation(Transformation.Targets.ROTATE,
//                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR),
//                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(60f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR),
//                            new Keyframe(0.75f, AnimationHelper.createRotationalVector(-60f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR),
//                            new Keyframe(1f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR)))
//            .addBoneAnimation("rightLeg",
//                    new Transformation(Transformation.Targets.ROTATE,
//                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR),
//                            new Keyframe(0.25f, AnimationHelper.createRotationalVector(-60f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR),
//                            new Keyframe(0.75f, AnimationHelper.createRotationalVector(60f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR),
//                            new Keyframe(1f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR)))
//            .addBoneAnimation("rightPants",
//                    new Transformation(Transformation.Targets.ROTATE,
//                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR))).build();
//    public static final Animation NPC_STEVE_IDLE = Animation.Builder.create(0.08333f).looping()
//            .addBoneAnimation("body",
//                    new Transformation(Transformation.Targets.TRANSLATE,
//                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR),
//                            new Keyframe(0.04167f, AnimationHelper.createTranslationalVector(0f, -1f, 4f),
//                                    Transformation.Interpolations.LINEAR)))
//            .addBoneAnimation("body",
//                    new Transformation(Transformation.Targets.ROTATE,
//                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR),
//                            new Keyframe(0.04167f, AnimationHelper.createRotationalVector(-20f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR)))
//            .addBoneAnimation("leftArm",
//                    new Transformation(Transformation.Targets.TRANSLATE,
//                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR),
//                            new Keyframe(0.04167f, AnimationHelper.createTranslationalVector(0f, -3f, 0f),
//                                    Transformation.Interpolations.LINEAR),
//                            new Keyframe(0.08333f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR)))
//            .addBoneAnimation("leftArm",
//                    new Transformation(Transformation.Targets.ROTATE,
//                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR),
//                            new Keyframe(0.04167f, AnimationHelper.createRotationalVector(-135.44f, 7.05f, -7.11f),
//                                    Transformation.Interpolations.LINEAR),
//                            new Keyframe(0.08333f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR)))
//            .addBoneAnimation("rightArm",
//                    new Transformation(Transformation.Targets.TRANSLATE,
//                            new Keyframe(0f, AnimationHelper.createTranslationalVector(0f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR),
//                            new Keyframe(0.04167f, AnimationHelper.createTranslationalVector(0f, 0f, -2f),
//                                    Transformation.Interpolations.LINEAR)))
//            .addBoneAnimation("rightArm",
//                    new Transformation(Transformation.Targets.ROTATE,
//                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR),
//                            new Keyframe(0.04167f, AnimationHelper.createRotationalVector(-17.5f, 0f, -17.5f),
//                                    Transformation.Interpolations.LINEAR),
//                            new Keyframe(0.08333f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR)))
//            .addBoneAnimation("rightSleeve",
//                    new Transformation(Transformation.Targets.ROTATE,
//                            new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR),
//                            new Keyframe(0.04167f, AnimationHelper.createRotationalVector(-12.5f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR),
//                            new Keyframe(0.08333f, AnimationHelper.createRotationalVector(0f, 0f, 0f),
//                                    Transformation.Interpolations.LINEAR)))
//            .addBoneAnimation("jacket",
//                    new Transformation(Transformation.Targets.ROTATE,
//                            new Keyframe(0f, AnimationHelper.createRotationalVector(-0.09f, -0.09f, 0f),
//                                    Transformation.Interpolations.LINEAR))).build();
//}
