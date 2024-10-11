package com.woowla.compose.icon.collections.remix.remix.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BuildingsGroup

public val BuildingsGroup.Building2Line: ImageVector
    get() {
        if (_building2Line != null) {
            return _building2Line!!
        }
        _building2Line = Builder(name = "Building2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 19.0f)
                verticalLineTo(5.7f)
                curveTo(3.0f, 5.28f, 3.263f, 4.904f, 3.658f, 4.761f)
                lineTo(13.329f, 1.244f)
                curveTo(13.589f, 1.15f, 13.875f, 1.283f, 13.97f, 1.543f)
                curveTo(13.99f, 1.598f, 14.0f, 1.656f, 14.0f, 1.714f)
                verticalLineTo(6.667f)
                lineTo(20.316f, 8.772f)
                curveTo(20.725f, 8.908f, 21.0f, 9.29f, 21.0f, 9.721f)
                verticalLineTo(19.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(5.0f, 19.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(3.855f)
                lineTo(5.0f, 6.401f)
                verticalLineTo(19.0f)
                close()
                moveTo(19.0f, 19.0f)
                verticalLineTo(10.442f)
                lineTo(14.0f, 8.775f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _building2Line!!
    }

private var _building2Line: ImageVector? = null
