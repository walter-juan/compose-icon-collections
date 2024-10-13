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

public val RegularGroup.BxX: ImageVector
    get() {
        if (_bxX != null) {
            return _bxX!!
        }
        _bxX = Builder(name = "BxX", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.192f, 6.344f)
                lineToRelative(-4.243f, 4.242f)
                lineToRelative(-4.242f, -4.242f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(10.535f, 12.0f)
                lineToRelative(-4.242f, 4.242f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(4.242f, -4.242f)
                lineToRelative(4.243f, 4.242f)
                lineToRelative(1.414f, -1.414f)
                lineTo(13.364f, 12.0f)
                lineToRelative(4.242f, -4.242f)
                close()
            }
        }
        .build()
        return _bxX!!
    }

private var _bxX: ImageVector? = null
