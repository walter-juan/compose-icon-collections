package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Keploy: ImageVector
    get() {
        if (_keploy != null) {
            return _keploy!!
        }
        _keploy = Builder(name = "Keploy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.438f, 0.0f)
                curveTo(6.895f, -0.003f, 6.392f, 0.201f, 5.954f, 0.673f)
                curveToRelative(-0.695f, 0.748f, -0.354f, 1.737f, 0.536f, 2.794f)
                curveToRelative(2.751f, 0.653f, 6.33f, 2.398f, 9.437f, 4.878f)
                curveTo(14.473f, 6.051f, 10.37f, 0.016f, 7.438f, 0.0f)
                close()
                moveTo(4.262f, 3.578f)
                curveToRelative(-1.304f, 0.023f, -2.221f, 0.473f, -2.498f, 1.436f)
                curveTo(0.745f, 8.556f, 13.576f, 10.617f, 13.576f, 10.617f)
                curveToRelative(0.269f, 0.047f, 0.474f, 0.281f, 0.474f, 0.563f)
                curveToRelative(0.0f, 0.292f, -0.22f, 0.53f, -0.503f, 0.564f)
                curveToRelative(-7.508f, -0.303f, -8.852f, 4.309f, -8.852f, 4.309f)
                curveTo(3.269f, 20.663f, 7.686f, 24.0f, 7.686f, 24.0f)
                curveToRelative(-2.129f, -8.543f, 7.044f, -4.977f, 7.044f, -4.977f)
                curveToRelative(7.564f, 2.579f, 7.829f, 0.526f, 7.465f, -1.057f)
                curveToRelative(-0.003f, -0.013f, -0.004f, -0.026f, -0.007f, -0.039f)
                curveTo(20.449f, 9.987f, 9.378f, 3.49f, 4.262f, 3.578f)
                close()
                moveTo(18.597f, 14.175f)
                curveToRelative(0.236f, -0.002f, 0.524f, 0.117f, 0.771f, 0.341f)
                curveToRelative(0.396f, 0.358f, 0.537f, 0.846f, 0.315f, 1.091f)
                curveToRelative(-0.222f, 0.245f, -0.723f, 0.154f, -1.119f, -0.204f)
                curveToRelative(-0.395f, -0.357f, -0.536f, -0.846f, -0.314f, -1.091f)
                curveToRelative(0.083f, -0.092f, 0.206f, -0.136f, 0.347f, -0.138f)
                close()
            }
        }
        .build()
        return _keploy!!
    }

private var _keploy: ImageVector? = null
