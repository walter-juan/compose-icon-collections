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

public val SystemGroup.ImportFill: ImageVector
    get() {
        if (_importFill != null) {
            return _importFill!!
        }
        _importFill = Builder(name = "ImportFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 3.0f, 2.0f, 3.448f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.552f, 2.448f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 21.0f, 22.0f, 20.552f, 22.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 3.448f, 21.552f, 3.0f, 21.0f, 3.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveTo(10.343f, 16.0f, 9.0f, 14.657f, 9.0f, 13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 14.657f, 13.657f, 16.0f, 12.0f, 16.0f)
                close()
                moveTo(16.0f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                lineTo(12.0f, 13.5f)
                lineTo(16.0f, 9.0f)
                close()
            }
        }
        .build()
        return _importFill!!
    }

private var _importFill: ImageVector? = null
