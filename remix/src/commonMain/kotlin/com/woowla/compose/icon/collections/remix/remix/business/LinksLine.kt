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

public val BusinessGroup.LinksLine: ImageVector
    get() {
        if (_linksLine != null) {
            return _linksLine!!
        }
        _linksLine = Builder(name = "LinksLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.061f, 8.111f)
                lineTo(14.475f, 9.525f)
                curveTo(17.209f, 12.259f, 17.209f, 16.691f, 14.475f, 19.425f)
                lineTo(14.121f, 19.778f)
                curveTo(11.388f, 22.512f, 6.956f, 22.512f, 4.222f, 19.778f)
                curveTo(1.488f, 17.045f, 1.488f, 12.612f, 4.222f, 9.879f)
                lineTo(5.636f, 11.293f)
                curveTo(3.683f, 13.246f, 3.683f, 16.411f, 5.636f, 18.364f)
                curveTo(7.589f, 20.317f, 10.755f, 20.317f, 12.707f, 18.364f)
                lineTo(13.061f, 18.01f)
                curveTo(15.013f, 16.058f, 15.013f, 12.892f, 13.061f, 10.939f)
                lineTo(11.646f, 9.525f)
                lineTo(13.061f, 8.111f)
                close()
                moveTo(19.778f, 14.121f)
                lineTo(18.364f, 12.707f)
                curveTo(20.317f, 10.755f, 20.317f, 7.589f, 18.364f, 5.636f)
                curveTo(16.411f, 3.683f, 13.246f, 3.683f, 11.293f, 5.636f)
                lineTo(10.939f, 5.99f)
                curveTo(8.987f, 7.942f, 8.987f, 11.108f, 10.939f, 13.061f)
                lineTo(12.354f, 14.475f)
                lineTo(10.939f, 15.889f)
                lineTo(9.525f, 14.475f)
                curveTo(6.792f, 11.741f, 6.792f, 7.309f, 9.525f, 4.575f)
                lineTo(9.879f, 4.222f)
                curveTo(12.612f, 1.488f, 17.045f, 1.488f, 19.778f, 4.222f)
                curveTo(22.512f, 6.956f, 22.512f, 11.388f, 19.778f, 14.121f)
                close()
            }
        }
        .build()
        return _linksLine!!
    }

private var _linksLine: ImageVector? = null
