package com.woowla.compose.icon.collections.remix.remix.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DocumentGroup

public val DocumentGroup.FileMusicFill: ImageVector
    get() {
        if (_fileMusicFill != null) {
            return _fileMusicFill!!
        }
        _fileMusicFill = Builder(name = "FileMusicFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                lineTo(21.0f, 7.0f)
                verticalLineTo(21.008f)
                curveTo(21.0f, 21.556f, 20.555f, 22.0f, 20.007f, 22.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 22.0f, 3.0f, 21.545f, 3.0f, 21.008f)
                verticalLineTo(2.992f)
                curveTo(3.0f, 2.444f, 3.445f, 2.0f, 3.993f, 2.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(11.0f, 12.05f)
                curveTo(10.838f, 12.017f, 10.671f, 12.0f, 10.5f, 12.0f)
                curveTo(9.119f, 12.0f, 8.0f, 13.119f, 8.0f, 14.5f)
                curveTo(8.0f, 15.881f, 9.119f, 17.0f, 10.5f, 17.0f)
                curveTo(11.881f, 17.0f, 13.0f, 15.881f, 13.0f, 14.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.05f)
                close()
            }
        }
        .build()
        return _fileMusicFill!!
    }

private var _fileMusicFill: ImageVector? = null
