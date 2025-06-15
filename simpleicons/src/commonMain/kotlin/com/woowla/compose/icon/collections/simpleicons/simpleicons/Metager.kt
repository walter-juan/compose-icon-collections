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

public val Simpleicons.Metager: ImageVector
    get() {
        if (_metager != null) {
            return _metager!!
        }
        _metager = Builder(name = "Metager", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.563f, 0.0f)
                verticalLineToRelative(6.92f)
                horizontalLineToRelative(2.083f)
                curveToRelative(0.818f, 0.0f, 1.227f, -0.434f, 1.227f, -1.289f)
                lineTo(4.873f, 3.264f)
                horizontalLineToRelative(10.391f)
                curveToRelative(3.035f, 0.0f, 4.552f, 1.613f, 4.552f, 4.736f)
                verticalLineToRelative(2.575f)
                lineTo(4.873f, 10.575f)
                verticalLineToRelative(1.562f)
                curveToRelative(0.0f, 0.851f, -0.412f, 1.288f, -1.227f, 1.288f)
                lineTo(0.827f, 13.425f)
                verticalLineToRelative(4.23f)
                curveTo(0.827f, 21.885f, 2.942f, 24.0f, 7.218f, 24.0f)
                horizontalLineToRelative(8.46f)
                curveToRelative(4.965f, 0.0f, 7.494f, -2.575f, 7.494f, -7.678f)
                lineTo(23.172f, 7.678f)
                curveTo(23.172f, 2.575f, 20.643f, 0.0f, 15.678f, 0.0f)
                close()
                moveTo(10.269f, 13.425f)
                horizontalLineToRelative(2.246f)
                curveToRelative(1.513f, 0.0f, 2.089f, 0.777f, 2.089f, 2.226f)
                verticalLineToRelative(3.389f)
                curveToRelative(0.0f, 1.15f, -0.577f, 1.747f, -1.705f, 1.747f)
                horizontalLineToRelative(-1.16f)
                curveToRelative(-0.976f, 0.0f, -1.47f, -0.578f, -1.47f, -1.726f)
                verticalLineToRelative(-5.636f)
            }
        }
        .build()
        return _metager!!
    }

private var _metager: ImageVector? = null
