package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxTennisBall: ImageVector
    get() {
        if (_bxTennisBall != null) {
            return _bxTennisBall!!
        }
        _bxTennisBall = Builder(name = "BxTennisBall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.929f, 19.081f)
                curveToRelative(1.895f, 1.895f, 4.405f, 2.938f, 7.071f, 2.938f)
                reflectiveCurveToRelative(5.177f, -1.043f, 7.071f, -2.938f)
                curveToRelative(3.899f, -3.899f, 3.899f, -10.243f, 0.0f, -14.143f)
                curveTo(17.177f, 3.044f, 14.665f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(6.823f, 3.044f, 4.929f, 4.938f)
                curveToRelative(-3.899f, 3.899f, -3.899f, 10.244f, 0.0f, 14.143f)
                close()
                moveTo(17.657f, 17.667f)
                arcToRelative(7.969f, 7.969f, 0.0f, false, true, -3.813f, 2.129f)
                curveToRelative(-0.009f, -1.602f, 0.586f, -3.146f, 1.691f, -4.251f)
                curveToRelative(1.163f, -1.163f, 2.732f, -1.828f, 4.277f, -1.851f)
                arcToRelative(7.945f, 7.945f, 0.0f, false, true, -2.155f, 3.973f)
                close()
                moveTo(19.982f, 11.702f)
                curveToRelative(-2.124f, -0.021f, -4.284f, 0.853f, -5.861f, 2.429f)
                curveToRelative(-1.532f, 1.532f, -2.327f, 3.68f, -2.263f, 5.881f)
                arcToRelative(7.946f, 7.946f, 0.0f, false, true, -5.516f, -2.345f)
                arcToRelative(7.97f, 7.97f, 0.0f, false, true, -2.332f, -5.512f)
                curveToRelative(0.077f, 0.002f, 0.154f, 0.014f, 0.231f, 0.014f)
                curveToRelative(2.115f, 0.0f, 4.16f, -0.804f, 5.637f, -2.28f)
                curveToRelative(1.58f, -1.58f, 2.457f, -3.739f, 2.43f, -5.873f)
                arcToRelative(7.948f, 7.948f, 0.0f, false, true, 5.349f, 2.337f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, true, 2.325f, 5.349f)
                close()
                moveTo(6.343f, 6.353f)
                arcToRelative(7.968f, 7.968f, 0.0f, false, true, 3.973f, -2.169f)
                curveToRelative(-0.018f, 1.555f, -0.685f, 3.124f, -1.851f, 4.291f)
                curveToRelative(-1.104f, 1.103f, -2.642f, 1.696f, -4.238f, 1.691f)
                arcToRelative(7.929f, 7.929f, 0.0f, false, true, 2.116f, -3.813f)
                close()
            }
        }
        .build()
        return _bxTennisBall!!
    }

private var _bxTennisBall: ImageVector? = null
