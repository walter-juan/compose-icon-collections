package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Bootstrap: ImageVector
    get() {
        if (_bootstrap != null) {
            return _bootstrap!!
        }
        _bootstrap = Builder(name = "Bootstrap", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(333.5f, 201.4f)
                curveToRelative(0.0f, -22.1f, -15.6f, -34.3f, -43.0f, -34.3f)
                lineToRelative(-50.4f, 0.0f)
                lineToRelative(0.0f, 71.2f)
                lineToRelative(42.5f, 0.0f)
                curveToRelative(32.8f, -0.1f, 50.9f, -13.3f, 50.9f, -36.9f)
                close()
                moveTo(517.0f, 188.6f)
                curveToRelative(-9.5f, -30.9f, -10.9f, -68.8f, -9.8f, -98.1f)
                curveToRelative(1.1f, -30.5f, -22.7f, -58.5f, -54.7f, -58.5f)
                lineTo(123.7f, 32.0f)
                curveToRelative(-32.1f, 0.0f, -55.8f, 28.1f, -54.7f, 58.5f)
                curveToRelative(1.0f, 29.3f, -0.3f, 67.2f, -9.8f, 98.1f)
                curveToRelative(-9.6f, 31.0f, -25.7f, 50.6f, -52.2f, 53.1f)
                lineToRelative(0.0f, 28.5f)
                curveToRelative(26.4f, 2.5f, 42.6f, 22.1f, 52.2f, 53.1f)
                curveToRelative(9.5f, 30.9f, 10.9f, 68.8f, 9.8f, 98.1f)
                curveToRelative(-1.1f, 30.5f, 22.7f, 58.5f, 54.7f, 58.5f)
                lineToRelative(328.7f, 0.0f)
                curveToRelative(32.1f, 0.0f, 55.8f, -28.1f, 54.7f, -58.5f)
                curveToRelative(-1.0f, -29.3f, 0.3f, -67.2f, 9.8f, -98.1f)
                curveToRelative(9.6f, -31.0f, 25.7f, -50.6f, 52.1f, -53.1f)
                lineToRelative(0.0f, -28.5f)
                curveToRelative(-26.3f, -2.5f, -42.5f, -22.1f, -52.0f, -53.1f)
                close()
                moveTo(300.2f, 375.1f)
                lineToRelative(-97.9f, 0.0f)
                lineToRelative(0.0f, -238.3f)
                lineToRelative(97.4f, 0.0f)
                curveToRelative(43.3f, 0.0f, 71.7f, 23.4f, 71.7f, 59.4f)
                curveToRelative(0.0f, 25.3f, -19.1f, 47.9f, -43.5f, 51.8f)
                lineToRelative(0.0f, 1.3f)
                curveToRelative(33.2f, 3.6f, 55.5f, 26.6f, 55.5f, 58.3f)
                curveToRelative(0.0f, 42.1f, -31.3f, 67.5f, -83.2f, 67.5f)
                close()
                moveTo(290.2f, 266.4f)
                lineToRelative(-50.1f, 0.0f)
                lineToRelative(0.0f, 78.4f)
                lineToRelative(52.3f, 0.0f)
                curveToRelative(34.2f, 0.0f, 52.3f, -13.7f, 52.3f, -39.5f)
                curveToRelative(0.0f, -25.7f, -18.6f, -38.9f, -54.5f, -38.9f)
                close()
            }
        }
        .build()
        return _bootstrap!!
    }

private var _bootstrap: ImageVector? = null
