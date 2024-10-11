package com.woowla.compose.icon.collections.remix.remix.userandfaces

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.UserAndFacesGroup

public val UserAndFacesGroup.Ghost2Fill: ImageVector
    get() {
        if (_ghost2Fill != null) {
            return _ghost2Fill!!
        }
        _ghost2Fill = Builder(name = "Ghost2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(15.5f, 2.0f, 18.0f, 5.0f, 19.0f, 8.0f)
                curveTo(22.0f, 9.0f, 23.0f, 11.73f, 23.0f, 14.0f)
                lineTo(20.225f, 14.793f)
                curveTo(19.796f, 14.915f, 19.5f, 15.308f, 19.5f, 15.754f)
                verticalLineTo(17.25f)
                curveTo(19.5f, 18.216f, 18.716f, 19.0f, 17.75f, 19.0f)
                horizontalLineTo(17.154f)
                curveTo(16.483f, 19.0f, 15.856f, 19.337f, 15.486f, 19.896f)
                curveTo(14.558f, 21.299f, 13.396f, 22.0f, 12.0f, 22.0f)
                curveTo(10.604f, 22.0f, 9.442f, 21.299f, 8.514f, 19.896f)
                curveTo(8.144f, 19.337f, 7.517f, 19.0f, 6.846f, 19.0f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.0f, 4.5f, 18.216f, 4.5f, 17.25f)
                verticalLineTo(15.754f)
                curveTo(4.5f, 15.308f, 4.204f, 14.915f, 3.775f, 14.793f)
                lineTo(1.0f, 14.0f)
                curveTo(1.0f, 11.734f, 2.0f, 9.0f, 5.0f, 8.0f)
                curveTo(6.0f, 5.0f, 8.5f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(11.172f, 12.0f, 10.5f, 13.119f, 10.5f, 14.5f)
                curveTo(10.5f, 15.881f, 11.172f, 17.0f, 12.0f, 17.0f)
                curveTo(12.828f, 17.0f, 13.5f, 15.881f, 13.5f, 14.5f)
                curveTo(13.5f, 13.119f, 12.828f, 12.0f, 12.0f, 12.0f)
                close()
                moveTo(9.5f, 8.0f)
                curveTo(8.672f, 8.0f, 8.0f, 8.672f, 8.0f, 9.5f)
                curveTo(8.0f, 10.328f, 8.672f, 11.0f, 9.5f, 11.0f)
                curveTo(10.328f, 11.0f, 11.0f, 10.328f, 11.0f, 9.5f)
                curveTo(11.0f, 8.672f, 10.328f, 8.0f, 9.5f, 8.0f)
                close()
                moveTo(14.5f, 8.0f)
                curveTo(13.672f, 8.0f, 13.0f, 8.672f, 13.0f, 9.5f)
                curveTo(13.0f, 10.328f, 13.672f, 11.0f, 14.5f, 11.0f)
                curveTo(15.328f, 11.0f, 16.0f, 10.328f, 16.0f, 9.5f)
                curveTo(16.0f, 8.672f, 15.328f, 8.0f, 14.5f, 8.0f)
                close()
            }
        }
        .build()
        return _ghost2Fill!!
    }

private var _ghost2Fill: ImageVector? = null
