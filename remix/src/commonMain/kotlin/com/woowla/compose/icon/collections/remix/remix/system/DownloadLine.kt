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

public val SystemGroup.DownloadLine: ImageVector
    get() {
        if (_downloadLine != null) {
            return _downloadLine!!
        }
        _downloadLine = Builder(name = "DownloadLine", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(13.0f, 13.172f)
                lineTo(19.071f, 7.101f)
                lineTo(20.485f, 8.515f)
                lineTo(12.0f, 17.0f)
                lineTo(3.515f, 8.515f)
                lineTo(4.929f, 7.101f)
                lineTo(11.0f, 13.172f)
                verticalLineTo(2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.172f)
                close()
            }
        }
        .build()
        return _downloadLine!!
    }

private var _downloadLine: ImageVector? = null
