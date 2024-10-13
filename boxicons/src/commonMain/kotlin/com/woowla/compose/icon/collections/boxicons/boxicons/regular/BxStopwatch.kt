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

public val RegularGroup.BxStopwatch: ImageVector
    get() {
        if (_bxStopwatch != null) {
            return _bxStopwatch!!
        }
        _bxStopwatch = Builder(name = "BxStopwatch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, 3.589f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.589f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.589f, 8.0f, -8.0f)
                reflectiveCurveToRelative(-3.589f, -8.0f, -8.0f, -8.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(9.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 4.0f)
                close()
                moveTo(19.293f, 7.707f)
                lineTo(17.293f, 5.707f)
                lineTo(18.707f, 4.293f)
                lineTo(20.707f, 6.293f)
                close()
            }
        }
        .build()
        return _bxStopwatch!!
    }

private var _bxStopwatch: ImageVector? = null
