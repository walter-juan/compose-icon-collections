package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxSleepy: ImageVector
    get() {
        if (_bxSleepy != null) {
            return _bxSleepy!!
        }
        _bxSleepy = Builder(name = "BxSleepy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                reflectiveCurveToRelative(3.589f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.589f, 8.0f, -8.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 15.5f)
                arcToRelative(3.0f, 2.5f, 0.0f, true, false, 6.0f, 0.0f)
                arcToRelative(3.0f, 2.5f, 0.0f, true, false, -6.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 7.0f)
                curveToRelative(-2.905f, 0.0f, -3.983f, 2.386f, -4.0f, 3.99f)
                lineToRelative(2.0f, 0.021f)
                curveTo(8.002f, 10.804f, 8.076f, 9.0f, 10.0f, 9.0f)
                lineTo(10.0f, 7.0f)
                close()
                moveTo(14.0f, 7.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(1.826f, 0.0f, 1.992f, 1.537f, 2.0f, 2.007f)
                lineTo(17.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, -1.608f, -1.065f, -4.0f, -4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _bxSleepy!!
    }

private var _bxSleepy: ImageVector? = null
