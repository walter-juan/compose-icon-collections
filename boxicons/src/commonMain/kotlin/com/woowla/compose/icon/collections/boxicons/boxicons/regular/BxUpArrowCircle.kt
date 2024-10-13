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

public val RegularGroup.BxUpArrowCircle: ImageVector
    get() {
        if (_bxUpArrowCircle != null) {
            return _bxUpArrowCircle!!
        }
        _bxUpArrowCircle = Builder(name = "BxUpArrowCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 1.993f)
                curveTo(6.486f, 1.994f, 2.0f, 6.48f, 2.0f, 11.994f)
                curveToRelative(0.001f, 5.514f, 4.487f, 10.0f, 10.0f, 10.0f)
                curveToRelative(5.515f, 0.0f, 10.001f, -4.486f, 10.001f, -10.0f)
                reflectiveCurveToRelative(-4.486f, -10.0f, -10.0f, -10.001f)
                close()
                moveTo(12.0f, 19.994f)
                curveToRelative(-4.41f, 0.0f, -7.999f, -3.589f, -8.0f, -8.0f)
                curveToRelative(0.0f, -4.411f, 3.589f, -8.0f, 8.001f, -8.001f)
                curveToRelative(4.411f, 0.001f, 8.0f, 3.59f, 8.0f, 8.001f)
                reflectiveCurveToRelative(-3.589f, 8.0f, -8.001f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.001f, 8.001f)
                lineToRelative(-4.005f, 4.005f)
                horizontalLineToRelative(3.005f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.994f)
                horizontalLineToRelative(3.004f)
                close()
            }
        }
        .build()
        return _bxUpArrowCircle!!
    }

private var _bxUpArrowCircle: ImageVector? = null
