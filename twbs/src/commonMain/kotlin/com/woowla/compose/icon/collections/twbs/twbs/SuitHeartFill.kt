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

public val Twbs.SuitHeartFill: ImageVector
    get() {
        if (_suitHeartFill != null) {
            return _suitHeartFill!!
        }
        _suitHeartFill = Builder(name = "SuitHeartFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 1.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.755f, 4.0f, 3.92f)
                curveTo(8.0f, 2.755f, 9.79f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveToRelative(4.0f, 1.755f, 4.0f, 3.92f)
                curveToRelative(0.0f, 3.263f, -3.234f, 4.414f, -7.608f, 9.608f)
                arcToRelative(0.513f, 0.513f, 0.0f, false, true, -0.784f, 0.0f)
                curveTo(3.234f, 9.334f, 0.0f, 8.183f, 0.0f, 4.92f)
                curveTo(0.0f, 2.755f, 1.79f, 1.0f, 4.0f, 1.0f)
            }
        }
        .build()
        return _suitHeartFill!!
    }

private var _suitHeartFill: ImageVector? = null
