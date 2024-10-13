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

public val RegularGroup.BxVolumeMute: ImageVector
    get() {
        if (_bxVolumeMute != null) {
            return _bxVolumeMute!!
        }
        _bxVolumeMute = Builder(name = "BxVolumeMute", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.707f, 20.293f)
                lineToRelative(-2.023f, -2.023f)
                arcTo(9.566f, 9.566f, 0.0f, false, false, 21.999f, 12.0f)
                curveToRelative(0.0f, -4.091f, -2.472f, -7.453f, -5.999f, -9.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(2.387f, 1.386f, 3.999f, 4.047f, 3.999f, 7.0f)
                arcToRelative(8.113f, 8.113f, 0.0f, false, true, -1.672f, 4.913f)
                lineToRelative(-1.285f, -1.285f)
                curveTo(17.644f, 14.536f, 18.0f, 13.19f, 18.0f, 12.0f)
                curveToRelative(0.0f, -1.771f, -0.775f, -3.9f, -2.0f, -5.0f)
                verticalLineToRelative(7.586f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.554f, -0.832f)
                lineTo(7.727f, 6.313f)
                lineToRelative(-4.02f, -4.02f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(18.0f, 18.0f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(12.0f, 5.868f)
                verticalLineToRelative(4.718f)
                lineTo(9.169f, 7.755f)
                lineTo(12.0f, 5.868f)
                close()
                moveTo(4.0f, 17.0f)
                horizontalLineToRelative(2.697f)
                lineToRelative(5.748f, 3.832f)
                arcToRelative(1.004f, 1.004f, 0.0f, false, false, 1.027f, 0.05f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 20.0f)
                verticalLineToRelative(-1.879f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineToRelative(2.011f)
                lineToRelative(-4.445f, -2.964f)
                curveToRelative(-0.025f, -0.017f, -0.056f, -0.02f, -0.082f, -0.033f)
                arcToRelative(0.986f, 0.986f, 0.0f, false, false, -0.382f, -0.116f)
                curveTo(7.059f, 15.016f, 7.032f, 15.0f, 7.0f, 15.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(0.879f)
                lineTo(3.102f, 7.223f)
                arcTo(1.995f, 1.995f, 0.0f, false, false, 2.0f, 9.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bxVolumeMute!!
    }

private var _bxVolumeMute: ImageVector? = null
