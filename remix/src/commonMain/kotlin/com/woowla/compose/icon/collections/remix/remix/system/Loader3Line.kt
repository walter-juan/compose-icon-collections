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

public val SystemGroup.Loader3Line: ImageVector
    get() {
        if (_loader3Line != null) {
            return _loader3Line!!
        }
        _loader3Line = Builder(name = "Loader3Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.055f, 13.0f)
                horizontalLineTo(5.071f)
                curveTo(5.556f, 16.392f, 8.473f, 19.0f, 12.0f, 19.0f)
                curveTo(15.526f, 19.0f, 18.444f, 16.392f, 18.929f, 13.0f)
                horizontalLineTo(20.945f)
                curveTo(20.447f, 17.5f, 16.632f, 21.0f, 12.0f, 21.0f)
                curveTo(7.367f, 21.0f, 3.552f, 17.5f, 3.055f, 13.0f)
                close()
                moveTo(3.055f, 11.0f)
                curveTo(3.552f, 6.5f, 7.367f, 3.0f, 12.0f, 3.0f)
                curveTo(16.632f, 3.0f, 20.447f, 6.5f, 20.945f, 11.0f)
                horizontalLineTo(18.929f)
                curveTo(18.444f, 7.608f, 15.526f, 5.0f, 12.0f, 5.0f)
                curveTo(8.473f, 5.0f, 5.556f, 7.608f, 5.071f, 11.0f)
                horizontalLineTo(3.055f)
                close()
            }
        }
        .build()
        return _loader3Line!!
    }

private var _loader3Line: ImageVector? = null
