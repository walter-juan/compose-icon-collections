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

public val SharpGroup.ArrowDownLeftBox: ImageVector
    get() {
        if (_arrowDownLeftBox != null) {
            return _arrowDownLeftBox!!
        }
        _arrowDownLeftBox = Builder(name = "ArrowDownLeftBox", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(32.0f, 480.0f)
                lineTo(32.0f, 315.64f)
                lineTo(64.0f, 315.64f)
                lineTo(64.0f, 425.37f)
                lineTo(107.64f, 381.74f)
                lineTo(107.64f, 404.36f)
                lineTo(130.26f, 404.36f)
                lineTo(86.63f, 448.0f)
                lineTo(196.36f, 448.0f)
                lineTo(196.36f, 480.0f)
                lineTo(32.0f, 480.0f)
                close()
                moveTo(318.63f, 216.0f)
                lineTo(130.26f, 404.36f)
                lineTo(480.0f, 404.36f)
                lineTo(480.0f, 32.0f)
                lineTo(107.64f, 32.0f)
                lineTo(107.64f, 381.74f)
                lineTo(296.0f, 193.37f)
                lineTo(318.63f, 216.0f)
                close()
            }
        }
        .build()
        return _arrowDownLeftBox!!
    }

private var _arrowDownLeftBox: ImageVector? = null
