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

public val OthersGroup.PlugLine: ImageVector
    get() {
        if (_plugLine != null) {
            return _plugLine!!
        }
        _plugLine = Builder(name = "PlugLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                verticalLineTo(7.0f)
                curveTo(4.0f, 6.448f, 4.448f, 6.0f, 5.0f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 6.0f, 20.0f, 6.448f, 20.0f, 7.0f)
                verticalLineTo(14.0f)
                curveTo(20.0f, 16.209f, 18.209f, 18.0f, 16.0f, 18.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(8.0f, 16.0f)
                horizontalLineTo(16.0f)
                curveTo(17.105f, 16.0f, 18.0f, 15.105f, 18.0f, 14.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                curveTo(6.0f, 15.105f, 6.895f, 16.0f, 8.0f, 16.0f)
                close()
                moveTo(18.0f, 8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(12.0f, 14.5f)
                curveTo(11.448f, 14.5f, 11.0f, 14.052f, 11.0f, 13.5f)
                curveTo(11.0f, 12.948f, 11.448f, 12.5f, 12.0f, 12.5f)
                curveTo(12.552f, 12.5f, 13.0f, 12.948f, 13.0f, 13.5f)
                curveTo(13.0f, 14.052f, 12.552f, 14.5f, 12.0f, 14.5f)
                close()
            }
        }
        .build()
        return _plugLine!!
    }

private var _plugLine: ImageVector? = null
