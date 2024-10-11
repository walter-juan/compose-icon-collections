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

public val BuildingsGroup.Building3Line: ImageVector
    get() {
        if (_building3Line != null) {
            return _building3Line!!
        }
        _building3Line = Builder(name = "Building3Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 10.111f)
                verticalLineTo(1.0f)
                lineTo(21.0f, 7.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                lineTo(10.0f, 10.111f)
                close()
                moveTo(12.0f, 4.369f)
                verticalLineTo(13.189f)
                lineTo(5.0f, 10.078f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.187f)
                lineTo(12.0f, 4.369f)
                close()
            }
        }
        .build()
        return _building3Line!!
    }

private var _building3Line: ImageVector? = null
