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

public val OutlineGroup.ServerStack: ImageVector
    get() {
        if (_serverStack != null) {
            return _serverStack!!
        }
        _serverStack = Builder(name = "ServerStack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.25f, 14.25f)
                horizontalLineTo(18.75f)
                moveTo(5.25f, 14.25f)
                curveTo(3.593f, 14.25f, 2.25f, 12.907f, 2.25f, 11.25f)
                moveTo(5.25f, 14.25f)
                curveTo(3.593f, 14.25f, 2.25f, 15.593f, 2.25f, 17.25f)
                curveTo(2.25f, 18.907f, 3.593f, 20.25f, 5.25f, 20.25f)
                horizontalLineTo(18.75f)
                curveTo(20.407f, 20.25f, 21.75f, 18.907f, 21.75f, 17.25f)
                curveTo(21.75f, 15.593f, 20.407f, 14.25f, 18.75f, 14.25f)
                moveTo(2.25f, 11.25f)
                curveTo(2.25f, 9.593f, 3.593f, 8.25f, 5.25f, 8.25f)
                horizontalLineTo(18.75f)
                curveTo(20.407f, 8.25f, 21.75f, 9.593f, 21.75f, 11.25f)
                moveTo(2.25f, 11.25f)
                curveTo(2.25f, 10.276f, 2.566f, 9.329f, 3.15f, 8.55f)
                lineTo(5.738f, 5.1f)
                curveTo(6.375f, 4.25f, 7.375f, 3.75f, 8.438f, 3.75f)
                horizontalLineTo(15.563f)
                curveTo(16.625f, 3.75f, 17.625f, 4.25f, 18.263f, 5.1f)
                lineTo(20.85f, 8.55f)
                curveTo(21.434f, 9.329f, 21.75f, 10.276f, 21.75f, 11.25f)
                moveTo(21.75f, 11.25f)
                curveTo(21.75f, 12.907f, 20.407f, 14.25f, 18.75f, 14.25f)
                moveTo(18.75f, 17.25f)
                horizontalLineTo(18.757f)
                verticalLineTo(17.257f)
                horizontalLineTo(18.75f)
                verticalLineTo(17.25f)
                close()
                moveTo(18.75f, 11.25f)
                horizontalLineTo(18.757f)
                verticalLineTo(11.257f)
                horizontalLineTo(18.75f)
                verticalLineTo(11.25f)
                close()
                moveTo(15.75f, 17.25f)
                horizontalLineTo(15.757f)
                verticalLineTo(17.257f)
                horizontalLineTo(15.75f)
                verticalLineTo(17.25f)
                close()
                moveTo(15.75f, 11.25f)
                horizontalLineTo(15.757f)
                verticalLineTo(11.257f)
                horizontalLineTo(15.75f)
                verticalLineTo(11.25f)
                close()
            }
        }
        .build()
        return _serverStack!!
    }

private var _serverStack: ImageVector? = null
