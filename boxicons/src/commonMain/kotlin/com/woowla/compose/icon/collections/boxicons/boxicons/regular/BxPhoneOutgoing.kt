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

public val RegularGroup.BxPhoneOutgoing: ImageVector
    get() {
        if (_bxPhoneOutgoing != null) {
            return _bxPhoneOutgoing!!
        }
        _bxPhoneOutgoing = Builder(name = "BxPhoneOutgoing", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.712f, 13.288f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -1.414f, 0.0f)
                lineToRelative(-1.594f, 1.594f)
                curveToRelative(-0.739f, -0.22f, -2.118f, -0.72f, -2.992f, -1.594f)
                reflectiveCurveToRelative(-1.374f, -2.253f, -1.594f, -2.992f)
                lineToRelative(1.594f, -1.594f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 0.0f, -1.414f)
                lineToRelative(-4.0f, -4.0f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -1.414f, 0.0f)
                lineTo(2.586f, 6.0f)
                curveToRelative(-0.38f, 0.38f, -0.594f, 0.902f, -0.586f, 1.435f)
                curveToRelative(0.023f, 1.424f, 0.4f, 6.37f, 4.298f, 10.268f)
                reflectiveCurveTo(15.142f, 21.977f, 16.566f, 22.0f)
                horizontalLineToRelative(0.028f)
                curveToRelative(0.528f, 0.0f, 1.027f, -0.208f, 1.405f, -0.586f)
                lineToRelative(2.712f, -2.712f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 0.0f, -1.414f)
                lineToRelative(-3.999f, -4.0f)
                close()
                moveTo(16.585f, 20.0f)
                curveToRelative(-1.248f, -0.021f, -5.518f, -0.356f, -8.873f, -3.712f)
                curveTo(4.346f, 12.922f, 4.02f, 8.637f, 4.0f, 7.414f)
                lineToRelative(2.005f, -2.005f)
                lineToRelative(2.586f, 2.586f)
                lineToRelative(-1.293f, 1.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.272f, 0.912f)
                curveToRelative(0.024f, 0.115f, 0.611f, 2.842f, 2.271f, 4.502f)
                reflectiveCurveToRelative(4.387f, 2.247f, 4.502f, 2.271f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, false, 0.912f, -0.271f)
                lineToRelative(1.293f, -1.293f)
                lineToRelative(2.586f, 2.586f)
                lineTo(16.585f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.795f, 5.791f)
                lineToRelative(-4.497f, 4.497f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(4.497f, -4.497f)
                lineTo(21.005f, 10.0f)
                verticalLineTo(2.995f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _bxPhoneOutgoing!!
    }

private var _bxPhoneOutgoing: ImageVector? = null
