package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.PassportFill: ImageVector
    get() {
        if (_passportFill != null) {
            return _passportFill!!
        }
        _passportFill = Builder(name = "PassportFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                curveTo(20.552f, 2.0f, 21.0f, 2.448f, 21.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.552f, 20.552f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 22.0f, 3.0f, 21.552f, 3.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(3.0f, 2.448f, 3.448f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(16.0f, 16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveTo(9.791f, 6.0f, 8.0f, 7.791f, 8.0f, 10.0f)
                curveTo(8.0f, 12.209f, 9.791f, 14.0f, 12.0f, 14.0f)
                curveTo(14.209f, 14.0f, 16.0f, 12.209f, 16.0f, 10.0f)
                curveTo(16.0f, 7.791f, 14.209f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(13.105f, 8.0f, 14.0f, 8.895f, 14.0f, 10.0f)
                curveTo(14.0f, 11.105f, 13.105f, 12.0f, 12.0f, 12.0f)
                curveTo(10.895f, 12.0f, 10.0f, 11.105f, 10.0f, 10.0f)
                curveTo(10.0f, 8.895f, 10.895f, 8.0f, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _passportFill!!
    }

private var _passportFill: ImageVector? = null
