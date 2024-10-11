package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.GlassOff: ImageVector
    get() {
        if (_glassOff != null) {
            return _glassOff!!
        }
        _glassOff = Builder(name = "GlassOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 21.0f)
                horizontalLineToRelative(8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                verticalLineToRelative(5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 5.0f)
                lineToRelative(1.0f, 6.0f)
                curveToRelative(0.0f, 0.887f, -0.233f, 1.685f, -0.646f, 2.37f)
                moveToRelative(-2.083f, 1.886f)
                curveToRelative(-0.941f, 0.48f, -2.064f, 0.744f, -3.271f, 0.744f)
                curveToRelative(-3.314f, 0.0f, -6.0f, -1.988f, -6.0f, -5.0f)
                lineToRelative(0.711f, -4.268f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.983f, 6.959f)
                curveToRelative(0.329f, 0.027f, 0.669f, 0.041f, 1.017f, 0.041f)
                curveToRelative(2.761f, 0.0f, 5.0f, -0.895f, 5.0f, -2.0f)
                reflectiveCurveToRelative(-2.239f, -2.0f, -5.0f, -2.0f)
                curveToRelative(-1.716f, 0.0f, -3.23f, 0.346f, -4.13f, 0.872f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _glassOff!!
    }

private var _glassOff: ImageVector? = null
