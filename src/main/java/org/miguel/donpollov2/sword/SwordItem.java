    package org.miguel.donpollov2.sword;

    import net.minecraft.item.Item;
    import net.minecraft.item.ToolMaterial;

    public class SwordItem extends Item {



        private final ToolMaterial material;
        private final float attackDamage;
        private final float attackSpeed;

        public SwordItem(ToolMaterial toolMaterial,float attackDamage,float attackSpeed, Settings settings) {
            super(settings);
            this.material = toolMaterial;
            this.attackDamage = attackDamage + toolMaterial.attackDamageBonus();
            this.attackSpeed = attackSpeed;
        }

    }









