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

public val SystemGroup.DownloadFill: ImageVector
    get() {
        if (_downloadFill != null) {
            return _downloadFill!!
        }
        _downloadFill = Builder(name = "DownloadFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(13.0f, 9.0f)
                horizontalLineTo(20.0f)
                lineTo(12.0f, 17.0f)
                lineTo(4.0f, 9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _downloadFill!!
    }

private var _downloadFill: ImageVector? = null
