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

public val Twbs.MegaphoneFill: ImageVector
    get() {
        if (_megaphoneFill != null) {
            return _megaphoneFill!!
        }
        _megaphoneFill = Builder(name = "MegaphoneFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                close()
                moveTo(12.0f, 3.224f)
                curveToRelative(-2.067f, 0.95f, -4.539f, 1.481f, -7.0f, 1.656f)
                verticalLineToRelative(6.237f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, true, 1.088f, 0.085f)
                curveToRelative(2.053f, 0.204f, 4.038f, 0.668f, 5.912f, 1.56f)
                close()
                moveTo(4.0f, 11.065f)
                lineTo(4.0f, 4.934f)
                curveToRelative(-0.68f, 0.027f, -1.399f, 0.043f, -2.008f, 0.053f)
                arcTo(2.02f, 2.02f, 0.0f, false, false, 0.0f, 7.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.106f, 0.896f, 1.996f, 1.994f, 2.009f)
                lineToRelative(0.496f, 0.008f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 1.51f, 0.048f)
                moveToRelative(1.39f, 1.081f)
                quadToRelative(0.428f, 0.032f, 0.85f, 0.078f)
                lineToRelative(0.253f, 1.69f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.983f, 1.187f)
                horizontalLineToRelative(-0.548f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.916f, -0.599f)
                lineToRelative(-1.314f, -2.48f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, true, 1.692f, 0.064f)
                quadToRelative(0.491f, 0.026f, 0.966f, 0.06f)
            }
        }
        .build()
        return _megaphoneFill!!
    }

private var _megaphoneFill: ImageVector? = null
