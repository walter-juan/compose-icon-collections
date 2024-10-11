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

public val MapGroup.BarricadeLine: ImageVector
    get() {
        if (_barricadeLine != null) {
            return _barricadeLine!!
        }
        _barricadeLine = Builder(name = "BarricadeLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.493f, 19.0f)
                horizontalLineTo(17.507f)
                lineTo(16.84f, 16.0f)
                horizontalLineTo(7.16f)
                lineTo(6.493f, 19.0f)
                close()
                moveTo(19.556f, 19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.444f)
                lineTo(7.826f, 3.783f)
                curveTo(7.928f, 3.326f, 8.333f, 3.0f, 8.802f, 3.0f)
                horizontalLineTo(15.198f)
                curveTo(15.667f, 3.0f, 16.072f, 3.326f, 16.174f, 3.783f)
                lineTo(19.556f, 19.0f)
                close()
                moveTo(7.604f, 14.0f)
                horizontalLineTo(16.396f)
                lineTo(15.507f, 10.0f)
                horizontalLineTo(8.493f)
                lineTo(7.604f, 14.0f)
                close()
                moveTo(8.938f, 8.0f)
                horizontalLineTo(15.062f)
                lineTo(14.396f, 5.0f)
                horizontalLineTo(9.604f)
                lineTo(8.938f, 8.0f)
                close()
            }
        }
        .build()
        return _barricadeLine!!
    }

private var _barricadeLine: ImageVector? = null
