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

public val MapGroup.RoadMapLine: ImageVector
    get() {
        if (_roadMapLine != null) {
            return _roadMapLine!!
        }
        _roadMapLine = Builder(name = "RoadMapLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.143f)
                verticalLineTo(18.967f)
                lineTo(9.065f, 16.796f)
                lineTo(15.065f, 19.796f)
                lineTo(20.0f, 17.681f)
                verticalLineTo(4.857f)
                lineTo(21.303f, 4.299f)
                curveTo(21.557f, 4.19f, 21.851f, 4.307f, 21.96f, 4.561f)
                curveTo(21.986f, 4.624f, 22.0f, 4.691f, 22.0f, 4.758f)
                verticalLineTo(19.0f)
                lineTo(15.0f, 22.0f)
                lineTo(9.0f, 19.0f)
                lineTo(2.697f, 21.701f)
                curveTo(2.443f, 21.81f, 2.149f, 21.692f, 2.04f, 21.439f)
                curveTo(2.014f, 21.376f, 2.0f, 21.309f, 2.0f, 21.242f)
                verticalLineTo(7.0f)
                lineTo(4.0f, 6.143f)
                close()
                moveTo(16.243f, 11.243f)
                lineTo(12.0f, 15.485f)
                lineTo(7.757f, 11.243f)
                curveTo(5.414f, 8.899f, 5.414f, 5.101f, 7.757f, 2.757f)
                curveTo(10.101f, 0.414f, 13.899f, 0.414f, 16.243f, 2.757f)
                curveTo(18.586f, 5.101f, 18.586f, 8.899f, 16.243f, 11.243f)
                close()
                moveTo(12.0f, 12.657f)
                lineTo(14.828f, 9.828f)
                curveTo(16.39f, 8.266f, 16.39f, 5.734f, 14.828f, 4.172f)
                curveTo(13.266f, 2.609f, 10.734f, 2.609f, 9.172f, 4.172f)
                curveTo(7.609f, 5.734f, 7.609f, 8.266f, 9.172f, 9.828f)
                lineTo(12.0f, 12.657f)
                close()
            }
        }
        .build()
        return _roadMapLine!!
    }

private var _roadMapLine: ImageVector? = null
