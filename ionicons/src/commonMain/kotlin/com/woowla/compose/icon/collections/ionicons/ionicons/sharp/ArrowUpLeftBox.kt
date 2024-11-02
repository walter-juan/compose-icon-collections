package com.woowla.compose.icon.collections.ionicons.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.SharpGroup

public val SharpGroup.ArrowUpLeftBox: ImageVector
    get() {
        if (_arrowUpLeftBox != null) {
            return _arrowUpLeftBox!!
        }
        _arrowUpLeftBox = Builder(name = "ArrowUpLeftBox", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(32.0f, 32.0f)
                lineTo(196.36f, 32.0f)
                lineTo(196.36f, 64.0f)
                lineTo(86.63f, 64.0f)
                lineTo(130.26f, 107.64f)
                horizontalLineTo(107.64f)
                verticalLineTo(130.26f)
                lineTo(64.0f, 86.63f)
                lineTo(64.0f, 196.36f)
                horizontalLineTo(32.0f)
                lineTo(32.0f, 32.0f)
                close()
                moveTo(296.0f, 318.63f)
                lineTo(107.64f, 130.26f)
                lineTo(107.64f, 480.0f)
                lineTo(480.0f, 480.0f)
                lineTo(480.0f, 107.64f)
                lineTo(130.26f, 107.64f)
                lineTo(318.63f, 296.0f)
                lineTo(296.0f, 318.63f)
                close()
            }
        }
        .build()
        return _arrowUpLeftBox!!
    }

private var _arrowUpLeftBox: ImageVector? = null
