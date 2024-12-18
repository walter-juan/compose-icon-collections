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

public val OutlineGroup.CakeRoll: ImageVector
    get() {
        if (_cakeRoll != null) {
            return _cakeRoll!!
        }
        _cakeRoll = Builder(name = "CakeRoll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                curveToRelative(-4.97f, 0.0f, -9.0f, -2.462f, -9.0f, -5.5f)
                reflectiveCurveToRelative(4.03f, -5.5f, 9.0f, -5.5f)
                reflectiveCurveToRelative(9.0f, 2.462f, 9.0f, 5.5f)
                reflectiveCurveToRelative(-4.03f, 5.5f, -9.0f, 5.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.97f)
                curveToRelative(3.0f, 0.0f, 4.0f, 1.036f, 4.0f, 1.979f)
                curveToRelative(0.0f, 2.805f, -8.0f, 2.969f, -8.0f, -0.99f)
                curveToRelative(0.0f, -2.11f, 1.5f, -3.959f, 4.0f, -3.959f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 9.333f)
                verticalLineToRelative(5.334f)
                curveToRelative(0.0f, 2.945f, -4.03f, 5.333f, -9.0f, 5.333f)
                reflectiveCurveToRelative(-9.0f, -2.388f, -9.0f, -5.333f)
                verticalLineToRelative(-5.334f)
            }
        }
        .build()
        return _cakeRoll!!
    }

private var _cakeRoll: ImageVector? = null
