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

public val Simpleicons.Helium: ImageVector
    get() {
        if (_helium != null) {
            return _helium!!
        }
        _helium = Builder(name = "Helium", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, 5.373f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.373f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.627f, 0.0f, 12.0f)
                reflectiveCurveTo(5.373f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(14.554f, 5.606f)
                arcToRelative(2.703f, 2.703f, 0.0f, false, false, -0.742f, 1.386f)
                curveToRelative(-1.923f, -0.724f, -4.128f, -0.264f, -5.597f, 1.204f)
                curveToRelative(-1.47f, 1.47f, -1.929f, 3.678f, -1.202f, 5.602f)
                arcToRelative(2.704f, 2.704f, 0.0f, false, false, -1.395f, 0.744f)
                curveToRelative(-1.06f, 1.06f, -1.06f, 2.78f, 0.0f, 3.84f)
                curveToRelative(1.061f, 1.06f, 2.78f, 1.06f, 3.84f, 0.0f)
                arcToRelative(2.704f, 2.704f, 0.0f, false, false, 0.746f, -1.403f)
                arcToRelative(5.255f, 5.255f, 0.0f, false, false, 1.837f, 0.332f)
                curveToRelative(1.376f, 0.0f, 2.734f, -0.534f, 3.744f, -1.544f)
                curveToRelative(1.463f, -1.463f, 1.925f, -3.658f, 1.213f, -5.576f)
                arcToRelative(2.703f, 2.703f, 0.0f, false, false, 1.396f, -0.744f)
                curveToRelative(1.061f, -1.06f, 1.061f, -2.78f, 0.0f, -3.84f)
                curveToRelative(-1.06f, -1.06f, -2.78f, -1.06f, -3.84f, 0.0f)
                close()
                moveTo(17.726f, 8.779f)
                curveToRelative(-0.403f, 0.403f, -0.958f, 0.588f, -1.523f, 0.507f)
                arcToRelative(0.306f, 0.306f, 0.0f, false, false, -0.079f, 0.0f)
                arcToRelative(0.921f, 0.921f, 0.0f, false, false, -0.988f, 0.604f)
                arcToRelative(0.921f, 0.921f, 0.0f, false, false, 0.031f, 0.701f)
                curveToRelative(0.602f, 1.301f, 0.325f, 2.856f, -0.689f, 3.869f)
                curveToRelative(-1.014f, 1.014f, -2.569f, 1.291f, -3.87f, 0.688f)
                arcToRelative(0.921f, 0.921f, 0.0f, false, false, -0.71f, -0.028f)
                arcToRelative(0.921f, 0.921f, 0.0f, false, false, -0.517f, 0.478f)
                arcToRelative(0.919f, 0.919f, 0.0f, false, false, -0.083f, 0.454f)
                arcToRelative(0.308f, 0.308f, 0.0f, false, false, 0.0f, 0.091f)
                arcToRelative(1.799f, 1.799f, 0.0f, false, true, -0.501f, 1.564f)
                curveToRelative(-0.699f, 0.699f, -1.837f, 0.699f, -2.536f, 0.0f)
                arcToRelative(1.782f, 1.782f, 0.0f, false, true, -0.525f, -1.268f)
                curveToRelative(0.0f, -0.479f, 0.186f, -0.929f, 0.525f, -1.268f)
                curveToRelative(0.403f, -0.403f, 0.958f, -0.587f, 1.552f, -0.506f)
                arcToRelative(0.921f, 0.921f, 0.0f, false, false, 0.182f, 0.021f)
                curveToRelative(0.13f, 0.0f, 0.262f, -0.028f, 0.388f, -0.086f)
                arcToRelative(0.921f, 0.921f, 0.0f, false, false, 0.475f, -0.51f)
                arcToRelative(0.921f, 0.921f, 0.0f, false, false, -0.025f, -0.717f)
                curveToRelative(-0.602f, -1.301f, -0.325f, -2.855f, 0.689f, -3.869f)
                curveToRelative(1.014f, -1.014f, 2.569f, -1.291f, 3.87f, -0.688f)
                arcToRelative(0.921f, 0.921f, 0.0f, false, false, 0.707f, 0.029f)
                arcToRelative(0.922f, 0.922f, 0.0f, false, false, 0.52f, -0.479f)
                curveToRelative(0.083f, -0.179f, 0.103f, -0.371f, 0.07f, -0.558f)
                arcToRelative(1.799f, 1.799f, 0.0f, false, true, 0.501f, -1.564f)
                curveToRelative(0.699f, -0.699f, 1.837f, -0.699f, 2.536f, 0.0f)
                curveToRelative(0.699f, 0.699f, 0.699f, 1.837f, 0.0f, 2.536f)
                close()
                moveTo(10.608f, 10.59f)
                curveToRelative(-0.776f, 0.776f, -0.776f, 2.034f, 0.0f, 2.809f)
                curveToRelative(0.776f, 0.776f, 2.034f, 0.776f, 2.81f, 0.0f)
                curveToRelative(0.776f, -0.776f, 0.776f, -2.034f, 0.0f, -2.809f)
                curveToRelative(-0.776f, -0.776f, -2.034f, -0.776f, -2.81f, 0.0f)
                close()
            }
        }
        .build()
        return _helium!!
    }

private var _helium: ImageVector? = null
