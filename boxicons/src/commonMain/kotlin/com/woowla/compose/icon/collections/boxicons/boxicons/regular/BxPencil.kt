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

public val RegularGroup.BxPencil: ImageVector
    get() {
        if (_bxPencil != null) {
            return _bxPencil!!
        }
        _bxPencil = Builder(name = "BxPencil", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.24f, 0.0f)
                lineToRelative(4.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.47f, -0.26f)
                lineTo(21.0f, 7.41f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -2.82f)
                lineTo(19.42f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.83f, 0.0f)
                lineTo(4.3f, 15.29f)
                arcToRelative(1.06f, 1.06f, 0.0f, false, false, -0.27f, 0.47f)
                lineToRelative(-1.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.76f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 21.0f)
                close()
                moveTo(18.0f, 4.41f)
                lineTo(19.59f, 6.0f)
                lineTo(18.0f, 7.59f)
                lineTo(16.42f, 6.0f)
                close()
                moveTo(5.91f, 16.51f)
                lineTo(15.0f, 7.41f)
                lineTo(16.59f, 9.0f)
                lineToRelative(-9.1f, 9.1f)
                lineToRelative(-2.11f, 0.52f)
                close()
            }
        }
        .build()
        return _bxPencil!!
    }

private var _bxPencil: ImageVector? = null
