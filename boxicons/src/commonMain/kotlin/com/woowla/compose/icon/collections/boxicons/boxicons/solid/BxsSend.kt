package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsSend: ImageVector
    get() {
        if (_bxsSend != null) {
            return _bxsSend!!
        }
        _bxsSend = Builder(name = "BxsSend", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.426f, 11.095f)
                lineToRelative(-17.0f, -8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.03f, 4.242f)
                lineToRelative(1.212f, 4.849f)
                lineTo(12.0f, 12.0f)
                lineToRelative(-7.758f, 2.909f)
                lineToRelative(-1.212f, 4.849f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, 1.396f, 1.147f)
                lineToRelative(17.0f, -8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.81f)
                close()
            }
        }
        .build()
        return _bxsSend!!
    }

private var _bxsSend: ImageVector? = null
