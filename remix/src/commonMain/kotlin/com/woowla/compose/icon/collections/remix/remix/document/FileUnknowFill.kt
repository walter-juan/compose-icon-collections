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

public val DocumentGroup.FileUnknowFill: ImageVector
    get() {
        if (_fileUnknowFill != null) {
            return _fileUnknowFill!!
        }
        _fileUnknowFill = Builder(name = "FileUnknowFill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(11.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(13.0f, 13.355f)
                curveTo(14.446f, 12.925f, 15.5f, 11.585f, 15.5f, 10.0f)
                curveTo(15.5f, 8.067f, 13.933f, 6.5f, 12.0f, 6.5f)
                curveTo(10.302f, 6.5f, 8.886f, 7.709f, 8.567f, 9.313f)
                lineTo(10.529f, 9.706f)
                curveTo(10.666f, 9.018f, 11.272f, 8.5f, 12.0f, 8.5f)
                curveTo(12.828f, 8.5f, 13.5f, 9.172f, 13.5f, 10.0f)
                curveTo(13.5f, 10.828f, 12.828f, 11.5f, 12.0f, 11.5f)
                curveTo(11.448f, 11.5f, 11.0f, 11.948f, 11.0f, 12.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.355f)
                close()
            }
        }
        .build()
        return _fileUnknowFill!!
    }

private var _fileUnknowFill: ImageVector? = null
