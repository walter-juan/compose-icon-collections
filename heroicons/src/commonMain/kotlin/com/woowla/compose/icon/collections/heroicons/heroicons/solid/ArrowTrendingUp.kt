package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.ArrowTrendingUp: ImageVector
    get() {
        if (_arrowTrendingUp != null) {
            return _arrowTrendingUp!!
        }
        _arrowTrendingUp = Builder(name = "ArrowTrendingUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.219f, 6.268f)
                curveTo(15.368f, 5.881f, 15.802f, 5.688f, 16.188f, 5.837f)
                lineTo(22.13f, 8.117f)
                curveTo(22.315f, 8.188f, 22.465f, 8.331f, 22.546f, 8.512f)
                curveTo(22.627f, 8.694f, 22.632f, 8.9f, 22.561f, 9.086f)
                lineTo(20.28f, 15.027f)
                curveTo(20.132f, 15.414f, 19.698f, 15.607f, 19.312f, 15.459f)
                curveTo(18.925f, 15.31f, 18.732f, 14.877f, 18.88f, 14.49f)
                lineTo(20.512f, 10.239f)
                lineTo(19.425f, 10.723f)
                curveTo(16.972f, 11.815f, 15.104f, 13.676f, 13.975f, 15.896f)
                curveTo(13.866f, 16.11f, 13.661f, 16.259f, 13.424f, 16.297f)
                curveTo(13.187f, 16.335f, 12.946f, 16.257f, 12.776f, 16.087f)
                lineTo(9.0f, 12.311f)
                lineTo(2.78f, 18.53f)
                curveTo(2.487f, 18.823f, 2.013f, 18.823f, 1.72f, 18.53f)
                curveTo(1.427f, 18.237f, 1.427f, 17.763f, 1.72f, 17.47f)
                lineTo(8.47f, 10.72f)
                curveTo(8.61f, 10.579f, 8.801f, 10.5f, 9.0f, 10.5f)
                curveTo(9.199f, 10.5f, 9.39f, 10.579f, 9.53f, 10.72f)
                lineTo(13.136f, 14.326f)
                curveTo(14.437f, 12.205f, 16.371f, 10.441f, 18.815f, 9.352f)
                lineTo(19.902f, 8.869f)
                lineTo(15.651f, 7.237f)
                curveTo(15.264f, 7.088f, 15.071f, 6.655f, 15.219f, 6.268f)
                close()
            }
        }
        .build()
        return _arrowTrendingUp!!
    }

private var _arrowTrendingUp: ImageVector? = null
