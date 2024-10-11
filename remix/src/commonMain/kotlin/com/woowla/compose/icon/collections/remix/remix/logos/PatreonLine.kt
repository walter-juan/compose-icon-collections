package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.PatreonLine: ImageVector
    get() {
        if (_patreonLine != null) {
            return _patreonLine!!
        }
        _patreonLine = Builder(name = "PatreonLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.001f, 17.0f)
                curveTo(10.859f, 17.0f, 7.501f, 13.642f, 7.501f, 9.5f)
                curveTo(7.501f, 5.358f, 10.859f, 2.0f, 15.001f, 2.0f)
                curveTo(19.143f, 2.0f, 22.501f, 5.358f, 22.501f, 9.5f)
                curveTo(22.501f, 13.642f, 19.143f, 17.0f, 15.001f, 17.0f)
                close()
                moveTo(15.001f, 15.0f)
                curveTo(18.038f, 15.0f, 20.501f, 12.538f, 20.501f, 9.5f)
                curveTo(20.501f, 6.462f, 18.038f, 4.0f, 15.001f, 4.0f)
                curveTo(11.963f, 4.0f, 9.501f, 6.462f, 9.501f, 9.5f)
                curveTo(9.501f, 12.538f, 11.963f, 15.0f, 15.001f, 15.0f)
                close()
                moveTo(2.001f, 2.0f)
                horizontalLineTo(7.001f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.001f)
                verticalLineTo(2.0f)
                close()
                moveTo(4.001f, 4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.001f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.001f)
                close()
            }
        }
        .build()
        return _patreonLine!!
    }

private var _patreonLine: ImageVector? = null
