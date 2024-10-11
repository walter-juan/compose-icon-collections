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

public val SystemGroup.CloseLargeFill: ImageVector
    get() {
        if (_closeLargeFill != null) {
            return _closeLargeFill!!
        }
        _closeLargeFill = Builder(name = "CloseLargeFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.586f, 12.0f)
                lineTo(2.793f, 4.207f)
                lineTo(4.207f, 2.793f)
                lineTo(12.0f, 10.586f)
                lineTo(19.793f, 2.793f)
                lineTo(21.207f, 4.207f)
                lineTo(13.414f, 12.0f)
                lineTo(21.207f, 19.793f)
                lineTo(19.793f, 21.207f)
                lineTo(12.0f, 13.414f)
                lineTo(4.207f, 21.207f)
                lineTo(2.793f, 19.793f)
                lineTo(10.586f, 12.0f)
                close()
            }
        }
        .build()
        return _closeLargeFill!!
    }

private var _closeLargeFill: ImageVector? = null
