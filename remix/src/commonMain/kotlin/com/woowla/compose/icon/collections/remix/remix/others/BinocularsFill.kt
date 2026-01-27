package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.BinocularsFill: ImageVector
    get() {
        if (_binocularsFill != null) {
            return _binocularsFill!!
        }
        _binocularsFill = Builder(name = "BinocularsFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.49f, 3.33f)
                curveTo(17.624f, 2.759f, 19.817f, 4.026f, 20.389f, 6.159f)
                lineTo(22.848f, 15.335f)
                curveTo(23.491f, 17.735f, 22.066f, 20.203f, 19.666f, 20.847f)
                curveTo(17.266f, 21.49f, 14.798f, 20.064f, 14.154f, 17.664f)
                curveTo(14.069f, 17.345f, 14.021f, 17.024f, 14.006f, 16.707f)
                curveTo(13.37f, 16.897f, 12.697f, 17.0f, 12.001f, 17.0f)
                curveTo(11.304f, 17.0f, 10.631f, 16.897f, 9.995f, 16.707f)
                curveTo(9.98f, 17.024f, 9.933f, 17.345f, 9.848f, 17.664f)
                curveTo(9.204f, 20.064f, 6.736f, 21.49f, 4.336f, 20.847f)
                curveTo(1.936f, 20.203f, 0.511f, 17.735f, 1.154f, 15.335f)
                lineTo(3.613f, 6.159f)
                curveTo(4.185f, 4.026f, 6.378f, 2.759f, 8.512f, 3.33f)
                curveTo(10.243f, 3.794f, 11.403f, 5.327f, 11.474f, 7.028f)
                curveTo(11.647f, 7.01f, 11.823f, 7.0f, 12.001f, 7.0f)
                curveTo(12.179f, 7.0f, 12.354f, 7.01f, 12.527f, 7.028f)
                curveTo(12.598f, 5.327f, 13.759f, 3.794f, 15.49f, 3.33f)
                close()
                moveTo(5.501f, 14.0f)
                curveTo(4.12f, 14.0f, 3.001f, 15.119f, 3.001f, 16.5f)
                curveTo(3.001f, 17.881f, 4.12f, 19.0f, 5.501f, 19.0f)
                curveTo(6.882f, 19.0f, 8.001f, 17.881f, 8.001f, 16.5f)
                curveTo(8.001f, 15.119f, 6.882f, 14.0f, 5.501f, 14.0f)
                close()
                moveTo(18.501f, 14.0f)
                curveTo(17.12f, 14.0f, 16.001f, 15.119f, 16.001f, 16.5f)
                curveTo(16.001f, 17.881f, 17.12f, 19.0f, 18.501f, 19.0f)
                curveTo(19.882f, 19.0f, 21.001f, 17.881f, 21.001f, 16.5f)
                curveTo(21.001f, 15.119f, 19.882f, 14.0f, 18.501f, 14.0f)
                close()
            }
        }
        .build()
        return _binocularsFill!!
    }

private var _binocularsFill: ImageVector? = null
