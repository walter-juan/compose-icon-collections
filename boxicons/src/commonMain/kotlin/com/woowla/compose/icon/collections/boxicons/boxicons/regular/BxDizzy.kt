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

public val RegularGroup.BxDizzy: ImageVector
    get() {
        if (_bxDizzy != null) {
            return _bxDizzy!!
        }
        _bxDizzy = Builder(name = "BxDizzy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(10.707f, 12.293f)
                lineTo(9.414f, 11.0f)
                lineToRelative(1.293f, -1.293f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(8.0f, 9.586f)
                lineTo(6.707f, 8.293f)
                lineTo(5.293f, 9.707f)
                lineTo(6.586f, 11.0f)
                lineToRelative(-1.293f, 1.293f)
                lineToRelative(1.414f, 1.414f)
                lineTo(8.0f, 12.414f)
                lineToRelative(1.293f, 1.293f)
                close()
                moveTo(17.293f, 8.293f)
                lineTo(16.0f, 9.586f)
                lineToRelative(-1.293f, -1.293f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(14.586f, 11.0f)
                lineToRelative(-1.293f, 1.293f)
                lineToRelative(1.414f, 1.414f)
                lineTo(16.0f, 12.414f)
                lineToRelative(1.293f, 1.293f)
                lineToRelative(1.414f, -1.414f)
                lineTo(17.414f, 11.0f)
                lineToRelative(1.293f, -1.293f)
                close()
                moveTo(10.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _bxDizzy!!
    }

private var _bxDizzy: ImageVector? = null
