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

public val Simpleicons.Outline: ImageVector
    get() {
        if (_outline != null) {
            return _outline!!
        }
        _outline = Builder(name = "Outline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.081f, 21.857f)
                lineTo(15.081f, 22.459f)
                curveTo(15.081f, 23.636f, 13.812f, 24.378f, 12.785f, 23.8f)
                lineTo(3.543f, 18.602f)
                curveTo(3.058f, 18.329f, 2.758f, 17.816f, 2.758f, 17.26f)
                lineTo(2.758f, 6.742f)
                curveTo(2.758f, 6.185f, 3.058f, 5.672f, 3.543f, 5.399f)
                lineTo(12.785f, 0.201f)
                curveTo(13.812f, -0.378f, 15.082f, 0.365f, 15.081f, 1.544f)
                lineTo(15.081f, 2.145f)
                lineTo(16.178f, 1.814f)
                curveTo(17.167f, 1.517f, 18.163f, 2.258f, 18.162f, 3.29f)
                lineTo(18.162f, 3.915f)
                lineTo(19.511f, 3.746f)
                curveTo(20.431f, 3.632f, 21.243f, 4.348f, 21.242f, 5.275f)
                lineTo(21.242f, 18.726f)
                curveTo(21.243f, 19.652f, 20.431f, 20.37f, 19.511f, 20.254f)
                lineTo(18.162f, 20.085f)
                lineTo(18.162f, 20.71f)
                curveTo(18.163f, 21.743f, 17.167f, 22.484f, 16.178f, 22.186f)
                lineTo(15.081f, 21.857f)
                close()
                moveTo(15.081f, 20.249f)
                lineTo(16.621f, 20.71f)
                lineTo(16.621f, 3.29f)
                lineTo(15.081f, 3.753f)
                lineTo(15.081f, 20.249f)
                close()
                moveTo(18.162f, 5.467f)
                lineTo(18.162f, 18.534f)
                lineTo(19.702f, 18.726f)
                lineTo(19.702f, 5.275f)
                lineTo(18.162f, 5.467f)
                close()
                moveTo(2.758f, 16.801f)
                lineTo(2.758f, 7.2f)
                lineTo(2.758f, 16.801f)
                close()
                moveTo(4.298f, 6.742f)
                lineTo(4.298f, 17.26f)
                lineTo(13.54f, 22.459f)
                lineTo(13.54f, 1.544f)
                lineTo(4.298f, 6.742f)
                close()
                moveTo(5.838f, 7.765f)
                lineTo(7.379f, 6.995f)
                lineTo(7.379f, 17.005f)
                lineTo(5.838f, 16.235f)
                lineTo(5.838f, 7.765f)
                close()
            }
        }
        .build()
        return _outline!!
    }

private var _outline: ImageVector? = null
