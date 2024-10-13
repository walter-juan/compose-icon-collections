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

public val SolidGroup.BxsDizzy: ImageVector
    get() {
        if (_bxsDizzy != null) {
            return _bxsDizzy!!
        }
        _bxsDizzy = Builder(name = "BxsDizzy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(8.0f, 12.414f)
                lineToRelative(-1.293f, 1.293f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(6.586f, 11.0f)
                lineTo(5.293f, 9.707f)
                lineToRelative(1.414f, -1.414f)
                lineTo(8.0f, 9.586f)
                lineToRelative(1.293f, -1.293f)
                lineToRelative(1.414f, 1.414f)
                lineTo(9.414f, 11.0f)
                lineToRelative(1.293f, 1.293f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(8.0f, 12.414f)
                close()
                moveTo(14.0f, 18.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.707f, 12.293f)
                lineTo(17.293f, 13.707f)
                lineTo(16.0f, 12.414f)
                lineToRelative(-1.293f, 1.293f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(14.586f, 11.0f)
                lineToRelative(-1.293f, -1.293f)
                lineToRelative(1.414f, -1.414f)
                lineTo(16.0f, 9.586f)
                lineToRelative(1.293f, -1.293f)
                lineToRelative(1.414f, 1.414f)
                lineTo(17.414f, 11.0f)
                lineToRelative(1.293f, 1.293f)
                close()
            }
        }
        .build()
        return _bxsDizzy!!
    }

private var _bxsDizzy: ImageVector? = null
