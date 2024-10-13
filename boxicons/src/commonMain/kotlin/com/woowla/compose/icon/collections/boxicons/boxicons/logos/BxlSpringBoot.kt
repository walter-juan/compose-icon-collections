package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlSpringBoot: ImageVector
    get() {
        if (_bxlSpringBoot != null) {
            return _bxlSpringBoot!!
        }
        _bxlSpringBoot = Builder(name = "BxlSpringBoot", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.205f, 16.392f)
                curveToRelative(-2.469f, 3.289f, -7.741f, 2.179f, -11.122f, 2.338f)
                curveToRelative(0.0f, 0.0f, -0.599f, 0.034f, -1.201f, 0.133f)
                curveToRelative(0.0f, 0.0f, 0.228f, -0.097f, 0.519f, -0.198f)
                curveToRelative(2.374f, -0.821f, 3.496f, -0.986f, 4.939f, -1.727f)
                curveToRelative(2.71f, -1.388f, 5.408f, -4.413f, 5.957f, -7.555f)
                curveToRelative(-1.032f, 3.022f, -4.17f, 5.623f, -7.027f, 6.679f)
                curveToRelative(-1.955f, 0.722f, -5.492f, 1.424f, -5.493f, 1.424f)
                arcToRelative(5.28f, 5.28f, 0.0f, false, true, -0.143f, -0.076f)
                curveToRelative(-2.405f, -1.17f, -2.475f, -6.38f, 1.894f, -8.059f)
                curveToRelative(1.916f, -0.736f, 3.747f, -0.332f, 5.818f, -0.825f)
                curveToRelative(2.208f, -0.525f, 4.766f, -2.18f, 5.805f, -4.344f)
                curveToRelative(1.165f, 3.458f, 2.565f, 8.866f, 0.054f, 12.21f)
                close()
                moveTo(20.247f, 3.112f)
                arcToRelative(9.212f, 9.212f, 0.0f, false, true, -1.065f, 1.89f)
                arcToRelative(9.982f, 9.982f, 0.0f, false, false, -7.167f, -3.031f)
                curveTo(6.492f, 1.971f, 2.0f, 6.463f, 2.0f, 11.985f)
                arcToRelative(9.983f, 9.983f, 0.0f, false, false, 3.205f, 7.334f)
                lineToRelative(0.22f, 0.194f)
                arcToRelative(0.856f, 0.856f, 0.0f, true, true, 0.001f, 0.001f)
                lineToRelative(0.149f, 0.132f)
                arcTo(9.96f, 9.96f, 0.0f, false, false, 12.015f, 22.0f)
                curveToRelative(5.278f, 0.0f, 9.613f, -4.108f, 9.984f, -9.292f)
                curveToRelative(0.274f, -2.539f, -0.476f, -5.763f, -1.752f, -9.596f)
            }
        }
        .build()
        return _bxlSpringBoot!!
    }

private var _bxlSpringBoot: ImageVector? = null
