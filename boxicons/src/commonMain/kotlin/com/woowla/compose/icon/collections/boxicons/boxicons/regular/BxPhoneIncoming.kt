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

public val RegularGroup.BxPhoneIncoming: ImageVector
    get() {
        if (_bxPhoneIncoming != null) {
            return _bxPhoneIncoming!!
        }
        _bxPhoneIncoming = Builder(name = "BxPhoneIncoming", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.712f, 13.288f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -1.414f, 0.0f)
                lineToRelative(-1.597f, 1.596f)
                curveToRelative(-0.824f, -0.245f, -2.166f, -0.771f, -2.99f, -1.596f)
                curveToRelative(-0.874f, -0.874f, -1.374f, -2.253f, -1.594f, -2.992f)
                lineToRelative(1.594f, -1.594f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 0.0f, -1.414f)
                lineToRelative(-4.0f, -4.0f)
                arcToRelative(1.03f, 1.03f, 0.0f, false, false, -1.414f, 0.0f)
                lineToRelative(-2.709f, 2.71f)
                curveToRelative(-0.382f, 0.38f, -0.597f, 0.904f, -0.588f, 1.437f)
                curveToRelative(0.022f, 1.423f, 0.396f, 6.367f, 4.297f, 10.268f)
                curveTo(10.195f, 21.6f, 15.142f, 21.977f, 16.566f, 22.0f)
                horizontalLineToRelative(0.028f)
                curveToRelative(0.528f, 0.0f, 1.027f, -0.208f, 1.405f, -0.586f)
                lineToRelative(2.712f, -2.712f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 0.0f, -1.414f)
                lineToRelative(-3.999f, -4.0f)
                close()
                moveTo(16.585f, 20.0f)
                curveToRelative(-1.248f, -0.021f, -5.518f, -0.356f, -8.874f, -3.712f)
                curveTo(4.343f, 12.92f, 4.019f, 8.636f, 4.0f, 7.414f)
                lineToRelative(2.004f, -2.005f)
                lineTo(8.59f, 7.995f)
                lineTo(7.297f, 9.288f)
                curveToRelative(-0.238f, 0.238f, -0.34f, 0.582f, -0.271f, 0.912f)
                curveToRelative(0.024f, 0.115f, 0.611f, 2.842f, 2.271f, 4.502f)
                reflectiveCurveToRelative(4.387f, 2.247f, 4.502f, 2.271f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, false, 0.912f, -0.271f)
                lineToRelative(1.293f, -1.293f)
                lineToRelative(2.586f, 2.586f)
                lineTo(16.585f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.795f, 6.791f)
                lineTo(13.005f, 4.0f)
                verticalLineToRelative(6.995f)
                horizontalLineTo(20.0f)
                lineToRelative(-2.791f, -2.79f)
                lineToRelative(4.503f, -4.503f)
                lineToRelative(-1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _bxPhoneIncoming!!
    }

private var _bxPhoneIncoming: ImageVector? = null
