package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 6.75f)
                verticalLineTo(15.0f)
                moveTo(15.0f, 9.0f)
                verticalLineTo(17.25f)
                moveTo(15.503f, 20.749f)
                lineTo(20.378f, 18.311f)
                curveTo(20.759f, 18.12f, 21.0f, 17.731f, 21.0f, 17.305f)
                verticalLineTo(4.82f)
                curveTo(21.0f, 3.984f, 20.12f, 3.44f, 19.372f, 3.814f)
                lineTo(15.503f, 5.748f)
                curveTo(15.186f, 5.907f, 14.814f, 5.907f, 14.497f, 5.748f)
                lineTo(9.503f, 3.252f)
                curveTo(9.186f, 3.093f, 8.814f, 3.093f, 8.497f, 3.252f)
                lineTo(3.622f, 5.689f)
                curveTo(3.241f, 5.88f, 3.0f, 6.269f, 3.0f, 6.695f)
                verticalLineTo(19.18f)
                curveTo(3.0f, 20.016f, 3.88f, 20.56f, 4.628f, 20.186f)
                lineTo(8.497f, 18.252f)
                curveTo(8.814f, 18.093f, 9.186f, 18.093f, 9.503f, 18.252f)
                lineTo(14.497f, 20.749f)
                curveTo(14.814f, 20.907f, 15.186f, 20.907f, 15.503f, 20.749f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
