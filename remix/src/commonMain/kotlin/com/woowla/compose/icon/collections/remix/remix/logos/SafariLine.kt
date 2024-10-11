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

public val LogosGroup.SafariLine: ImageVector
    get() {
        if (_safariLine != null) {
            return _safariLine!!
        }
        _safariLine = Builder(name = "SafariLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.813f, 6.503f)
                lineTo(13.415f, 13.414f)
                lineTo(6.504f, 17.812f)
                curveTo(7.709f, 18.953f, 9.269f, 19.722f, 11.001f, 19.938f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.001f)
                verticalLineTo(19.938f)
                curveTo(14.462f, 19.756f, 15.8f, 19.18f, 16.907f, 18.32f)
                lineTo(15.536f, 16.95f)
                lineTo(16.951f, 15.535f)
                lineTo(18.321f, 16.906f)
                curveTo(19.181f, 15.799f, 19.757f, 14.461f, 19.939f, 13.0f)
                horizontalLineTo(18.001f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.939f)
                curveTo(19.723f, 9.268f, 18.954f, 7.708f, 17.813f, 6.503f)
                close()
                moveTo(17.498f, 6.188f)
                curveTo(16.293f, 5.047f, 14.733f, 4.278f, 13.001f, 4.062f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.001f)
                verticalLineTo(4.062f)
                curveTo(9.54f, 4.244f, 8.202f, 4.82f, 7.095f, 5.68f)
                lineTo(8.465f, 7.05f)
                lineTo(7.051f, 8.464f)
                lineTo(5.681f, 7.094f)
                curveTo(4.821f, 8.201f, 4.245f, 9.539f, 4.063f, 11.0f)
                horizontalLineTo(6.001f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.063f)
                curveTo(4.279f, 14.732f, 5.048f, 16.292f, 6.189f, 17.497f)
                lineTo(10.587f, 10.586f)
                lineTo(17.498f, 6.188f)
                close()
                moveTo(12.001f, 22.0f)
                curveTo(6.478f, 22.0f, 2.001f, 17.523f, 2.001f, 12.0f)
                curveTo(2.001f, 6.477f, 6.478f, 2.0f, 12.001f, 2.0f)
                curveTo(17.524f, 2.0f, 22.001f, 6.477f, 22.001f, 12.0f)
                curveTo(22.001f, 17.523f, 17.524f, 22.0f, 12.001f, 22.0f)
                close()
            }
        }
        .build()
        return _safariLine!!
    }

private var _safariLine: ImageVector? = null
