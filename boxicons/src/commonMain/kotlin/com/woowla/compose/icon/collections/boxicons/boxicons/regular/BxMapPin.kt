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

public val RegularGroup.BxMapPin: ImageVector
    get() {
        if (_bxMapPin != null) {
            return _bxMapPin!!
        }
        _bxMapPin = Builder(name = "BxMapPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 17.0f)
                lineToRelative(1.0f, -2.0f)
                verticalLineTo(9.858f)
                curveToRelative(1.721f, -0.447f, 3.0f, -2.0f, 3.0f, -3.858f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveTo(8.0f, 3.794f, 8.0f, 6.0f)
                curveToRelative(0.0f, 1.858f, 1.279f, 3.411f, 3.0f, 3.858f)
                verticalLineTo(15.0f)
                lineToRelative(1.0f, 2.0f)
                close()
                moveTo(10.0f, 6.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.267f, 10.563f)
                lineToRelative(-0.533f, 1.928f)
                curveTo(18.325f, 13.207f, 20.0f, 14.584f, 20.0f, 16.0f)
                curveToRelative(0.0f, 1.892f, -3.285f, 4.0f, -8.0f, 4.0f)
                reflectiveCurveToRelative(-8.0f, -2.108f, -8.0f, -4.0f)
                curveToRelative(0.0f, -1.416f, 1.675f, -2.793f, 4.267f, -3.51f)
                lineToRelative(-0.533f, -1.928f)
                curveTo(4.197f, 11.54f, 2.0f, 13.623f, 2.0f, 16.0f)
                curveToRelative(0.0f, 3.364f, 4.393f, 6.0f, 10.0f, 6.0f)
                reflectiveCurveToRelative(10.0f, -2.636f, 10.0f, -6.0f)
                curveToRelative(0.0f, -2.377f, -2.197f, -4.46f, -5.733f, -5.437f)
                close()
            }
        }
        .build()
        return _bxMapPin!!
    }

private var _bxMapPin: ImageVector? = null
