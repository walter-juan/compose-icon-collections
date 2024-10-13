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

public val RegularGroup.BxRewind: ImageVector
    get() {
        if (_bxRewind != null) {
            return _bxRewind!!
        }
        _bxRewind = Builder(name = "BxRewind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                lineTo(12.0f, 7.0f)
                lineToRelative(-7.0f, 5.0f)
                lineToRelative(7.0f, 5.0f)
                close()
                moveTo(19.0f, 7.0f)
                lineTo(12.0f, 12.0f)
                lineTo(19.0f, 17.0f)
                close()
            }
        }
        .build()
        return _bxRewind!!
    }

private var _bxRewind: ImageVector? = null
