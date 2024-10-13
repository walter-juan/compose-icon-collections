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

public val RegularGroup.BxPhone: ImageVector
    get() {
        if (_bxPhone != null) {
            return _bxPhone!!
        }
        _bxPhone = Builder(name = "BxPhone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.707f, 12.293f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -1.414f, 0.0f)
                lineToRelative(-1.594f, 1.594f)
                curveToRelative(-0.739f, -0.22f, -2.118f, -0.72f, -2.992f, -1.594f)
                reflectiveCurveToRelative(-1.374f, -2.253f, -1.594f, -2.992f)
                lineToRelative(1.594f, -1.594f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 0.0f, -1.414f)
                lineToRelative(-4.0f, -4.0f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -1.414f, 0.0f)
                lineTo(3.581f, 5.005f)
                curveToRelative(-0.38f, 0.38f, -0.594f, 0.902f, -0.586f, 1.435f)
                curveToRelative(0.023f, 1.424f, 0.4f, 6.37f, 4.298f, 10.268f)
                reflectiveCurveToRelative(8.844f, 4.274f, 10.269f, 4.298f)
                horizontalLineToRelative(0.028f)
                curveToRelative(0.528f, 0.0f, 1.027f, -0.208f, 1.405f, -0.586f)
                lineToRelative(2.712f, -2.712f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 0.0f, -1.414f)
                lineToRelative(-4.0f, -4.001f)
                close()
                moveTo(17.58f, 19.005f)
                curveToRelative(-1.248f, -0.021f, -5.518f, -0.356f, -8.873f, -3.712f)
                curveToRelative(-3.366f, -3.366f, -3.692f, -7.651f, -3.712f, -8.874f)
                lineTo(7.0f, 4.414f)
                lineTo(9.586f, 7.0f)
                lineTo(8.293f, 8.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.272f, 0.912f)
                curveToRelative(0.024f, 0.115f, 0.611f, 2.842f, 2.271f, 4.502f)
                reflectiveCurveToRelative(4.387f, 2.247f, 4.502f, 2.271f)
                arcToRelative(0.991f, 0.991f, 0.0f, false, false, 0.912f, -0.271f)
                lineTo(17.0f, 14.414f)
                lineTo(19.586f, 17.0f)
                lineToRelative(-2.006f, 2.005f)
                close()
            }
        }
        .build()
        return _bxPhone!!
    }

private var _bxPhone: ImageVector? = null
