package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Medium: ImageVector
    get() {
        if (_medium != null) {
            return _medium!!
        }
        _medium = Builder(name = "Medium", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.025f, 8.0f)
                curveToRelative(0.0f, 2.485f, -2.02f, 4.5f, -4.513f, 4.5f)
                arcTo(4.506f, 4.506f, 0.0f, false, true, 0.0f, 8.0f)
                curveToRelative(0.0f, -2.486f, 2.02f, -4.5f, 4.512f, -4.5f)
                arcTo(4.506f, 4.506f, 0.0f, false, true, 9.025f, 8.0f)
                moveToRelative(4.95f, 0.0f)
                curveToRelative(0.0f, 2.34f, -1.01f, 4.236f, -2.256f, 4.236f)
                reflectiveCurveTo(9.463f, 10.339f, 9.463f, 8.0f)
                curveToRelative(0.0f, -2.34f, 1.01f, -4.236f, 2.256f, -4.236f)
                reflectiveCurveTo(13.975f, 5.661f, 13.975f, 8.0f)
                moveTo(16.0f, 8.0f)
                curveToRelative(0.0f, 2.096f, -0.355f, 3.795f, -0.794f, 3.795f)
                curveToRelative(-0.438f, 0.0f, -0.793f, -1.7f, -0.793f, -3.795f)
                curveToRelative(0.0f, -2.096f, 0.355f, -3.795f, 0.794f, -3.795f)
                curveToRelative(0.438f, 0.0f, 0.793f, 1.699f, 0.793f, 3.795f)
            }
        }
        .build()
        return _medium!!
    }

private var _medium: ImageVector? = null
