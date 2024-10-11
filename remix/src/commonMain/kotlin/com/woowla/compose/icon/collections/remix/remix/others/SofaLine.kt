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

public val OthersGroup.SofaLine: ImageVector
    get() {
        if (_sofaLine != null) {
            return _sofaLine!!
        }
        _sofaLine = Builder(name = "SofaLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.001f, 3.0f)
                curveTo(5.687f, 3.0f, 3.001f, 5.686f, 3.001f, 9.0f)
                verticalLineTo(9.351f)
                curveTo(1.48f, 10.097f, 0.633f, 11.916f, 1.267f, 13.658f)
                lineTo(1.579f, 14.517f)
                curveTo(1.858f, 15.284f, 2.001f, 16.094f, 2.001f, 16.909f)
                verticalLineTo(19.5f)
                curveTo(2.001f, 20.328f, 2.672f, 21.0f, 3.501f, 21.0f)
                horizontalLineTo(20.501f)
                curveTo(21.329f, 21.0f, 22.001f, 20.328f, 22.001f, 19.5f)
                verticalLineTo(16.909f)
                curveTo(22.001f, 16.094f, 22.143f, 15.284f, 22.422f, 14.517f)
                lineTo(22.735f, 13.658f)
                curveTo(23.368f, 11.916f, 22.522f, 10.097f, 21.001f, 9.351f)
                verticalLineTo(9.0f)
                curveTo(21.001f, 5.686f, 18.314f, 3.0f, 15.001f, 3.0f)
                horizontalLineTo(9.001f)
                close()
                moveTo(19.001f, 9.032f)
                curveTo(17.306f, 9.262f, 16.001f, 10.714f, 16.001f, 12.472f)
                lineTo(16.001f, 14.0f)
                horizontalLineTo(8.001f)
                verticalLineTo(12.472f)
                curveTo(8.001f, 10.714f, 6.695f, 9.262f, 5.001f, 9.032f)
                verticalLineTo(9.0f)
                curveTo(5.001f, 6.791f, 6.792f, 5.0f, 9.001f, 5.0f)
                horizontalLineTo(15.001f)
                curveTo(17.21f, 5.0f, 19.001f, 6.791f, 19.001f, 9.0f)
                verticalLineTo(9.032f)
                close()
                moveTo(16.001f, 16.0f)
                lineTo(16.001f, 17.0f)
                horizontalLineTo(18.001f)
                verticalLineTo(12.472f)
                curveTo(18.001f, 11.659f, 18.66f, 11.0f, 19.472f, 11.0f)
                curveTo(20.493f, 11.0f, 21.204f, 12.015f, 20.855f, 12.974f)
                lineTo(20.542f, 13.834f)
                curveTo(20.184f, 14.819f, 20.001f, 15.86f, 20.001f, 16.909f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.001f)
                verticalLineTo(16.909f)
                curveTo(4.001f, 15.86f, 3.817f, 14.819f, 3.459f, 13.834f)
                lineTo(3.146f, 12.974f)
                curveTo(2.797f, 12.015f, 3.508f, 11.0f, 4.529f, 11.0f)
                curveTo(5.342f, 11.0f, 6.001f, 11.659f, 6.001f, 12.472f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.001f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.001f)
                close()
            }
        }
        .build()
        return _sofaLine!!
    }

private var _sofaLine: ImageVector? = null
