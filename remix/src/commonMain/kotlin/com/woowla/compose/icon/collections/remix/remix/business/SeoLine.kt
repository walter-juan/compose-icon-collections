package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.SeoLine: ImageVector
    get() {
        if (_seoLine != null) {
            return _seoLine!!
        }
        _seoLine = Builder(name = "SeoLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                curveTo(4.134f, 3.0f, 1.0f, 6.134f, 1.0f, 10.0f)
                curveTo(1.0f, 13.866f, 4.134f, 17.0f, 8.0f, 17.0f)
                horizontalLineTo(9.071f)
                curveTo(9.024f, 16.673f, 9.0f, 16.34f, 9.0f, 16.0f)
                curveTo(9.0f, 15.66f, 9.024f, 15.327f, 9.071f, 15.0f)
                horizontalLineTo(8.0f)
                curveTo(5.239f, 15.0f, 3.0f, 12.761f, 3.0f, 10.0f)
                curveTo(3.0f, 7.239f, 5.239f, 5.0f, 8.0f, 5.0f)
                horizontalLineTo(16.0f)
                curveTo(18.761f, 5.0f, 21.0f, 7.239f, 21.0f, 10.0f)
                curveTo(21.0f, 10.343f, 20.965f, 10.677f, 20.9f, 11.001f)
                curveTo(21.485f, 11.575f, 21.97f, 12.251f, 22.326f, 13.0f)
                curveTo(22.758f, 12.091f, 23.0f, 11.074f, 23.0f, 10.0f)
                curveTo(23.0f, 6.134f, 19.866f, 3.0f, 16.0f, 3.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveTo(14.343f, 13.0f, 13.0f, 14.343f, 13.0f, 16.0f)
                curveTo(13.0f, 17.657f, 14.343f, 19.0f, 16.0f, 19.0f)
                curveTo(17.657f, 19.0f, 19.0f, 17.657f, 19.0f, 16.0f)
                curveTo(19.0f, 14.343f, 17.657f, 13.0f, 16.0f, 13.0f)
                close()
                moveTo(11.0f, 16.0f)
                curveTo(11.0f, 13.239f, 13.239f, 11.0f, 16.0f, 11.0f)
                curveTo(18.761f, 11.0f, 21.0f, 13.239f, 21.0f, 16.0f)
                curveTo(21.0f, 17.019f, 20.695f, 17.967f, 20.172f, 18.757f)
                lineTo(22.707f, 21.293f)
                lineTo(21.293f, 22.707f)
                lineTo(18.757f, 20.172f)
                curveTo(17.967f, 20.695f, 17.019f, 21.0f, 16.0f, 21.0f)
                curveTo(13.239f, 21.0f, 11.0f, 18.761f, 11.0f, 16.0f)
                close()
            }
        }
        .build()
        return _seoLine!!
    }

private var _seoLine: ImageVector? = null
