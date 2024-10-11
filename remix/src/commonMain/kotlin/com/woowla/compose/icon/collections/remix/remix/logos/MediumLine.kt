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

public val LogosGroup.MediumLine: ImageVector
    get() {
        if (_mediumLine != null) {
            return _mediumLine!!
        }
        _mediumLine = Builder(name = "MediumLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 7.0f)
                curveTo(5.239f, 7.0f, 3.0f, 9.239f, 3.0f, 12.0f)
                curveTo(3.0f, 14.761f, 5.239f, 17.0f, 8.0f, 17.0f)
                curveTo(10.761f, 17.0f, 13.0f, 14.761f, 13.0f, 12.0f)
                curveTo(13.0f, 9.239f, 10.761f, 7.0f, 8.0f, 7.0f)
                close()
                moveTo(8.0f, 5.0f)
                curveTo(10.416f, 5.0f, 12.546f, 6.224f, 13.804f, 8.086f)
                curveTo(13.815f, 8.063f, 13.826f, 8.04f, 13.838f, 8.017f)
                curveTo(14.343f, 7.006f, 15.227f, 6.0f, 16.5f, 6.0f)
                curveTo(17.681f, 6.0f, 18.527f, 6.866f, 19.047f, 7.798f)
                curveTo(19.086f, 7.747f, 19.126f, 7.698f, 19.168f, 7.651f)
                curveTo(19.456f, 7.326f, 19.904f, 7.0f, 20.5f, 7.0f)
                curveTo(21.096f, 7.0f, 21.544f, 7.326f, 21.832f, 7.651f)
                curveTo(22.122f, 7.977f, 22.337f, 8.393f, 22.497f, 8.82f)
                curveTo(22.82f, 9.683f, 23.0f, 10.807f, 23.0f, 12.0f)
                curveTo(23.0f, 13.193f, 22.82f, 14.317f, 22.497f, 15.18f)
                curveTo(22.337f, 15.607f, 22.122f, 16.022f, 21.832f, 16.349f)
                curveTo(21.544f, 16.674f, 21.096f, 17.0f, 20.5f, 17.0f)
                curveTo(19.904f, 17.0f, 19.456f, 16.674f, 19.168f, 16.349f)
                curveTo(19.126f, 16.302f, 19.086f, 16.253f, 19.047f, 16.202f)
                curveTo(18.527f, 17.134f, 17.681f, 18.0f, 16.5f, 18.0f)
                curveTo(15.227f, 18.0f, 14.343f, 16.994f, 13.838f, 15.983f)
                curveTo(13.826f, 15.96f, 13.815f, 15.937f, 13.804f, 15.914f)
                curveTo(12.546f, 17.776f, 10.416f, 19.0f, 8.0f, 19.0f)
                curveTo(4.134f, 19.0f, 1.0f, 15.866f, 1.0f, 12.0f)
                curveTo(1.0f, 8.134f, 4.134f, 5.0f, 8.0f, 5.0f)
                close()
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 12.913f, 20.08f, 13.933f, 20.5f, 14.764f)
                curveTo(20.92f, 13.933f, 21.0f, 12.913f, 21.0f, 12.0f)
                curveTo(21.0f, 11.087f, 20.92f, 10.067f, 20.5f, 9.236f)
                curveTo(20.08f, 10.067f, 20.0f, 11.087f, 20.0f, 12.0f)
                close()
                moveTo(18.0f, 12.0f)
                curveTo(18.0f, 11.24f, 17.787f, 8.0f, 16.5f, 8.0f)
                curveTo(15.213f, 8.0f, 15.0f, 11.24f, 15.0f, 12.0f)
                curveTo(15.0f, 12.76f, 15.213f, 16.0f, 16.5f, 16.0f)
                curveTo(17.787f, 16.0f, 18.0f, 12.76f, 18.0f, 12.0f)
                close()
            }
        }
        .build()
        return _mediumLine!!
    }

private var _mediumLine: ImageVector? = null
