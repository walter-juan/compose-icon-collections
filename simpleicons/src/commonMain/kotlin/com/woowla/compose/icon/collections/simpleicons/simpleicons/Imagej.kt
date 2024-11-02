package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Imagej: ImageVector
    get() {
        if (_imagej != null) {
            return _imagej!!
        }
        _imagej = Builder(name = "Imagej", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.129f, 17.508f)
                horizontalLineToRelative(-8.072f)
                arcToRelative(0.187f, 0.187f, 0.0f, false, true, -0.187f, -0.187f)
                verticalLineToRelative(-0.444f)
                arcToRelative(0.187f, 0.187f, 0.0f, false, true, 0.187f, -0.187f)
                horizontalLineToRelative(8.072f)
                arcToRelative(0.187f, 0.187f, 0.0f, false, true, 0.187f, 0.187f)
                verticalLineToRelative(0.444f)
                arcToRelative(0.187f, 0.187f, 0.0f, false, true, -0.187f, 0.187f)
                close()
                moveTo(18.752f, 5.313f)
                curveToRelative(-1.423f, 0.003f, -4.218f, -0.01f, -5.641f, -0.007f)
                arcToRelative(0.403f, 0.403f, 0.0f, false, false, -0.403f, 0.403f)
                verticalLineToRelative(3.606f)
                curveToRelative(0.0f, 0.223f, 0.181f, 0.403f, 0.403f, 0.403f)
                horizontalLineToRelative(1.747f)
                verticalLineToRelative(8.19f)
                arcToRelative(1.827f, 1.827f, 0.0f, false, true, -0.911f, 1.576f)
                arcToRelative(1.828f, 1.828f, 0.0f, false, true, -1.822f, 0.0f)
                arcToRelative(1.828f, 1.828f, 0.0f, false, true, -0.911f, -1.578f)
                lineTo(6.941f, 17.908f)
                curveToRelative(0.0f, 2.171f, 1.168f, 4.193f, 3.047f, 5.278f)
                curveToRelative(0.94f, 0.543f, 1.994f, 0.814f, 3.047f, 0.814f)
                reflectiveCurveToRelative(2.108f, -0.271f, 3.047f, -0.814f)
                curveToRelative(1.88f, -1.084f, 3.044f, -3.109f, 3.047f, -5.274f)
                lineTo(19.13f, 5.692f)
                arcToRelative(0.379f, 0.379f, 0.0f, false, false, -0.378f, -0.379f)
                close()
                moveTo(7.455f, 15.231f)
                horizontalLineToRelative(3.276f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, false, 0.64f, -0.64f)
                lineTo(11.371f, 0.64f)
                arcTo(0.64f, 0.64f, 0.0f, false, false, 10.731f, 0.0f)
                horizontalLineToRelative(-3.276f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, false, -0.64f, 0.64f)
                verticalLineToRelative(13.95f)
                curveToRelative(0.0f, 0.354f, 0.287f, 0.64f, 0.64f, 0.64f)
                close()
            }
        }
        .build()
        return _imagej!!
    }

private var _imagej: ImageVector? = null
