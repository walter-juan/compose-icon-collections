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

public val DocumentGroup.FileDamageFill: ImageVector
    get() {
        if (_fileDamageFill != null) {
            return _fileDamageFill!!
        }
        _fileDamageFill = Builder(name = "FileDamageFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 14.0f)
                lineTo(7.0f, 16.5f)
                lineTo(10.0f, 13.0f)
                lineTo(13.0f, 17.0f)
                lineTo(15.0f, 14.5f)
                lineTo(18.0f, 15.0f)
                lineTo(15.0f, 12.0f)
                lineTo(13.0f, 14.5f)
                lineTo(10.0f, 9.5f)
                lineTo(6.5f, 13.25f)
                lineTo(3.0f, 10.0f)
                verticalLineTo(2.992f)
                curveTo(3.0f, 2.455f, 3.447f, 2.0f, 3.998f, 2.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.0f)
                curveTo(14.0f, 8.552f, 14.448f, 9.0f, 15.0f, 9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.993f)
                curveTo(21.0f, 21.551f, 20.555f, 22.0f, 20.007f, 22.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 22.0f, 3.0f, 21.556f, 3.0f, 21.008f)
                verticalLineTo(14.0f)
                close()
                moveTo(21.0f, 7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(2.003f)
                lineTo(21.0f, 7.0f)
                close()
            }
        }
        .build()
        return _fileDamageFill!!
    }

private var _fileDamageFill: ImageVector? = null
