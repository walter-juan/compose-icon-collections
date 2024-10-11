package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.EyeLine: ImageVector
    get() {
        if (_eyeLine != null) {
            return _eyeLine!!
        }
        _eyeLine = Builder(name = "EyeLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(17.392f, 3.0f, 21.878f, 6.88f, 22.819f, 12.0f)
                curveTo(21.878f, 17.12f, 17.392f, 21.0f, 12.0f, 21.0f)
                curveTo(6.608f, 21.0f, 2.122f, 17.12f, 1.182f, 12.0f)
                curveTo(2.122f, 6.88f, 6.608f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveTo(16.236f, 19.0f, 19.86f, 16.052f, 20.778f, 12.0f)
                curveTo(19.86f, 7.948f, 16.236f, 5.0f, 12.0f, 5.0f)
                curveTo(7.765f, 5.0f, 4.14f, 7.948f, 3.223f, 12.0f)
                curveTo(4.14f, 16.052f, 7.765f, 19.0f, 12.0f, 19.0f)
                close()
                moveTo(12.0f, 16.5f)
                curveTo(9.515f, 16.5f, 7.5f, 14.485f, 7.5f, 12.0f)
                curveTo(7.5f, 9.515f, 9.515f, 7.5f, 12.0f, 7.5f)
                curveTo(14.486f, 7.5f, 16.5f, 9.515f, 16.5f, 12.0f)
                curveTo(16.5f, 14.485f, 14.486f, 16.5f, 12.0f, 16.5f)
                close()
                moveTo(12.0f, 14.5f)
                curveTo(13.381f, 14.5f, 14.5f, 13.381f, 14.5f, 12.0f)
                curveTo(14.5f, 10.619f, 13.381f, 9.5f, 12.0f, 9.5f)
                curveTo(10.62f, 9.5f, 9.5f, 10.619f, 9.5f, 12.0f)
                curveTo(9.5f, 13.381f, 10.62f, 14.5f, 12.0f, 14.5f)
                close()
            }
        }
        .build()
        return _eyeLine!!
    }

private var _eyeLine: ImageVector? = null
