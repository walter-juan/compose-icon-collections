package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.Plug2Fill: ImageVector
    get() {
        if (_plug2Fill != null) {
            return _plug2Fill!!
        }
        _plug2Fill = Builder(name = "Plug2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                curveTo(11.895f, 22.0f, 11.0f, 21.105f, 11.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                curveTo(5.791f, 18.0f, 4.0f, 16.209f, 4.0f, 14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.0f)
                curveTo(20.0f, 16.209f, 18.209f, 18.0f, 16.0f, 18.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(17.0f, 6.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 6.0f, 20.0f, 6.448f, 20.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                curveTo(4.0f, 6.448f, 4.448f, 6.0f, 5.0f, 6.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(12.0f, 14.5f)
                curveTo(12.552f, 14.5f, 13.0f, 14.052f, 13.0f, 13.5f)
                curveTo(13.0f, 12.948f, 12.552f, 12.5f, 12.0f, 12.5f)
                curveTo(11.448f, 12.5f, 11.0f, 12.948f, 11.0f, 13.5f)
                curveTo(11.0f, 14.052f, 11.448f, 14.5f, 12.0f, 14.5f)
                close()
                moveTo(11.0f, 2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _plug2Fill!!
    }

private var _plug2Fill: ImageVector? = null
