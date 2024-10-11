package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.WordpressLine: ImageVector
    get() {
        if (_wordpressLine != null) {
            return _wordpressLine!!
        }
        _wordpressLine = Builder(name = "WordpressLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                close()
                moveTo(14.606f, 19.566f)
                lineTo(12.451f, 13.581f)
                lineTo(10.27f, 19.813f)
                curveTo(10.827f, 19.935f, 11.406f, 20.0f, 12.0f, 20.0f)
                curveTo(12.912f, 20.0f, 13.789f, 19.847f, 14.606f, 19.566f)
                close()
                moveTo(17.074f, 18.185f)
                curveTo(18.861f, 16.718f, 20.0f, 14.492f, 20.0f, 12.0f)
                curveTo(20.0f, 10.974f, 19.807f, 9.994f, 19.455f, 9.092f)
                curveTo(19.205f, 10.546f, 18.763f, 12.441f, 18.479f, 13.407f)
                lineTo(17.074f, 18.185f)
                close()
                moveTo(16.873f, 5.655f)
                curveTo(15.523f, 4.617f, 13.834f, 4.0f, 12.0f, 4.0f)
                curveTo(9.474f, 4.0f, 7.221f, 5.171f, 5.755f, 7.0f)
                horizontalLineTo(7.145f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.395f)
                lineTo(9.15f, 16.958f)
                lineTo(11.377f, 10.596f)
                lineTo(10.802f, 9.0f)
                horizontalLineTo(8.645f)
                lineTo(8.645f, 7.0f)
                horizontalLineTo(13.645f)
                lineTo(13.645f, 9.0f)
                horizontalLineTo(12.928f)
                lineTo(15.549f, 16.282f)
                lineTo(16.561f, 12.843f)
                curveTo(17.084f, 11.01f, 16.653f, 10.211f, 16.222f, 9.413f)
                curveTo(15.933f, 8.879f, 15.645f, 8.345f, 15.645f, 7.5f)
                curveTo(15.645f, 6.669f, 16.152f, 5.957f, 16.873f, 5.655f)
                close()
                moveTo(4.425f, 9.421f)
                curveTo(4.149f, 10.23f, 4.0f, 11.098f, 4.0f, 12.0f)
                curveTo(4.0f, 14.81f, 5.449f, 17.281f, 7.64f, 18.708f)
                lineTo(4.425f, 9.421f)
                close()
            }
        }
        .build()
        return _wordpressLine!!
    }

private var _wordpressLine: ImageVector? = null
