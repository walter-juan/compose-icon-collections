package com.woowla.compose.icon.collections.remix.remix.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DocumentGroup

public val DocumentGroup.FileDamageLine: ImageVector
    get() {
        if (_fileDamageLine != null) {
            return _fileDamageLine!!
        }
        _fileDamageLine = Builder(name = "FileDamageLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.857f)
                lineTo(6.5f, 13.25f)
                lineTo(10.0f, 9.5f)
                lineTo(13.0f, 14.5f)
                lineTo(15.0f, 12.0f)
                lineTo(18.0f, 15.0f)
                lineTo(15.0f, 14.5f)
                lineTo(13.0f, 17.0f)
                lineTo(10.0f, 13.0f)
                lineTo(7.0f, 16.5f)
                lineTo(5.0f, 15.25f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(21.0f, 8.0f)
                verticalLineTo(20.993f)
                curveTo(21.0f, 21.55f, 20.555f, 22.0f, 20.007f, 22.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 22.0f, 3.0f, 21.556f, 3.0f, 21.008f)
                verticalLineTo(2.992f)
                curveTo(3.0f, 2.455f, 3.449f, 2.0f, 4.002f, 2.0f)
                horizontalLineTo(14.997f)
                lineTo(21.0f, 8.0f)
                close()
            }
        }
        .build()
        return _fileDamageLine!!
    }

private var _fileDamageLine: ImageVector? = null
