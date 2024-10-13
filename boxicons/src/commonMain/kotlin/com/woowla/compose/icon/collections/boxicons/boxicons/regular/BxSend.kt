package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxSend: ImageVector
    get() {
        if (_bxSend != null) {
            return _bxSend!!
        }
        _bxSend = Builder(name = "BxSend", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.426f, 11.095f)
                lineToRelative(-17.0f, -8.0f)
                arcTo(0.999f, 0.999f, 0.0f, false, false, 3.03f, 4.242f)
                lineTo(4.969f, 12.0f)
                lineTo(3.03f, 19.758f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, 1.396f, 1.147f)
                lineToRelative(17.0f, -8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.81f)
                close()
                moveTo(5.481f, 18.197f)
                lineToRelative(0.839f, -3.357f)
                lineTo(12.0f, 12.0f)
                lineTo(6.32f, 9.16f)
                lineToRelative(-0.839f, -3.357f)
                lineTo(18.651f, 12.0f)
                lineToRelative(-13.17f, 6.197f)
                close()
            }
        }
        .build()
        return _bxSend!!
    }

private var _bxSend: ImageVector? = null
