package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxColorFill: ImageVector
    get() {
        if (_bxColorFill != null) {
            return _bxColorFill!!
        }
        _bxColorFill = Builder(name = "BxColorFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 13.998f)
                curveToRelative(-0.092f, 0.065f, -2.0f, 2.083f, -2.0f, 3.5f)
                curveToRelative(0.0f, 1.494f, 0.949f, 2.448f, 2.0f, 2.5f)
                curveToRelative(0.906f, 0.044f, 2.0f, -0.891f, 2.0f, -2.5f)
                curveToRelative(0.0f, -1.5f, -1.908f, -3.435f, -2.0f, -3.5f)
                close()
                moveTo(3.414f, 12.998f)
                curveToRelative(0.0f, 0.534f, 0.208f, 1.036f, 0.586f, 1.414f)
                lineToRelative(5.586f, 5.586f)
                curveToRelative(0.378f, 0.378f, 0.88f, 0.586f, 1.414f, 0.586f)
                reflectiveCurveToRelative(1.036f, -0.208f, 1.414f, -0.586f)
                lineToRelative(7.0f, -7.0f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(11.0f, 4.584f)
                lineTo(8.707f, 2.291f)
                lineTo(7.293f, 3.705f)
                lineToRelative(2.293f, 2.293f)
                lineTo(4.0f, 11.584f)
                curveToRelative(-0.378f, 0.378f, -0.586f, 0.88f, -0.586f, 1.414f)
                close()
                moveTo(11.0f, 7.412f)
                lineToRelative(5.586f, 5.586f)
                lineTo(11.0f, 18.584f)
                horizontalLineToRelative(0.001f)
                lineToRelative(-0.001f, 1.0f)
                verticalLineToRelative(-1.0f)
                lineToRelative(-5.586f, -5.586f)
                lineTo(11.0f, 7.412f)
                close()
            }
        }
        .build()
        return _bxColorFill!!
    }

private var _bxColorFill: ImageVector? = null
