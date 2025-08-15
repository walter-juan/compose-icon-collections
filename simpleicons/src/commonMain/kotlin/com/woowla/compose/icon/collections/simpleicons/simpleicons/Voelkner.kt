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

public val Simpleicons.Voelkner: ImageVector
    get() {
        if (_voelkner != null) {
            return _voelkner!!
        }
        _voelkner = Builder(name = "Voelkner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.4f, 3.502f)
                curveTo(18.093f, 8.84f, 15.018f, 16.05f, 11.964f, 16.05f)
                reflectiveCurveTo(5.841f, 8.827f, 4.552f, 3.502f)
                horizontalLineTo(0.0f)
                curveToRelative(0.229f, 1.007f, 1.121f, 4.707f, 2.597f, 8.122f)
                curveToRelative(2.543f, 5.89f, 5.695f, 8.876f, 9.367f, 8.876f)
                reflectiveCurveToRelative(6.828f, -2.991f, 9.385f, -8.893f)
                curveTo(22.806f, 8.247f, 23.737f, 4.592f, 24.0f, 3.5f)
                horizontalLineToRelative(-4.6f)
                close()
            }
        }
        .build()
        return _voelkner!!
    }

private var _voelkner: ImageVector? = null
