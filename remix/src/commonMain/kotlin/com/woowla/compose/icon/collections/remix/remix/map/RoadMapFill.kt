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

public val MapGroup.RoadMapFill: ImageVector
    get() {
        if (_roadMapFill != null) {
            return _roadMapFill!!
        }
        _roadMapFill = Builder(name = "RoadMapFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.95f, 11.95f)
                curveTo(18.735f, 10.165f, 19.354f, 7.656f, 18.808f, 5.368f)
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
                lineTo(5.129f, 5.659f)
                curveTo(4.7f, 7.866f, 5.341f, 10.24f, 7.05f, 11.95f)
                lineTo(12.0f, 16.899f)
                lineTo(16.95f, 11.95f)
                close()
                moveTo(15.535f, 10.535f)
                lineTo(12.0f, 14.071f)
                lineTo(8.464f, 10.535f)
                curveTo(6.512f, 8.583f, 6.512f, 5.417f, 8.464f, 3.464f)
                curveTo(10.417f, 1.512f, 13.583f, 1.512f, 15.535f, 3.464f)
                curveTo(17.488f, 5.417f, 17.488f, 8.583f, 15.535f, 10.535f)
                close()
            }
        }
        .build()
        return _roadMapFill!!
    }

private var _roadMapFill: ImageVector? = null
