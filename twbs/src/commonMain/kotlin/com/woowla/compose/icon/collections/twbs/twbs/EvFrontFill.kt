package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.EvFrontFill: ImageVector
    get() {
        if (_evFrontFill != null) {
            return _evFrontFill!!
        }
        _evFrontFill = Builder(name = "EvFrontFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.52f, 3.515f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.82f, 2.0f)
                horizontalLineToRelative(6.362f)
                curveToRelative(1.0f, 0.0f, 1.904f, 0.596f, 2.298f, 1.515f)
                lineToRelative(0.792f, 1.848f)
                curveToRelative(0.075f, 0.175f, 0.21f, 0.319f, 0.38f, 0.404f)
                curveToRelative(0.5f, 0.25f, 0.855f, 0.715f, 0.965f, 1.262f)
                lineToRelative(0.335f, 1.679f)
                quadToRelative(0.05f, 0.242f, 0.049f, 0.49f)
                verticalLineToRelative(0.413f)
                curveToRelative(0.0f, 0.814f, -0.39f, 1.543f, -1.0f, 1.997f)
                lineTo(15.001f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-1.338f)
                curveToRelative(-1.292f, 0.048f, -2.745f, 0.088f, -4.0f, 0.088f)
                reflectiveCurveToRelative(-2.708f, -0.04f, -4.0f, -0.088f)
                lineTo(4.001f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-1.892f)
                curveToRelative(-0.61f, -0.454f, -1.0f, -1.183f, -1.0f, -1.997f)
                verticalLineToRelative(-0.413f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.049f, -0.49f)
                lineToRelative(0.335f, -1.68f)
                curveToRelative(0.11f, -0.546f, 0.465f, -1.012f, 0.964f, -1.261f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.381f, -0.404f)
                lineToRelative(0.792f, -1.848f)
                close()
                moveTo(9.27f, 4.025f)
                arcToRelative(0.186f, 0.186f, 0.0f, false, false, -0.23f, 0.034f)
                lineTo(6.05f, 7.246f)
                arcToRelative(0.188f, 0.188f, 0.0f, false, false, 0.137f, 0.316f)
                horizontalLineToRelative(1.241f)
                lineToRelative(-0.673f, 2.195f)
                arcToRelative(0.19f, 0.19f, 0.0f, false, false, 0.085f, 0.218f)
                curveToRelative(0.075f, 0.043f, 0.17f, 0.03f, 0.23f, -0.034f)
                lineToRelative(2.88f, -3.187f)
                arcToRelative(0.188f, 0.188f, 0.0f, false, false, -0.137f, -0.316f)
                lineTo(8.572f, 6.438f)
                lineToRelative(0.782f, -2.195f)
                arcToRelative(0.19f, 0.19f, 0.0f, false, false, -0.085f, -0.218f)
                close()
            }
        }
        .build()
        return _evFrontFill!!
    }

private var _evFrontFill: ImageVector? = null
