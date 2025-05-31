package org.miguel.donpollov2.entity.custom;

import net.minecraft.entity.AnimationState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.miguel.donpollov2.items.ModItems;

public class DonPolloEntity extends PathAwareEntity {


    public final AnimationState idleAnimationState = new AnimationState();
    private int animationStateTimeout=0;

    public DonPolloEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }


    @Override
    protected void initGoals() {
        this.goalSelector.add(0,new SwimGoal(this)); // para que el mob nade
        this.goalSelector.add(1,new TemptGoal(this,1.25D, Ingredient.ofItems(ModItems.DON_POLLO_MINERAL),false)); // sigue al jugador si sostiene el mineral de donpollo
        this.goalSelector.add(2,new WanderAroundGoal(this,1.0D)); // camina aleatoriamente
        this.goalSelector.add(3,new LookAtEntityGoal(this, PlayerEntity.class,4.0F)); // mira al jugador
        this.goalSelector.add(4, new LookAroundGoal(this));// mira sin objetivo alguno

    }

    public static DefaultAttributeContainer.Builder createAttributes(){
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.MAX_HEALTH,20)
                .add(EntityAttributes.MOVEMENT_SPEED,0.35)
                .add(EntityAttributes.ATTACK_DAMAGE,1)
                .add(EntityAttributes.FOLLOW_RANGE,20);


    }

    private void setupAnimationState(){
        if (this.animationStateTimeout<=0){
            this.animationStateTimeout=40;
            this.idleAnimationState.start(this.age);
        }else{
                --this.animationStateTimeout;
        }
    }

    public void tick(){
        super.tick();
        if (this.getWorld().isClient()){
            this.setupAnimationState();
        }
    }

}
