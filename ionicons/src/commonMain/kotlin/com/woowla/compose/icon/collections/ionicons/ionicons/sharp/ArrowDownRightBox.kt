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

public val SharpGroup.ArrowDownRightBox: ImageVector
    get() {
        if (_arrowDownRightBox != null) {
            return _arrowDownRightBox!!
        }
        _arrowDownRightBox = Builder(name = "ArrowDownRightBox", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(480.0f, 480.0f)
                lineTo(315.64f, 480.0f)
                verticalLineTo(448.0f)
                lineTo(425.37f, 448.0f)
                lineTo(381.74f, 404.36f)
                horizontalLineTo(404.36f)
                verticalLineTo(381.74f)
                lineTo(448.0f, 425.37f)
                lineTo(448.0f, 315.64f)
                horizontalLineTo(480.0f)
                lineTo(480.0f, 480.0f)
                close()
                moveTo(216.0f, 193.37f)
                lineTo(404.36f, 381.74f)
                lineTo(404.36f, 32.0f)
                lineTo(32.0f, 32.0f)
                verticalLineTo(404.36f)
                horizontalLineTo(381.74f)
                lineTo(193.37f, 216.0f)
                lineTo(216.0f, 193.37f)
                close()
            }
        }
        .build()
        return _arrowDownRightBox!!
    }

private var _arrowDownRightBox: ImageVector? = null
