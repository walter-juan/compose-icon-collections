package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.MapPinTimeLine: ImageVector
    get() {
        if (_mapPinTimeLine != null) {
            return _mapPinTimeLine!!
        }
        _mapPinTimeLine = Builder(name = "MapPinTimeLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.95f, 15.95f)
                curveTo(19.683f, 13.216f, 19.683f, 8.784f, 16.95f, 6.05f)
                curveTo(14.216f, 3.317f, 9.784f, 3.317f, 7.05f, 6.05f)
                curveTo(4.317f, 8.784f, 4.317f, 13.216f, 7.05f, 15.95f)
                lineTo(12.0f, 20.899f)
                lineTo(16.95f, 15.95f)
                close()
                moveTo(12.0f, 23.728f)
                lineTo(5.636f, 17.364f)
                curveTo(2.121f, 13.849f, 2.121f, 8.151f, 5.636f, 4.636f)
                curveTo(9.151f, 1.121f, 14.849f, 1.121f, 18.364f, 4.636f)
                curveTo(21.879f, 8.151f, 21.879f, 13.849f, 18.364f, 17.364f)
                lineTo(12.0f, 23.728f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _mapPinTimeLine!!
    }

private var _mapPinTimeLine: ImageVector? = null
