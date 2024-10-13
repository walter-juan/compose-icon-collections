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

public val SolidGroup.BxsColorFill: ImageVector
    get() {
        if (_bxsColorFill != null) {
            return _bxsColorFill!!
        }
        _bxsColorFill = Builder(name = "BxsColorFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 14.0f)
                curveToRelative(-0.092f, 0.064f, -2.0f, 2.083f, -2.0f, 3.5f)
                curveToRelative(0.0f, 1.494f, 0.949f, 2.448f, 2.0f, 2.5f)
                curveToRelative(0.906f, 0.044f, 2.0f, -0.891f, 2.0f, -2.5f)
                curveToRelative(0.0f, -1.5f, -1.908f, -3.436f, -2.0f, -3.5f)
                close()
                moveTo(9.586f, 20.0f)
                curveToRelative(0.378f, 0.378f, 0.88f, 0.586f, 1.414f, 0.586f)
                reflectiveCurveToRelative(1.036f, -0.208f, 1.414f, -0.586f)
                lineToRelative(7.0f, -7.0f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(11.0f, 4.586f)
                lineTo(8.707f, 2.293f)
                lineTo(7.293f, 3.707f)
                lineTo(9.586f, 6.0f)
                lineTo(4.0f, 11.586f)
                curveToRelative(-0.378f, 0.378f, -0.586f, 0.88f, -0.586f, 1.414f)
                reflectiveCurveToRelative(0.208f, 1.036f, 0.586f, 1.414f)
                lineTo(9.586f, 20.0f)
                close()
                moveTo(11.0f, 7.414f)
                lineTo(16.586f, 13.0f)
                horizontalLineTo(5.414f)
                lineTo(11.0f, 7.414f)
                close()
            }
        }
        .build()
        return _bxsColorFill!!
    }

private var _bxsColorFill: ImageVector? = null
