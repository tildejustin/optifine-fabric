package net.optifine.mixin;

import net.minecraft.block.*;
import net.minecraft.client.BlockRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@SuppressWarnings("OverwriteAuthorRequired")
@Mixin(BlockRenderer.class)
public abstract class BlockRendererMixin {
    @Shadow
    public BlockView world;

    @Shadow
    public abstract boolean renderCube(Block block, int x, int y, int z);

    @Shadow
    public abstract boolean renderPillar(Block block, int x, int y, int z);

    @Shadow
    public abstract boolean renderFluid(Block block, int x, int y, int z);

    @Shadow
    public abstract boolean renderCactus(Block block, int x, int y, int z);

    @Shadow
    public abstract boolean renderCross(Block block, int x, int y, int z);

    @Shadow
    public abstract boolean renderStem(Block block, int x, int y, int z);

    @Shadow
    public abstract boolean renderLilyPad(Block block, int x, int y, int z);

    @Shadow
    public abstract boolean renderCrop(Block block, int x, int y, int z);

    @Shadow
    public abstract boolean renderTorch(Block block, int x, int y, int z);

    @Shadow
    public abstract boolean renderFire(Block block, int x, int y, int z);

    @Shadow
    public abstract boolean renderRedstone(Block block, int x, int y, int z);

    @Shadow
    public abstract boolean renderLadder(Block block, int x, int y, int z);

    @Shadow
    public abstract boolean renderDoor(Block block, int x, int y, int z);

    @Shadow
    public abstract boolean renderRail(RailBlock block, int x, int y, int z);

    @Shadow
    public abstract boolean renderStairs(Block block, int x, int y, int z);

    @Shadow
    public abstract boolean renderDragonEgg(DragonEggBlock block, int x, int y, int z);

    @Shadow
    public abstract boolean renderFence(FenceBlock fence, int x, int y, int z);

    @Shadow
    public abstract boolean renderLever(Block block, int i, int j, int k);

    @Shadow
    public abstract boolean renderTripwireHook(Block block, int x, int y, int z);

    @Shadow
    public abstract boolean renderTripwire(Block block, int x, int y, int z);

    @Shadow
    protected abstract boolean renderBed(Block block, int x, int y, int z);

    @Shadow
    protected abstract boolean renderRepeater(Block block, int x, int y, int z);

    @Shadow
    protected abstract boolean renderPiston(Block block, int x, int y, int z, boolean bl);

    @Shadow
    protected abstract boolean renderPistonHead(Block block, int x, int y, int z, boolean bl);

    @Shadow
    public abstract boolean renderPane(PaneBlock block, int x, int y, int z);

    @Shadow
    public abstract boolean renderVines(Block block, int x, int y, int z);

    @Shadow
    public abstract boolean renderFenceGate(FenceGateBlock block, int x, int y, int z);

    @Shadow
    protected abstract boolean renderCauldron(CauldronBlock block, int x, int y, int z);

    @Shadow
    protected abstract boolean renderBrewingStand(BrewingStandBlock block, int x, int y, int z);

    @Shadow
    protected abstract boolean renderEndPortalFrame(Block block, int x, int y, int z);

    @Shadow
    protected abstract boolean renderCocoa(CocoaBlock block, int x, int y, int z);

    @Shadow
    private float field_2060;

    @Shadow
    private float field_2061;

    @Shadow
    private float field_2062;

    @Shadow
    private float field_2063;

    @Shadow
    private float field_2064;

    @Shadow
    private float field_2065;

    @Shadow
    private boolean field_2009;

    @Shadow
    private boolean field_2018;

    @Shadow
    private boolean field_2013;

    @Shadow
    private boolean field_2015;

    @Shadow
    private boolean field_2010;

    @Shadow
    private boolean field_2019;

    @Shadow
    private boolean field_2012;

    @Shadow
    private boolean field_2014;

    @Shadow
    private boolean field_2011;

    @Shadow
    private boolean field_2008;

    @Shadow
    private boolean field_2020;

    @Shadow
    private boolean field_2016;

    @Shadow
    private boolean field_2058;

    @Shadow
    private int field_2033;

    @Shadow
    private int field_2049;

    @Shadow
    private boolean field_2051;

    @Shadow
    private int field_1998;

    @Shadow
    private int field_2000;

    @Shadow
    private int field_2001;

    @Shadow
    private int field_2003;

    @Shadow
    private float field_2067;

    @Shadow
    private float field_2069;

    @Shadow
    private float field_2070;

    @Shadow
    private float field_1983;

    @Shadow
    private float field_2066;

    @Shadow
    private int field_1997;

    @Shadow
    private float field_2068;

    @Shadow
    private int field_1999;

    @Shadow
    private float field_2071;

    @Shadow
    private int field_2002;

    @Shadow
    private float field_1984;

    @Shadow
    private int field_2004;

    @Shadow
    private int field_2034;

    @Shadow
    private int field_2037;

    @Shadow
    private int field_2036;

    @Shadow
    private int field_2035;

    @Shadow
    protected abstract int method_1433(int i, int j, int k, int l);

    @Shadow
    private float field_2038;

    @Shadow
    private float field_2042;

    @Shadow
    private float field_2046;

    @Shadow
    private float field_2039;

    @Shadow
    private float field_2040;

    @Shadow
    private float field_2044;

    @Shadow
    private float field_2006;

    @Shadow
    private float field_2005;

    @Shadow
    private float field_2043;

    @Shadow
    private float field_2041;

    @Shadow
    private float field_2045;

    @Shadow
    private float field_2007;

    @Shadow
    public abstract void method_1444(Block block, double d, double e, double f, int i);

    @Shadow
    private int field_2022;

    @Shadow
    private int field_2026;

    @Shadow
    private int field_2024;

    @Shadow
    private int field_2027;

    @Shadow
    private float field_1986;

    @Shadow
    private float field_1990;

    @Shadow
    private float field_1988;

    @Shadow
    private float field_1991;

    @Shadow
    private float field_1985;

    @Shadow
    private int field_2021;

    @Shadow
    private float field_1989;

    @Shadow
    private int field_2025;

    @Shadow
    private float field_1987;

    @Shadow
    private int field_2023;

    @Shadow
    private float field_1992;

    @Shadow
    private int field_2028;

    @Shadow
    public abstract void method_1456(Block block, double d, double e, double f, int i);

    @Shadow
    private float field_1993;

    @Shadow
    private float field_1994;

    @Shadow
    private int field_2029;

    @Shadow
    private int field_2030;

    @Shadow
    public abstract void method_1461(Block block, double d, double e, double f, int i);

    @Shadow
    public static boolean field_2047;

    @Shadow
    private float field_1995;

    @Shadow
    private float field_1996;

    @Shadow
    private int field_2031;

    @Shadow
    private int field_2032;

    @Shadow
    public abstract void method_1465(Block block, double d, double e, double f, int i);

    @Shadow
    public abstract void method_1468(Block block, double d, double e, double f, int i);

    @Shadow
    public abstract void method_1470(Block block, double d, double e, double f, int i);

    @Unique
    private boolean aoLightValuesCalculated;

    @Unique
    private float aoLightValueOpaque = 0.2F;

    @Inject(method = "<init>(Lnet/minecraft/world/BlockView;)V", at = @At("TAIL"))
    private void initNewFriends(CallbackInfo ci) {
        float aoLevel = 1;
        this.aoLightValueOpaque = 1 - aoLevel * .8f;
    }

    @Overwrite
    public boolean render(Block block, int x, int y, int z) {
        int var5 = block.getBlockType();
        block.onRender(this.world, x, y, z);
        // @formatter:off
        return var5 == 0
                ? this.renderCube(block, x, y, z)
                : (
                var5 == 31
                        ? this.renderPillar(block, x, y, z)
                        : (
                        var5 == 4
                                ? this.renderFluid(block, x, y, z)
                                : (
                                var5 == 13
                                        ? this.renderCactus(block, x, y, z)
                                        : (
                                        var5 == 1
                                                ? this.renderCross(block, x, y, z)
                                                : (
                                                var5 == 19
                                                        ? this.renderStem(block, x, y, z)
                                                        : (
                                                        var5 == 23
                                                                ? this.renderLilyPad(block, x, y, z)
                                                                : (
                                                                var5 == 6
                                                                        ? this.renderCrop(block, x, y, z)
                                                                        : (
                                                                        var5 == 2
                                                                                ? this.renderTorch(block, x, y, z)
                                                                                : (
                                                                                var5 == 3
                                                                                        ? this.renderFire(block, x, y, z)
                                                                                        : (
                                                                                        var5 == 5
                                                                                                ? this.renderRedstone(block, x, y, z)
                                                                                                : (
                                                                                                var5 == 8
                                                                                                        ? this.renderLadder(block, x, y, z)
                                                                                                        : (
                                                                                                        var5 == 7
                                                                                                                ? this.renderDoor(block, x, y, z)
                                                                                                                : (
                                                                                                                var5 == 9
                                                                                                                        ? this.renderRail((RailBlock) block, x, y, z)
                                                                                                                        : (
                                                                                                                        var5 == 10
                                                                                                                                ? this.renderStairs(block, x, y, z)
                                                                                                                                : (
                                                                                                                                var5 == 27
                                                                                                                                        ? this.renderDragonEgg((DragonEggBlock) block, x, y, z)
                                                                                                                                        : (
                                                                                                                                        var5 == 11
                                                                                                                                                ? this.renderFence((FenceBlock) block, x, y, z)
                                                                                                                                                : (
                                                                                                                                                var5 == 12
                                                                                                                                                        ? this.renderLever(block, x, y, z)
                                                                                                                                                        : (
                                                                                                                                                        var5 == 29
                                                                                                                                                                ? this.renderTripwireHook(block, x, y, z)
                                                                                                                                                                : (
                                                                                                                                                                var5 == 30
                                                                                                                                                                        ? this.renderTripwire(block, x, y, z)
                                                                                                                                                                        : (
                                                                                                                                                                        var5 == 14
                                                                                                                                                                                ? this.renderBed(block, x, y, z)
                                                                                                                                                                                : (
                                                                                                                                                                                var5 == 15
                                                                                                                                                                                        ? this.renderRepeater(block, x, y, z)
                                                                                                                                                                                        : (
                                                                                                                                                                                        var5 == 16
                                                                                                                                                                                                ? this.renderPiston(block, x, y, z, false)
                                                                                                                                                                                                : (
                                                                                                                                                                                                var5 == 17
                                                                                                                                                                                                        ? this.renderPistonHead(block, x, y, z, true)
                                                                                                                                                                                                        : (
                                                                                                                                                                                                        var5 == 18
                                                                                                                                                                                                                ? this.renderPane((PaneBlock) block, x, y, z)
                                                                                                                                                                                                                : (
                                                                                                                                                                                                                var5 == 20
                                                                                                                                                                                                                        ? this.renderVines(block, x, y, z)
                                                                                                                                                                                                                        : (
                                                                                                                                                                                                                        var5 == 21
                                                                                                                                                                                                                                ? this.renderFenceGate((FenceGateBlock) block, x, y, z)
                                                                                                                                                                                                                                : (
                                                                                                                                                                                                                                var5 == 24
                                                                                                                                                                                                                                        ? this.renderCauldron((CauldronBlock) block, x, y, z)
                                                                                                                                                                                                                                        : (
                                                                                                                                                                                                                                        var5 == 25
                                                                                                                                                                                                                                                ? this.renderBrewingStand((BrewingStandBlock) block, x, y, z)
                                                                                                                                                                                                                                                : (
                                                                                                                                                                                                                                                var5 == 26
                                                                                                                                                                                                                                                        ? this.renderEndPortalFrame(block, x, y, z)
                                                                                                                                                                                                                                                        : (
                                                                                                                                                                                                                                                        var5 == 28
                                                                                                                                                                                                                                                                ? this.renderCocoa(
                                                                                                                                                                                                                                                                (CocoaBlock) block, x, y, z)
                                                                                                                                                                                                                                                                : false
                                                                                                                                                                                                                                                )
                                                                                                                                                                                                                                        )
                                                                                                                                                                                                                                )
                                                                                                                                                                                                                        )
                                                                                                                                                                                                                )
                                                                                                                                                                                                        )
                                                                                                                                                                                                )
                                                                                                                                                                                        )
                                                                                                                                                                                )
                                                                                                                                                                        )
                                                                                                                                                                )
                                                                                                                                                        )
                                                                                                                                                )
                                                                                                                                        )
                                                                                                                                )
                                                                                                                        )
                                                                                                                )
                                                                                                        )
                                                                                                )
                                                                                        )
                                                                                )
                                                                        )
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );
        // @formatter:on
    }

    @Overwrite
    public static boolean method_1455(int i) {
        // @formatter:off
        return i == 0
                || i == 31
                || i == 13
                || i == 10
                || i == 11
                || i == 27
                || i == 22
                || i == 21
                || i == 16
                || i == 26;
        // @formatter:on
    }

    @Unique
    private void calculateAoLightValues(Block block, int x, int y, int z) {
        this.field_2060 = this.getAmbientOcclusionLightValue(this.world, x - 1, y, z);
        this.field_2061 = this.getAmbientOcclusionLightValue(this.world, x, y - 1, z);
        this.field_2062 = this.getAmbientOcclusionLightValue(this.world, x, y, z - 1);
        this.field_2063 = this.getAmbientOcclusionLightValue(this.world, x + 1, y, z);
        this.field_2064 = this.getAmbientOcclusionLightValue(this.world, x, y + 1, z);
        this.field_2065 = this.getAmbientOcclusionLightValue(this.world, x, y, z + 1);
        this.field_2009 = Block.field_495[this.world.getBlock(x + 1, y + 1, z)];
        this.field_2018 = Block.field_495[this.world.getBlock(x + 1, y - 1, z)];
        this.field_2013 = Block.field_495[this.world.getBlock(x + 1, y, z + 1)];
        this.field_2015 = Block.field_495[this.world.getBlock(x + 1, y, z - 1)];
        this.field_2010 = Block.field_495[this.world.getBlock(x - 1, y + 1, z)];
        this.field_2019 = Block.field_495[this.world.getBlock(x - 1, y - 1, z)];
        this.field_2012 = Block.field_495[this.world.getBlock(x - 1, y, z - 1)];
        this.field_2014 = Block.field_495[this.world.getBlock(x - 1, y, z + 1)];
        this.field_2011 = Block.field_495[this.world.getBlock(x, y + 1, z + 1)];
        this.field_2008 = Block.field_495[this.world.getBlock(x, y + 1, z - 1)];
        this.field_2020 = Block.field_495[this.world.getBlock(x, y - 1, z + 1)];
        this.field_2016 = Block.field_495[this.world.getBlock(x, y - 1, z - 1)];
        this.aoLightValuesCalculated = true;
    }

    @Unique
    private float getAmbientOcclusionLightValue(BlockView blockView, int x, int y, int z) {
        Block block = Block.BLOCKS[blockView.getBlock(x, y, z)];
        if (block == null) {
            return 1.0F;
        } else if (block.getClass() == GrassBlock.class) {
            return 1.0F;
        } else {
            return block.material.blocksMovement() && block.renderAsNormalBlock() ? this.aoLightValueOpaque : 1.0F;
        }
    }

    @Unique
    private final double diff = 3.90625E-5;

    @Redirect(method = "renderFluid", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/Tessellator;vertex(DDDDD)V", ordinal = 0))
    private void addDiff1(Tessellator instance, double x, double y, double z, double u, double v) {
        instance.vertex(x, y, z, u + diff, v + diff);
    }

    @Redirect(method = "renderFluid", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/Tessellator;vertex(DDDDD)V", ordinal = 1))
    private void addDiff2(Tessellator instance, double x, double y, double z, double u, double v) {
        instance.vertex(x, y, z, u + diff, v - diff);
    }

    @Redirect(method = "renderFluid", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/Tessellator;vertex(DDDDD)V", ordinal = 2))
    private void addDiff3(Tessellator instance, double x, double y, double z, double u, double v) {
        instance.vertex(x, y, z, u - diff, v - diff);
    }

    @Redirect(method = "renderFluid", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/Tessellator;vertex(DDDDD)V", ordinal = 3))
    private void addDiff4(Tessellator instance, double x, double y, double z, double u, double v) {
        instance.vertex(x, y, z, u - diff, v + diff);
    }

    @SuppressWarnings("DuplicatedCode")
    @Overwrite
    public boolean renderCubeAO(Block block, int x, int y, int z, float r, float g, float b) {
        this.field_2058 = true;
        if (block.getClass() == GrassBlock.class) {
            this.field_2033 = 0;
        } else {
            this.field_2033 = 1;
        }

        boolean flag = false;
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = true;
        boolean flag4 = true;
        boolean flag5 = true;
        boolean flag6 = true;
        this.aoLightValuesCalculated = false;
        int i = block.getLight(this.world, x, y, z);
        Tessellator tessellator = Tessellator.INSTANCE;
        tessellator.setLight(983055);
        if (block.field_439 == 3) {
            flag6 = false;
            flag5 = false;
            flag4 = false;
            flag3 = false;
            flag1 = false;
        }

        if (this.field_2049 >= 0) {
            flag6 = false;
            flag5 = false;
            flag4 = false;
            flag3 = false;
            flag1 = false;
        }

        if (this.field_2051 || block.shouldRenderSide(this.world, x, y - 1, z, 0)) {
            if (!this.aoLightValuesCalculated) {
                this.calculateAoLightValues(block, x, y, z);
            }

            int k = i;
            if (block.boundingBoxMinY <= 0.0) {
                k = block.getLight(this.world, x, y - 1, z);
            }

            float f1;
            float f8;
            float f15;
            float f22;
            if (this.field_2033 > 0) {
                if (block.boundingBoxMinY <= 0.0) {
                    y--;
                }

                this.field_1998 = block.getLight(this.world, x - 1, y, z);
                this.field_2000 = block.getLight(this.world, x, y, z - 1);
                this.field_2001 = block.getLight(this.world, x, y, z + 1);
                this.field_2003 = block.getLight(this.world, x + 1, y, z);
                this.field_2067 = this.getAmbientOcclusionLightValue(this.world, x - 1, y, z);
                this.field_2069 = this.getAmbientOcclusionLightValue(this.world, x, y, z - 1);
                this.field_2070 = this.getAmbientOcclusionLightValue(this.world, x, y, z + 1);
                this.field_1983 = this.getAmbientOcclusionLightValue(this.world, x + 1, y, z);
                if (!this.field_2016 && !this.field_2019) {
                    this.field_2066 = this.field_2067;
                    this.field_1997 = this.field_1998;
                } else {
                    this.field_2066 = this.getAmbientOcclusionLightValue(this.world, x - 1, y, z - 1);
                    this.field_1997 = block.getLight(this.world, x - 1, y, z - 1);
                }

                if (!this.field_2020 && !this.field_2019) {
                    this.field_2068 = this.field_2067;
                    this.field_1999 = this.field_1998;
                } else {
                    this.field_2068 = this.getAmbientOcclusionLightValue(this.world, x - 1, y, z + 1);
                    this.field_1999 = block.getLight(this.world, x - 1, y, z + 1);
                }

                if (!this.field_2016 && !this.field_2018) {
                    this.field_2071 = this.field_1983;
                    this.field_2002 = this.field_2003;
                } else {
                    this.field_2071 = this.getAmbientOcclusionLightValue(this.world, x + 1, y, z - 1);
                    this.field_2002 = block.getLight(this.world, x + 1, y, z - 1);
                }

                if (!this.field_2020 && !this.field_2018) {
                    this.field_1984 = this.field_1983;
                    this.field_2004 = this.field_2003;
                } else {
                    this.field_1984 = this.getAmbientOcclusionLightValue(this.world, x + 1, y, z + 1);
                    this.field_2004 = block.getLight(this.world, x + 1, y, z + 1);
                }

                if (block.boundingBoxMinY <= 0.0) {
                    y++;
                }

                f1 = (this.field_2068 + this.field_2067 + this.field_2070 + this.field_2061) / 4.0F;
                f22 = (this.field_2070 + this.field_2061 + this.field_1984 + this.field_1983) / 4.0F;
                f15 = (this.field_2061 + this.field_2069 + this.field_1983 + this.field_2071) / 4.0F;
                f8 = (this.field_2067 + this.field_2066 + this.field_2061 + this.field_2069) / 4.0F;
                this.field_2034 = this.method_1433(this.field_1999, this.field_1998, this.field_2001, k);
                this.field_2037 = this.method_1433(this.field_2001, this.field_2004, this.field_2003, k);
                this.field_2036 = this.method_1433(this.field_2000, this.field_2003, this.field_2002, k);
                this.field_2035 = this.method_1433(this.field_1998, this.field_1997, this.field_2000, k);
            } else {
                f22 = this.field_2061;
                f15 = this.field_2061;
                f8 = this.field_2061;
                f1 = this.field_2061;
                this.field_2034 = this.field_2035 = this.field_2036 = this.field_2037 = k;
            }

            this.field_2038 = this.field_2039 = this.field_2040 = this.field_2041 = (flag1 ? r : 1.0F) * 0.5F;
            this.field_2042 = this.field_2043 = this.field_2044 = this.field_2045 = (flag1 ? g : 1.0F) * 0.5F;
            this.field_2046 = this.field_2005 = this.field_2006 = this.field_2007 = (flag1 ? b : 1.0F) * 0.5F;
            this.field_2038 *= f1;
            this.field_2042 *= f1;
            this.field_2046 *= f1;
            this.field_2039 *= f8;
            this.field_2043 *= f8;
            this.field_2005 *= f8;
            this.field_2040 *= f15;
            this.field_2044 *= f15;
            this.field_2006 *= f15;
            this.field_2041 *= f22;
            this.field_2045 *= f22;
            this.field_2007 *= f22;
            this.method_1444(block, x, y, z, block.method_439(this.world, x, y, z, 0));
            flag = true;
        }

        if (this.field_2051 || block.shouldRenderSide(this.world, x, y + 1, z, 1)) {
            if (!this.aoLightValuesCalculated) {
                this.calculateAoLightValues(block, x, y, z);
            }

            int j1 = i;
            if (block.boundingBoxMaxY >= 1.0) {
                j1 = block.getLight(this.world, x, y + 1, z);
            }

            float f2;
            float f9;
            float f16;
            float f23;
            if (this.field_2033 > 0) {
                if (block.boundingBoxMaxY >= 1.0) {
                    y++;
                }

                this.field_2022 = block.getLight(this.world, x - 1, y, z);
                this.field_2026 = block.getLight(this.world, x + 1, y, z);
                this.field_2024 = block.getLight(this.world, x, y, z - 1);
                this.field_2027 = block.getLight(this.world, x, y, z + 1);
                this.field_1986 = this.getAmbientOcclusionLightValue(this.world, x - 1, y, z);
                this.field_1990 = this.getAmbientOcclusionLightValue(this.world, x + 1, y, z);
                this.field_1988 = this.getAmbientOcclusionLightValue(this.world, x, y, z - 1);
                this.field_1991 = this.getAmbientOcclusionLightValue(this.world, x, y, z + 1);
                if (!this.field_2008 && !this.field_2010) {
                    this.field_1985 = this.field_1986;
                    this.field_2021 = this.field_2022;
                } else {
                    this.field_1985 = this.getAmbientOcclusionLightValue(this.world, x - 1, y, z - 1);
                    this.field_2021 = block.getLight(this.world, x - 1, y, z - 1);
                }

                if (!this.field_2008 && !this.field_2009) {
                    this.field_1989 = this.field_1990;
                    this.field_2025 = this.field_2026;
                } else {
                    this.field_1989 = this.getAmbientOcclusionLightValue(this.world, x + 1, y, z - 1);
                    this.field_2025 = block.getLight(this.world, x + 1, y, z - 1);
                }

                if (!this.field_2011 && !this.field_2010) {
                    this.field_1987 = this.field_1986;
                    this.field_2023 = this.field_2022;
                } else {
                    this.field_1987 = this.getAmbientOcclusionLightValue(this.world, x - 1, y, z + 1);
                    this.field_2023 = block.getLight(this.world, x - 1, y, z + 1);
                }

                if (!this.field_2011 && !this.field_2009) {
                    this.field_1992 = this.field_1990;
                    this.field_2028 = this.field_2026;
                } else {
                    this.field_1992 = this.getAmbientOcclusionLightValue(this.world, x + 1, y, z + 1);
                    this.field_2028 = block.getLight(this.world, x + 1, y, z + 1);
                }

                if (block.boundingBoxMaxY >= 1.0) {
                    y--;
                }

                f23 = (this.field_1987 + this.field_1986 + this.field_1991 + this.field_2064) / 4.0F;
                f2 = (this.field_1991 + this.field_2064 + this.field_1992 + this.field_1990) / 4.0F;
                f9 = (this.field_2064 + this.field_1988 + this.field_1990 + this.field_1989) / 4.0F;
                f16 = (this.field_1986 + this.field_1985 + this.field_2064 + this.field_1988) / 4.0F;
                this.field_2037 = this.method_1433(this.field_2023, this.field_2022, this.field_2027, j1);
                this.field_2034 = this.method_1433(this.field_2027, this.field_2028, this.field_2026, j1);
                this.field_2035 = this.method_1433(this.field_2024, this.field_2026, this.field_2025, j1);
                this.field_2036 = this.method_1433(this.field_2022, this.field_2021, this.field_2024, j1);
            } else {
                f23 = this.field_2064;
                f16 = this.field_2064;
                f9 = this.field_2064;
                f2 = this.field_2064;
                this.field_2034 = this.field_2035 = this.field_2036 = this.field_2037 = j1;
            }

            this.field_2038 = this.field_2039 = this.field_2040 = this.field_2041 = flag2 ? r : 1.0F;
            this.field_2042 = this.field_2043 = this.field_2044 = this.field_2045 = flag2 ? g : 1.0F;
            this.field_2046 = this.field_2005 = this.field_2006 = this.field_2007 = flag2 ? b : 1.0F;
            this.field_2038 *= f2;
            this.field_2042 *= f2;
            this.field_2046 *= f2;
            this.field_2039 *= f9;
            this.field_2043 *= f9;
            this.field_2005 *= f9;
            this.field_2040 *= f16;
            this.field_2044 *= f16;
            this.field_2006 *= f16;
            this.field_2041 *= f23;
            this.field_2045 *= f23;
            this.field_2007 *= f23;
            this.method_1456(block, x, y, z, block.method_439(this.world, x, y, z, 1));
            flag = true;
        }

        if (this.field_2051 || block.shouldRenderSide(this.world, x, y, z - 1, 2)) {
            if (!this.aoLightValuesCalculated) {
                this.calculateAoLightValues(block, x, y, z);
            }

            int l = i;
            if (block.boundingBoxMinZ <= 0.0) {
                l = block.getLight(this.world, x, y, z - 1);
            }

            float f3;
            float f10;
            float f17;
            float f24;
            if (this.field_2033 > 0) {
                if (block.boundingBoxMinZ <= 0.0) {
                    z--;
                }

                this.field_1993 = this.getAmbientOcclusionLightValue(this.world, x - 1, y, z);
                this.field_2069 = this.getAmbientOcclusionLightValue(this.world, x, y - 1, z);
                this.field_1988 = this.getAmbientOcclusionLightValue(this.world, x, y + 1, z);
                this.field_1994 = this.getAmbientOcclusionLightValue(this.world, x + 1, y, z);
                this.field_2029 = block.getLight(this.world, x - 1, y, z);
                this.field_2000 = block.getLight(this.world, x, y - 1, z);
                this.field_2024 = block.getLight(this.world, x, y + 1, z);
                this.field_2030 = block.getLight(this.world, x + 1, y, z);
                if (!this.field_2012 && !this.field_2016) {
                    this.field_2066 = this.field_1993;
                    this.field_1997 = this.field_2029;
                } else {
                    this.field_2066 = this.getAmbientOcclusionLightValue(this.world, x - 1, y - 1, z);
                    this.field_1997 = block.getLight(this.world, x - 1, y - 1, z);
                }

                if (!this.field_2012 && !this.field_2008) {
                    this.field_1985 = this.field_1993;
                    this.field_2021 = this.field_2029;
                } else {
                    this.field_1985 = this.getAmbientOcclusionLightValue(this.world, x - 1, y + 1, z);
                    this.field_2021 = block.getLight(this.world, x - 1, y + 1, z);
                }

                if (!this.field_2015 && !this.field_2016) {
                    this.field_2071 = this.field_1994;
                    this.field_2002 = this.field_2030;
                } else {
                    this.field_2071 = this.getAmbientOcclusionLightValue(this.world, x + 1, y - 1, z);
                    this.field_2002 = block.getLight(this.world, x + 1, y - 1, z);
                }

                if (!this.field_2015 && !this.field_2008) {
                    this.field_1989 = this.field_1994;
                    this.field_2025 = this.field_2030;
                } else {
                    this.field_1989 = this.getAmbientOcclusionLightValue(this.world, x + 1, y + 1, z);
                    this.field_2025 = block.getLight(this.world, x + 1, y + 1, z);
                }

                if (block.boundingBoxMinZ <= 0.0) {
                    z++;
                }

                f3 = (this.field_1993 + this.field_1985 + this.field_2062 + this.field_1988) / 4.0F;
                f10 = (this.field_2062 + this.field_1988 + this.field_1994 + this.field_1989) / 4.0F;
                f17 = (this.field_2069 + this.field_2062 + this.field_2071 + this.field_1994) / 4.0F;
                f24 = (this.field_2066 + this.field_1993 + this.field_2069 + this.field_2062) / 4.0F;
                this.field_2034 = this.method_1433(this.field_2029, this.field_2021, this.field_2024, l);
                this.field_2035 = this.method_1433(this.field_2024, this.field_2030, this.field_2025, l);
                this.field_2036 = this.method_1433(this.field_2000, this.field_2002, this.field_2030, l);
                this.field_2037 = this.method_1433(this.field_1997, this.field_2029, this.field_2000, l);
            } else {
                f24 = this.field_2062;
                f17 = this.field_2062;
                f10 = this.field_2062;
                f3 = this.field_2062;
                this.field_2034 = this.field_2035 = this.field_2036 = this.field_2037 = l;
            }

            this.field_2038 = this.field_2039 = this.field_2040 = this.field_2041 = (flag3 ? r : 1.0F) * 0.8F;
            this.field_2042 = this.field_2043 = this.field_2044 = this.field_2045 = (flag3 ? g : 1.0F) * 0.8F;
            this.field_2046 = this.field_2005 = this.field_2006 = this.field_2007 = (flag3 ? b : 1.0F) * 0.8F;
            this.field_2038 *= f3;
            this.field_2042 *= f3;
            this.field_2046 *= f3;
            this.field_2039 *= f10;
            this.field_2043 *= f10;
            this.field_2005 *= f10;
            this.field_2040 *= f17;
            this.field_2044 *= f17;
            this.field_2006 *= f17;
            this.field_2041 *= f24;
            this.field_2045 *= f24;
            this.field_2007 *= f24;
            int l1 = block.method_439(this.world, x, y, z, 2);
            this.method_1461(block, x, y, z, l1);
            if (field_2047 && l1 == 3 && this.field_2049 < 0) {
                this.field_2038 *= r;
                this.field_2039 *= r;
                this.field_2040 *= r;
                this.field_2041 *= r;
                this.field_2042 *= g;
                this.field_2043 *= g;
                this.field_2044 *= g;
                this.field_2045 *= g;
                this.field_2046 *= b;
                this.field_2005 *= b;
                this.field_2006 *= b;
                this.field_2007 *= b;
                this.method_1461(block, x, y, z, 38);
            }

            flag = true;
        }

        if (this.field_2051 || block.shouldRenderSide(this.world, x, y, z + 1, 3)) {
            if (!this.aoLightValuesCalculated) {
                this.calculateAoLightValues(block, x, y, z);
            }

            int k1 = i;
            if (block.boundingBoxMaxZ >= 1.0) {
                k1 = block.getLight(this.world, x, y, z + 1);
            }

            float f4;
            float f11;
            float f18;
            float f25;
            if (this.field_2033 > 0) {
                if (block.boundingBoxMaxZ >= 1.0) {
                    z++;
                }

                this.field_1995 = this.getAmbientOcclusionLightValue(this.world, x - 1, y, z);
                this.field_1996 = this.getAmbientOcclusionLightValue(this.world, x + 1, y, z);
                this.field_2070 = this.getAmbientOcclusionLightValue(this.world, x, y - 1, z);
                this.field_1991 = this.getAmbientOcclusionLightValue(this.world, x, y + 1, z);
                this.field_2031 = block.getLight(this.world, x - 1, y, z);
                this.field_2032 = block.getLight(this.world, x + 1, y, z);
                this.field_2001 = block.getLight(this.world, x, y - 1, z);
                this.field_2027 = block.getLight(this.world, x, y + 1, z);
                if (!this.field_2014 && !this.field_2020) {
                    this.field_2068 = this.field_1995;
                    this.field_1999 = this.field_2031;
                } else {
                    this.field_2068 = this.getAmbientOcclusionLightValue(this.world, x - 1, y - 1, z);
                    this.field_1999 = block.getLight(this.world, x - 1, y - 1, z);
                }

                if (!this.field_2014 && !this.field_2011) {
                    this.field_1987 = this.field_1995;
                    this.field_2023 = this.field_2031;
                } else {
                    this.field_1987 = this.getAmbientOcclusionLightValue(this.world, x - 1, y + 1, z);
                    this.field_2023 = block.getLight(this.world, x - 1, y + 1, z);
                }

                if (!this.field_2013 && !this.field_2020) {
                    this.field_1984 = this.field_1996;
                    this.field_2004 = this.field_2032;
                } else {
                    this.field_1984 = this.getAmbientOcclusionLightValue(this.world, x + 1, y - 1, z);
                    this.field_2004 = block.getLight(this.world, x + 1, y - 1, z);
                }

                if (!this.field_2013 && !this.field_2011) {
                    this.field_1992 = this.field_1996;
                    this.field_2028 = this.field_2032;
                } else {
                    this.field_1992 = this.getAmbientOcclusionLightValue(this.world, x + 1, y + 1, z);
                    this.field_2028 = block.getLight(this.world, x + 1, y + 1, z);
                }

                if (block.boundingBoxMaxZ >= 1.0) {
                    z--;
                }

                f4 = (this.field_1995 + this.field_1987 + this.field_2065 + this.field_1991) / 4.0F;
                f25 = (this.field_2065 + this.field_1991 + this.field_1996 + this.field_1992) / 4.0F;
                f18 = (this.field_2070 + this.field_2065 + this.field_1984 + this.field_1996) / 4.0F;
                f11 = (this.field_2068 + this.field_1995 + this.field_2070 + this.field_2065) / 4.0F;
                this.field_2034 = this.method_1433(this.field_2031, this.field_2023, this.field_2027, k1);
                this.field_2037 = this.method_1433(this.field_2027, this.field_2032, this.field_2028, k1);
                this.field_2036 = this.method_1433(this.field_2001, this.field_2004, this.field_2032, k1);
                this.field_2035 = this.method_1433(this.field_1999, this.field_2031, this.field_2001, k1);
            } else {
                f25 = this.field_2065;
                f18 = this.field_2065;
                f11 = this.field_2065;
                f4 = this.field_2065;
                this.field_2034 = this.field_2035 = this.field_2036 = this.field_2037 = k1;
            }

            this.field_2038 = this.field_2039 = this.field_2040 = this.field_2041 = (flag4 ? r : 1.0F) * 0.8F;
            this.field_2042 = this.field_2043 = this.field_2044 = this.field_2045 = (flag4 ? g : 1.0F) * 0.8F;
            this.field_2046 = this.field_2005 = this.field_2006 = this.field_2007 = (flag4 ? b : 1.0F) * 0.8F;
            this.field_2038 *= f4;
            this.field_2042 *= f4;
            this.field_2046 *= f4;
            this.field_2039 *= f11;
            this.field_2043 *= f11;
            this.field_2005 *= f11;
            this.field_2040 *= f18;
            this.field_2044 *= f18;
            this.field_2006 *= f18;
            this.field_2041 *= f25;
            this.field_2045 *= f25;
            this.field_2007 *= f25;
            int i2 = block.method_439(this.world, x, y, z, 3);
            this.method_1465(block, x, y, z, i2);
            if (field_2047 && i2 == 3 && this.field_2049 < 0) {
                this.field_2038 *= r;
                this.field_2039 *= r;
                this.field_2040 *= r;
                this.field_2041 *= r;
                this.field_2042 *= g;
                this.field_2043 *= g;
                this.field_2044 *= g;
                this.field_2045 *= g;
                this.field_2046 *= b;
                this.field_2005 *= b;
                this.field_2006 *= b;
                this.field_2007 *= b;
                this.method_1465(block, x, y, z, 38);
            }

            flag = true;
        }

        if (this.field_2051 || block.shouldRenderSide(this.world, x - 1, y, z, 4)) {
            if (!this.aoLightValuesCalculated) {
                this.calculateAoLightValues(block, x, y, z);
            }

            int j = i;
            if (block.boundingBoxMinX <= 0.0) {
                j = block.getLight(this.world, x - 1, y, z);
            }

            float f5;
            float f12;
            float f19;
            float f26;
            if (this.field_2033 > 0) {
                if (block.boundingBoxMinX <= 0.0) {
                    x--;
                }

                this.field_2067 = this.getAmbientOcclusionLightValue(this.world, x, y - 1, z);
                this.field_1993 = this.getAmbientOcclusionLightValue(this.world, x, y, z - 1);
                this.field_1995 = this.getAmbientOcclusionLightValue(this.world, x, y, z + 1);
                this.field_1986 = this.getAmbientOcclusionLightValue(this.world, x, y + 1, z);
                this.field_1998 = block.getLight(this.world, x, y - 1, z);
                this.field_2029 = block.getLight(this.world, x, y, z - 1);
                this.field_2031 = block.getLight(this.world, x, y, z + 1);
                this.field_2022 = block.getLight(this.world, x, y + 1, z);
                if (!this.field_2012 && !this.field_2019) {
                    this.field_2066 = this.field_1993;
                    this.field_1997 = this.field_2029;
                } else {
                    this.field_2066 = this.getAmbientOcclusionLightValue(this.world, x, y - 1, z - 1);
                    this.field_1997 = block.getLight(this.world, x, y - 1, z - 1);
                }

                if (!this.field_2014 && !this.field_2019) {
                    this.field_2068 = this.field_1995;
                    this.field_1999 = this.field_2031;
                } else {
                    this.field_2068 = this.getAmbientOcclusionLightValue(this.world, x, y - 1, z + 1);
                    this.field_1999 = block.getLight(this.world, x, y - 1, z + 1);
                }

                if (!this.field_2012 && !this.field_2010) {
                    this.field_1985 = this.field_1993;
                    this.field_2021 = this.field_2029;
                } else {
                    this.field_1985 = this.getAmbientOcclusionLightValue(this.world, x, y + 1, z - 1);
                    this.field_2021 = block.getLight(this.world, x, y + 1, z - 1);
                }

                if (!this.field_2014 && !this.field_2010) {
                    this.field_1987 = this.field_1995;
                    this.field_2023 = this.field_2031;
                } else {
                    this.field_1987 = this.getAmbientOcclusionLightValue(this.world, x, y + 1, z + 1);
                    this.field_2023 = block.getLight(this.world, x, y + 1, z + 1);
                }

                if (block.boundingBoxMinX <= 0.0) {
                    x++;
                }

                f26 = (this.field_2067 + this.field_2068 + this.field_2060 + this.field_1995) / 4.0F;
                f5 = (this.field_2060 + this.field_1995 + this.field_1986 + this.field_1987) / 4.0F;
                f12 = (this.field_1993 + this.field_2060 + this.field_1985 + this.field_1986) / 4.0F;
                f19 = (this.field_2066 + this.field_2067 + this.field_1993 + this.field_2060) / 4.0F;
                this.field_2037 = this.method_1433(this.field_1998, this.field_1999, this.field_2031, j);
                this.field_2034 = this.method_1433(this.field_2031, this.field_2022, this.field_2023, j);
                this.field_2035 = this.method_1433(this.field_2029, this.field_2021, this.field_2022, j);
                this.field_2036 = this.method_1433(this.field_1997, this.field_1998, this.field_2029, j);
            } else {
                f26 = this.field_2060;
                f19 = this.field_2060;
                f12 = this.field_2060;
                f5 = this.field_2060;
                this.field_2034 = this.field_2035 = this.field_2036 = this.field_2037 = j;
            }

            this.field_2038 = this.field_2039 = this.field_2040 = this.field_2041 = (flag5 ? r : 1.0F) * 0.6F;
            this.field_2042 = this.field_2043 = this.field_2044 = this.field_2045 = (flag5 ? g : 1.0F) * 0.6F;
            this.field_2046 = this.field_2005 = this.field_2006 = this.field_2007 = (flag5 ? b : 1.0F) * 0.6F;
            this.field_2038 *= f5;
            this.field_2042 *= f5;
            this.field_2046 *= f5;
            this.field_2039 *= f12;
            this.field_2043 *= f12;
            this.field_2005 *= f12;
            this.field_2040 *= f19;
            this.field_2044 *= f19;
            this.field_2006 *= f19;
            this.field_2041 *= f26;
            this.field_2045 *= f26;
            this.field_2007 *= f26;
            int j2 = block.method_439(this.world, x, y, z, 4);
            this.method_1468(block, x, y, z, j2);
            if (field_2047 && j2 == 3 && this.field_2049 < 0) {
                this.field_2038 *= r;
                this.field_2039 *= r;
                this.field_2040 *= r;
                this.field_2041 *= r;
                this.field_2042 *= g;
                this.field_2043 *= g;
                this.field_2044 *= g;
                this.field_2045 *= g;
                this.field_2046 *= b;
                this.field_2005 *= b;
                this.field_2006 *= b;
                this.field_2007 *= b;
                this.method_1468(block, x, y, z, 38);
            }

            flag = true;
        }

        if (this.field_2051 || block.shouldRenderSide(this.world, x + 1, y, z, 5)) {
            if (!this.aoLightValuesCalculated) {
                this.calculateAoLightValues(block, x, y, z);
            }

            int i1 = i;
            if (block.boundingBoxMaxX >= 1.0) {
                i1 = block.getLight(this.world, x + 1, y, z);
            }

            float f6;
            float f13;
            float f20;
            float f27;
            if (this.field_2033 > 0) {
                if (block.boundingBoxMaxX >= 1.0) {
                    x++;
                }

                this.field_1983 = this.getAmbientOcclusionLightValue(this.world, x, y - 1, z);
                this.field_1994 = this.getAmbientOcclusionLightValue(this.world, x, y, z - 1);
                this.field_1996 = this.getAmbientOcclusionLightValue(this.world, x, y, z + 1);
                this.field_1990 = this.getAmbientOcclusionLightValue(this.world, x, y + 1, z);
                this.field_2003 = block.getLight(this.world, x, y - 1, z);
                this.field_2030 = block.getLight(this.world, x, y, z - 1);
                this.field_2032 = block.getLight(this.world, x, y, z + 1);
                this.field_2026 = block.getLight(this.world, x, y + 1, z);
                if (!this.field_2018 && !this.field_2015) {
                    this.field_2071 = this.field_1994;
                    this.field_2002 = this.field_2030;
                } else {
                    this.field_2071 = this.getAmbientOcclusionLightValue(this.world, x, y - 1, z - 1);
                    this.field_2002 = block.getLight(this.world, x, y - 1, z - 1);
                }

                if (!this.field_2018 && !this.field_2013) {
                    this.field_1984 = this.field_1996;
                    this.field_2004 = this.field_2032;
                } else {
                    this.field_1984 = this.getAmbientOcclusionLightValue(this.world, x, y - 1, z + 1);
                    this.field_2004 = block.getLight(this.world, x, y - 1, z + 1);
                }

                if (!this.field_2009 && !this.field_2015) {
                    this.field_1989 = this.field_1994;
                    this.field_2025 = this.field_2030;
                } else {
                    this.field_1989 = this.getAmbientOcclusionLightValue(this.world, x, y + 1, z - 1);
                    this.field_2025 = block.getLight(this.world, x, y + 1, z - 1);
                }

                if (!this.field_2009 && !this.field_2013) {
                    this.field_1992 = this.field_1996;
                    this.field_2028 = this.field_2032;
                } else {
                    this.field_1992 = this.getAmbientOcclusionLightValue(this.world, x, y + 1, z + 1);
                    this.field_2028 = block.getLight(this.world, x, y + 1, z + 1);
                }

                if (block.boundingBoxMaxX >= 1.0) {
                    x--;
                }

                f6 = (this.field_1983 + this.field_1984 + this.field_2063 + this.field_1996) / 4.0F;
                f27 = (this.field_2063 + this.field_1996 + this.field_1990 + this.field_1992) / 4.0F;
                f20 = (this.field_1994 + this.field_2063 + this.field_1989 + this.field_1990) / 4.0F;
                f13 = (this.field_2071 + this.field_1983 + this.field_1994 + this.field_2063) / 4.0F;
                this.field_2034 = this.method_1433(this.field_2003, this.field_2004, this.field_2032, i1);
                this.field_2037 = this.method_1433(this.field_2032, this.field_2026, this.field_2028, i1);
                this.field_2036 = this.method_1433(this.field_2030, this.field_2025, this.field_2026, i1);
                this.field_2035 = this.method_1433(this.field_2002, this.field_2003, this.field_2030, i1);
            } else {
                f27 = this.field_2063;
                f20 = this.field_2063;
                f13 = this.field_2063;
                f6 = this.field_2063;
                this.field_2034 = this.field_2035 = this.field_2036 = this.field_2037 = i1;
            }

            this.field_2038 = this.field_2039 = this.field_2040 = this.field_2041 = (flag6 ? r : 1.0F) * 0.6F;
            this.field_2042 = this.field_2043 = this.field_2044 = this.field_2045 = (flag6 ? g : 1.0F) * 0.6F;
            this.field_2046 = this.field_2005 = this.field_2006 = this.field_2007 = (flag6 ? b : 1.0F) * 0.6F;
            this.field_2038 *= f6;
            this.field_2042 *= f6;
            this.field_2046 *= f6;
            this.field_2039 *= f13;
            this.field_2043 *= f13;
            this.field_2005 *= f13;
            this.field_2040 *= f20;
            this.field_2044 *= f20;
            this.field_2006 *= f20;
            this.field_2041 *= f27;
            this.field_2045 *= f27;
            this.field_2007 *= f27;
            int k2 = block.method_439(this.world, x, y, z, 5);
            this.method_1470(block, x, y, z, k2);
            if (field_2047 && k2 == 3 && this.field_2049 < 0) {
                this.field_2038 *= r;
                this.field_2039 *= r;
                this.field_2040 *= r;
                this.field_2041 *= r;
                this.field_2042 *= g;
                this.field_2043 *= g;
                this.field_2044 *= g;
                this.field_2045 *= g;
                this.field_2046 *= b;
                this.field_2005 *= b;
                this.field_2006 *= b;
                this.field_2007 *= b;
                this.method_1470(block, x, y, z, 38);
            }

            flag = true;
        }

        this.field_2058 = false;
        return flag;
    }
}
