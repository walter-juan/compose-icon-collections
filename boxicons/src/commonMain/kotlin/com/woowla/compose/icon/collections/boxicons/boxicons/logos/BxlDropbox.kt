package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlDropbox: ImageVector
    get() {
        if (_bxlDropbox != null) {
            return _bxlDropbox!!
        }
        _bxlDropbox = Builder(name = "BxlDropbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.004f, 3.5f)
                lineTo(2.0f, 6.689f)
                lineToRelative(5.004f, 3.186f)
                lineToRelative(5.002f, -3.186f)
                close()
                moveTo(17.009f, 3.5f)
                lineTo(12.006f, 6.689f)
                lineTo(17.009f, 9.875f)
                lineTo(22.012f, 6.689f)
                close()
                moveTo(2.0f, 13.062f)
                lineToRelative(5.004f, 3.187f)
                lineToRelative(5.002f, -3.187f)
                lineToRelative(-5.002f, -3.187f)
                close()
                moveTo(17.009f, 9.875f)
                lineTo(12.006f, 13.062f)
                lineTo(17.009f, 16.249f)
                lineTo(22.012f, 13.062f)
                close()
                moveTo(7.004f, 17.311f)
                lineToRelative(5.002f, 3.189f)
                lineToRelative(5.003f, -3.189f)
                lineToRelative(-5.003f, -3.186f)
                close()
            }
        }
        .build()
        return _bxlDropbox!!
    }

private var _bxlDropbox: ImageVector? = null
