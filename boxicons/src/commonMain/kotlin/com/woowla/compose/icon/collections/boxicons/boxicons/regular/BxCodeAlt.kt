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

public val RegularGroup.BxCodeAlt: ImageVector
    get() {
        if (_bxCodeAlt != null) {
            return _bxCodeAlt!!
        }
        _bxCodeAlt = Builder(name = "BxCodeAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.375f, 16.781f)
                lineToRelative(1.25f, -1.562f)
                lineTo(4.601f, 12.0f)
                lineToRelative(4.024f, -3.219f)
                lineToRelative(-1.25f, -1.562f)
                lineToRelative(-5.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.562f)
                lineToRelative(5.0f, 4.0f)
                close()
                moveTo(16.625f, 7.219f)
                lineTo(15.375f, 8.781f)
                lineTo(19.399f, 12.0f)
                lineToRelative(-4.024f, 3.219f)
                lineToRelative(1.25f, 1.562f)
                lineToRelative(5.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.562f)
                lineToRelative(-5.0f, -4.0f)
                close()
                moveTo(14.976f, 3.216f)
                lineTo(10.976f, 21.216f)
                lineTo(9.023f, 20.782f)
                lineTo(13.023f, 2.782f)
                close()
            }
        }
        .build()
        return _bxCodeAlt!!
    }

private var _bxCodeAlt: ImageVector? = null
