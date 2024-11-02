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

public val SharpGroup.ArrowUpRightBox: ImageVector
    get() {
        if (_arrowUpRightBox != null) {
            return _arrowUpRightBox!!
        }
        _arrowUpRightBox = Builder(name = "ArrowUpRightBox", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(480.0f, 32.0f)
                lineTo(480.0f, 196.36f)
                horizontalLineTo(448.0f)
                lineTo(448.0f, 86.63f)
                lineTo(404.36f, 130.26f)
                verticalLineTo(107.64f)
                horizontalLineTo(381.74f)
                lineTo(425.37f, 64.0f)
                lineTo(315.64f, 64.0f)
                verticalLineTo(32.0f)
                lineTo(480.0f, 32.0f)
                close()
                moveTo(193.37f, 296.0f)
                lineTo(381.74f, 107.64f)
                lineTo(32.0f, 107.64f)
                lineTo(32.0f, 480.0f)
                horizontalLineTo(404.36f)
                verticalLineTo(130.26f)
                lineTo(216.0f, 318.63f)
                lineTo(193.37f, 296.0f)
                close()
            }
        }
        .build()
        return _arrowUpRightBox!!
    }

private var _arrowUpRightBox: ImageVector? = null
