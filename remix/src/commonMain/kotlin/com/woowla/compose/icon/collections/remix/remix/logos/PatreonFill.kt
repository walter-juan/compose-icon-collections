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

public val LogosGroup.PatreonFill: ImageVector
    get() {
        if (_patreonFill != null) {
            return _patreonFill!!
        }
        _patreonFill = Builder(name = "PatreonFill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(2.001f, 2.0f)
                horizontalLineTo(6.001f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.001f)
                verticalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _patreonFill!!
    }

private var _patreonFill: ImageVector? = null
