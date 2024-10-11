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

public val SystemGroup.DeleteBin2Fill: ImageVector
    get() {
        if (_deleteBin2Fill != null) {
            return _deleteBin2Fill!!
        }
        _deleteBin2Fill = Builder(name = "DeleteBin2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 6.0f)
                verticalLineTo(3.0f)
                curveTo(7.0f, 2.448f, 7.448f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 2.0f, 17.0f, 2.448f, 17.0f, 3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(21.0f)
                curveTo(20.0f, 21.552f, 19.552f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 22.0f, 4.0f, 21.552f, 4.0f, 21.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(13.414f, 14.0f)
                lineTo(15.182f, 12.232f)
                lineTo(13.768f, 10.818f)
                lineTo(12.0f, 12.585f)
                lineTo(10.232f, 10.818f)
                lineTo(8.818f, 12.232f)
                lineTo(10.586f, 14.0f)
                lineTo(8.818f, 15.767f)
                lineTo(10.232f, 17.182f)
                lineTo(12.0f, 15.414f)
                lineTo(13.768f, 17.182f)
                lineTo(15.182f, 15.767f)
                lineTo(13.414f, 14.0f)
                close()
                moveTo(9.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _deleteBin2Fill!!
    }

private var _deleteBin2Fill: ImageVector? = null