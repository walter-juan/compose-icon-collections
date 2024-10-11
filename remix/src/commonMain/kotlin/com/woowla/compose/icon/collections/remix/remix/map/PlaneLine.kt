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

public val MapGroup.PlaneLine: ImageVector
    get() {
        if (_planeLine != null) {
            return _planeLine!!
        }
        _planeLine = Builder(name = "PlaneLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 8.947f)
                lineTo(22.0f, 14.0f)
                verticalLineTo(16.0f)
                lineTo(14.0f, 13.474f)
                verticalLineTo(18.833f)
                lineTo(17.0f, 20.5f)
                verticalLineTo(22.0f)
                lineTo(12.5f, 21.0f)
                lineTo(8.0f, 22.0f)
                verticalLineTo(20.5f)
                lineTo(11.0f, 18.833f)
                verticalLineTo(13.474f)
                lineTo(3.0f, 16.0f)
                verticalLineTo(14.0f)
                lineTo(11.0f, 8.947f)
                verticalLineTo(3.5f)
                curveTo(11.0f, 2.672f, 11.672f, 2.0f, 12.5f, 2.0f)
                curveTo(13.328f, 2.0f, 14.0f, 2.672f, 14.0f, 3.5f)
                verticalLineTo(8.947f)
                close()
            }
        }
        .build()
        return _planeLine!!
    }

private var _planeLine: ImageVector? = null
