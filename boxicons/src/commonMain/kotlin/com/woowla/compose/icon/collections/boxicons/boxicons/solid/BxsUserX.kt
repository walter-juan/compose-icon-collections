package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsUserX: ImageVector
    get() {
        if (_bxsUserX != null) {
            return _bxsUserX!!
        }
        _bxsUserX = Builder(name = "BxsUserX", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 12.052f)
                curveToRelative(1.995f, 0.0f, 3.5f, -1.505f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.505f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.505f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.505f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(9.0f, 13.0f)
                lineTo(7.0f, 13.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(20.293f, 8.293f)
                lineTo(18.0f, 10.586f)
                lineToRelative(-2.293f, -2.293f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.292f, 2.292f)
                lineToRelative(-2.293f, 2.293f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(2.294f, 2.294f)
                lineToRelative(1.414f, -1.414f)
                lineTo(19.414f, 12.0f)
                lineToRelative(2.293f, -2.293f)
                close()
            }
        }
        .build()
        return _bxsUserX!!
    }

private var _bxsUserX: ImageVector? = null
