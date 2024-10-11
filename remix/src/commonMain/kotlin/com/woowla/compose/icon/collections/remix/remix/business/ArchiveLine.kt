package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.ArchiveLine: ImageVector
    get() {
        if (_archiveLine != null) {
            return _archiveLine!!
        }
        _archiveLine = Builder(name = "ArchiveLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 10.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.003f)
                curveTo(2.0f, 3.449f, 2.455f, 3.0f, 2.992f, 3.0f)
                horizontalLineTo(21.008f)
                curveTo(21.556f, 3.0f, 22.0f, 3.438f, 22.0f, 4.003f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.001f)
                curveTo(21.0f, 20.553f, 20.555f, 21.0f, 20.007f, 21.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 21.0f, 3.0f, 20.552f, 3.0f, 20.001f)
                verticalLineTo(10.0f)
                close()
                moveTo(19.0f, 10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(4.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(9.0f, 12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _archiveLine!!
    }

private var _archiveLine: ImageVector? = null
