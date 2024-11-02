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

public val OutlineGroup.Server: ImageVector
    get() {
        if (_server != null) {
            return _server!!
        }
        _server = Builder(name = "Server", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.75f, 17.25f)
                verticalLineTo(17.022f)
                curveTo(21.75f, 16.675f, 21.71f, 16.329f, 21.63f, 15.992f)
                lineTo(19.362f, 6.352f)
                curveTo(19.003f, 4.827f, 17.643f, 3.75f, 16.077f, 3.75f)
                horizontalLineTo(7.923f)
                curveTo(6.357f, 3.75f, 4.996f, 4.827f, 4.638f, 6.352f)
                lineTo(2.37f, 15.992f)
                curveTo(2.29f, 16.329f, 2.25f, 16.675f, 2.25f, 17.022f)
                verticalLineTo(17.25f)
                moveTo(21.75f, 17.25f)
                curveTo(21.75f, 18.907f, 20.407f, 20.25f, 18.75f, 20.25f)
                horizontalLineTo(5.25f)
                curveTo(3.593f, 20.25f, 2.25f, 18.907f, 2.25f, 17.25f)
                moveTo(21.75f, 17.25f)
                curveTo(21.75f, 15.593f, 20.407f, 14.25f, 18.75f, 14.25f)
                horizontalLineTo(5.25f)
                curveTo(3.593f, 14.25f, 2.25f, 15.593f, 2.25f, 17.25f)
                moveTo(18.75f, 17.25f)
                horizontalLineTo(18.757f)
                verticalLineTo(17.257f)
                horizontalLineTo(18.75f)
                verticalLineTo(17.25f)
                close()
                moveTo(15.75f, 17.25f)
                horizontalLineTo(15.757f)
                verticalLineTo(17.257f)
                horizontalLineTo(15.75f)
                verticalLineTo(17.25f)
                close()
            }
        }
        .build()
        return _server!!
    }

private var _server: ImageVector? = null
