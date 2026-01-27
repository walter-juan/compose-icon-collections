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

public val Simpleicons.Mezmo: ImageVector
    get() {
        if (_mezmo != null) {
            return _mezmo!!
        }
        _mezmo = Builder(name = "Mezmo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.537f, 18.084f)
                curveToRelative(0.0f, 1.28f, 0.578f, 2.176f, 1.926f, 2.176f)
                curveToRelative(1.025f, 0.0f, 1.731f, -0.767f, 2.117f, -1.856f)
                lineToRelative(3.594f, -10.369f)
                curveToRelative(0.288f, -0.862f, 0.738f, -1.342f, 1.636f, -1.342f)
                curveToRelative(0.675f, 0.0f, 1.253f, 0.48f, 1.253f, 1.342f)
                verticalLineToRelative(11.778f)
                arcToRelative(0.17f, 0.17f, 0.0f, false, false, 0.195f, 0.195f)
                horizontalLineToRelative(2.544f)
                arcToRelative(0.17f, 0.17f, 0.0f, false, false, 0.196f, -0.195f)
                verticalLineTo(7.965f)
                curveToRelative(0.0f, -2.369f, -1.83f, -4.225f, -4.11f, -4.225f)
                curveToRelative(-2.214f, 0.0f, -3.69f, 1.366f, -4.396f, 3.456f)
                lineToRelative(-1.7f, 4.991f)
                curveToRelative(-0.065f, 0.195f, -0.097f, 0.258f, -0.196f, 0.258f)
                arcToRelative(0.117f, 0.117f, 0.0f, false, true, -0.13f, -0.129f)
                verticalLineTo(7.965f)
                curveToRelative(0.0f, -2.369f, -1.829f, -4.225f, -4.109f, -4.225f)
                curveToRelative(-2.215f, 0.0f, -3.69f, 1.366f, -4.396f, 3.456f)
                lineToRelative(-1.7f, 4.991f)
                curveToRelative(-0.065f, 0.195f, -0.097f, 0.258f, -0.196f, 0.258f)
                arcToRelative(0.118f, 0.118f, 0.0f, false, true, -0.128f, -0.129f)
                verticalLineTo(4.187f)
                arcToRelative(0.17f, 0.17f, 0.0f, false, false, -0.195f, -0.195f)
                horizontalLineTo(0.198f)
                arcToRelative(0.17f, 0.17f, 0.0f, false, false, -0.196f, 0.195f)
                verticalLineToRelative(13.89f)
                curveToRelative(0.0f, 1.28f, 0.587f, 2.175f, 1.926f, 2.175f)
                curveToRelative(1.027f, 0.0f, 1.733f, -0.767f, 2.119f, -1.856f)
                lineTo(7.64f, 8.027f)
                curveToRelative(0.288f, -0.8f, 0.803f, -1.342f, 1.636f, -1.342f)
                curveToRelative(0.681f, 0.0f, 1.26f, 0.48f, 1.26f, 1.342f)
                close()
            }
        }
        .build()
        return _mezmo!!
    }

private var _mezmo: ImageVector? = null
